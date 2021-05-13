-- question2: lấy ra tất cả các phòng ban

SELECT 	*
FROM 	Department;


-- question3: lấy ra id của phòng ban "Sale"

SELECT 	*
FROM 	Department
WHERE 	Department_id = 1;


-- question4: lấy ra thông tin account có full name dài nhất

SELECT 		*, length(FullName)
FROM 		`Account`
WHERE 		length(FullName) >20;


-- question5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id =3 
 
SELECT 		*, length(FullName)
FROM 		`Account`
WHERE 		length(FullName) >20 AND Department_id = 4 ;


-- question6:Lấy ra tên group đã tham gia trước ngày 12/05/2021


SELECT 		group_name
FROM 		`Group`
WHERE 		create_date < '2021/05/12';


-- Question 7: Lấy ra ID của question có >= 4 câu trả lời 

SELECT 	*
FROM 	Question
WHERE 	question_id >= 4;


-- Question 8: Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 12/05/2021

SELECT 	`code`
FROM 	Exam
WHERE 	create_date < '2021/05/12';


-- Question 9: Lấy ra 5 group được tạo gần đây nhất

SELECT 		*
FROM 		`Group`
ORDER BY	create_date DESC
LIMIT 		5;


-- Question 10: Đếm số nhân viên thuộc department có id = 4

SELECT 	*
FROM 	`Account`
WHERE 	Department_id = 4;


-- Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "N" và kết thúc bằng chữ "g" 

SELECT 	FullName
FROM 	`Account`
WHERE	FullName LIKE 'N%g';


-- Question 12: Xóa tất cả các exam được tạo trước ngày 12/05/2021

DELETE
FROM 		Exam
WHERE 		create_date < '2021/05/12';


--  Question 13: Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi"

DELETE
FROM 		Question
WHERE 		content LIKE 'câu_hỏi%';


-- Question 14: Update thông tin của account có id = 3 thành tên "OanhOanh" và email thành oanhdo@gmail.com

UPDATE 		`Account`
SET 		Email = "oanhdo@gmail.com",
			UseName = "OanhOanh"
WHERE 		account_id = 3;


-- Question 15: update account có id = 5 sẽ thuộc group có id = 4

UPDATE 		GroupAccount
SET 		account_id = 5
WHERE 		group_id= 4; 

--  e có sửa lại 1 số phần về ngày tháng trong câu hỏi cho trùng với data của em để test luôn cho ok a nhé!!


