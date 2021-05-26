DROP DATABASE IF EXISTS quanlythuctapsinh;
CREATE DATABASE quanlythuctapsinh;
USE quanlythuctapsinh;

DROP TABLE IF EXISTS GiangVien;
CREATE TABLE GiangVien(
	Magv 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    HoTen 			NVARCHAR(50) NOT NULL,
    Luong			INT NOT NULL
);

DROP TABLE IF EXISTS SinhVien;
CREATE TABLE SinhVien(
	Masv 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    HoTen 			NVARCHAR(50) NOT NULL,
    NamSinh			INT NOT NULL,
    QueQuan			NVARCHAR(100) NOT NULL
);

DROP TABLE IF EXISTS DeTai;
CREATE TABLE DeTai(
	Madt 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Tendt			NVARCHAR(50) NOT NULL,
    Kinhphi			INT NOT NULL,
    Noithuctap		NVARCHAR(100) NOT NULL
);

DROP TABLE IF EXISTS HuongDan;
CREATE TABLE HuongDan(
	ID	 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Masv			TINYINT UNSIGNED NOT NULL,
    Madt			TINYINT UNSIGNED ,
    Magv			TINYINT UNSIGNED NOT NULL,
    Ketqua			NVARCHAR(100),
    FOREIGN KEY (Masv) REFERENCES Masv(SinhVien),
    FOREIGN KEY (Magv) REFERENCES Magv(GiangVien),
    FOREIGN KEY (Madt) REFERENCES Madt(Detai)
);


-- ----------\\ INSERT DATA //---------------
-- INSERT giang vien
INSERT INTO GiangVien	(  HoTen				, Luong	 )
VALUES 					( 'Bùi Xuân Huấn'		,1000000),
						('Nguyễn Tiến Bịp'		,1000000),
						('Nguyễn Phương Hằng'	,1000000); 
                        
-- INSERT Sinh Vien
INSERT INTO SinhVien	(  HoTen				, NamSinh		, QueQuan)
VALUES 					( 'Mai Siêu Phong'		,1999			,'Đông Anh-Hà Nội'),
						('Nguyễn Duy Mạnh'		,1997			,'Đông Anh-Hà Nội'),
						('Nguyễn Mai Thúy'		,1995			,'Đông Anh-Hà Nội'); 
                        
-- INSERT DeTai
INSERT INTO DeTai		(	Tendt					, Kinhphi		, Noithuctap	)
VALUES 					(	'Cổ mộ'					,100000000	,'Đông Anh-Hà Nội'),
						(	'CONG NGHE SINH HOC'	,100000000	,'Đông Anh-Hà Nội'),
						(	'Đồ sơn'				,100000000	,'Long Biên-Hà Nội'); 
                        
-- INSERT HuongDan
INSERT INTO HuongDan	(  Masv	, Madt	, Magv	, Ketqua	)
VALUES 					(	1	, 2		, 3		,'OK baby'),
						(	2	, NUll	, 2		,'OK OK'),
						(	3	, 1		, 1		,'OK boy'); 
                        
                        
-- -- -- -- 2 viet lenh-------
 -- a) Lấy tất cả các sinh viên chưa có đề tài hướng dẫn
 SELECT 	*
 FROM		SinhVien sv
 JOIN		HuongDan hd ON sv.Masv = hd.Masv
 WHERE		hd.Madt IS NULL;
 
 -- b) Lấy ra số sinh viên làm đề tài ‘CONG NGHE SINH HOC’
 SELECT 	COUNT(*)
 FROM		SinhVien sv
 JOIN		HuongDan hd ON sv.Masv = hd.Masv
 JOIN		Detai dt ON dt.Madt = hd.Madt
 WHERE		dt.Tendt = 'CONG NGHE SINH HOC';
 
 -- 3. Tạo view có tên là "SinhVienInfo" lấy các thông tin về học sinh bao gồm: mã số, họ tên và tên đề tài
-- (Nếu sinh viên chưa có đề tài thì column tên đề tài sẽ in ra "Chưa có")


CREATE OR REPLACE VIEW  SinhVienInfo as
SELECT sv.Masv,sv.Hoten,dt.Tendt,
CASE 
WHEN Tendt IS NULL THEN 'Chưa có'
END
FROM HuongDan hd
LEFT JOIN SinhVien Sv ON Sv.Masv=hd.Masv
LEFT JOIN DeTai dt ON dt.Madt=hd.Madt;
    
-- 4. Tạo trigger cho table SinhVien khi insert sinh viên có năm sinh <= 1900 thì hiện ra thông báo "năm sinh phải > 1900"
DROP TRIGGER IF EXISTS Trigger_SinhVien;
DELIMITER $$	
	CREATE TRIGGER		Trigger_SinhVien
    BEFORE INSERT ON	SinhVien
    FOR EACH ROW
    BEGIN
		IF NEW.NamSinh <= 1990 THEN
			SIGNAL SQLSTATE '12345' 
            SET MESSAGE_TEXT = "năm sinh phải > 1900";
		END IF;
    END $$
DELIMITER ; 
INSERT INTO SinhVien	(  HoTen				, NamSinh		, QueQuan)
VALUES 					( 'Lệnh Hồ Sung'		,1988	,'Đông Anh-Hà Nội');
SELECT * FROM SinhVien;

-- 5. Hãy cấu hình table sao cho khi xóa 1 sinh viên nào đó thì sẽ tất cả thông
-- tin trong table HuongDan liên quan tới sinh viên đó sẽ bị xóa đi
DROP PROCEDURE IF EXISTS	xoa1sv;
DELIMITER $$
CREATE PROCEDURE	xoa1sv()
	BEGIN
		SELECT		*
        FROM		SinhVien
        JOIN 		HuongDan;
    END	$$
DELIMITER ;
CALL	xoa1sv();