-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó 
DROP PROCEDURE IF EXISTS	getDepartmentOfAccount;
DELIMITER $$
CREATE PROCEDURE	getDepartmentOfAccount(IN Department_Name VARCHAR(100))
	BEGIN
		SELECT		*
        FROM		Department 
        JOIN		`Account`  USING (DepartmentID)
        WHERE		DepartmentName = Department_Name;
    END	$$
DELIMITER ;
CALL getDepartmentOfAccount('Marketing');

-- Question 2: Tạo store để in ra số lượng account trong mỗi group
DROP PROCEDURE IF EXISTS	getAccountOfGroup;
DELIMITER $$
CREATE PROCEDURE	getAccountOfGroup(IN Group_ID INT)
	BEGIN
		SELECT		GroupID, COUNT(AccountID)
        FROM		GroupAccount
        WHERE		GroupID = Group_ID;
    END	$$
DELIMITER ;
CALL	getAccountOfGroup(3);

--   Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại
DROP PROCEDURE IF EXISTS	getTypeQuestionOfQuestion;
DELIMITER $$
CREATE PROCEDURE	getTypeQuestionOfQuestion(IN Type_ID INT)
	BEGIN
		SELECT		TQ.TypeName, Q.CreateDate, COUNT(QuestionID)
        FROM		TypeQuestion TQ
        JOIN		Question Q ON TQ.TypeID = Q.TypeID
        WHERE		TQ.TypeID = Type_ID ;
    END	$$
DELIMITER ;
CAlL	getTypeQuestionOfQuestion(1);

--  Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
DROP PROCEDURE IF EXISTS	getTypeQuestionMaxQuestion;
DELIMITER $$
CREATE PROCEDURE	getTypeQuestionMaxQuestion(IN Type_ID_MaxQuestion INT )
	BEGIN
		SELECT		*, COUNT(Q.QuestionID)
        FROM		TypeQuestion TQ
        JOIN		Question Q ON TQ.TypeID = Q.TypeID
        WHERE		Q.TypeID = Type_ID_MaxQuestion
        GROUP BY	TQ.TypeID
		HAVING		COUNT(Q.QuestionID) = (	SELECT		COUNT(Q.QuestionID)
											FROM		Question Q 
                                            JOIN		TypeQuestion TQ ON Q.TypeID = TQ.TypeID
                                            GROUP BY	TQ.TypeID
                                            ORDER BY	COUNT(Q.QuestionID) DESC
                                            LIMIT		1
                                            );
    END	$$
DELIMITER ;
CALL	getTypeQuestionMaxQuestion(1);

--  Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
DROP PROCEDURE IF EXISTS	getTypeQuestionMaxQuestion;
DELIMITER $$
CREATE PROCEDURE	getTypeQuestionMaxQuestion(IN Type_ID_MaxQuestion INT )
	BEGIN
		SELECT		*, COUNT(Q.QuestionID)
        FROM		TypeQuestion TQ
        JOIN		Question Q ON TQ.TypeID = Q.TypeID
        WHERE		Q.TypeID = Type_ID_MaxQuestion
        GROUP BY	TQ.TypeID
		HAVING		COUNT(Q.QuestionID) = (	SELECT		COUNT(Q.QuestionID)
											FROM		Question Q 
                                            JOIN		TypeQuestion TQ ON Q.TypeID = TQ.TypeID
                                            GROUP BY	TQ.TypeID
                                            ORDER BY	COUNT(Q.QuestionID) DESC
                                            LIMIT		1
                                            );
		SELECT		TQ.TypeName
        FROM		Question Q
        JOIN		TypeQuestion TQ ON Q.TypeID = TQ.TypeID
        GROUP BY	Q.TypeID
        HAVING		COUNT(Q.TypeID) = (	SELECT		COUNT(Q.QuestionID)
											FROM		Question Q 
                                            JOIN		TypeQuestion TQ ON Q.TypeID = TQ.TypeID
                                            GROUP BY	TQ.TypeID
                                            ORDER BY	COUNT(Q.QuestionID) DESC
                                            LIMIT		1
                                            );
    END	$$
DELIMITER ;
CALL	getTypeQuestionMaxQuestion(1);

--  Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
-- chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa
-- chuỗi của người dùng nhập vào 
 DROP PROCEDURE IF EXISTS	getGroupOrAccount;
DELIMITER $$
CREATE PROCEDURE	getGroupOrAccount(IN In_String VARCHAR(100))
	BEGIN
        SELECT		UserName
        FROM		`Account`
        WHERE		UserName LIKE concat('%',In_String,'%');
        
        SELECT		GroupName
        FROM		`Group` 
		WHERE		GroupName LIKE concat('%',In_String,'%') ;
    END	$$
DELIMITER ;
CALL	getGroupOrAccount('a');

--  Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và
-- trong store sẽ tự động gán: username sẽ giống email nhưng bỏ phần @..mail đi
-- positionID: sẽ có default là developer 
-- departmentID: sẽ được cho vào 1 phòng chờ
-- Sau đó in ra kết quả tạo thành công 




-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
-- để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất 
DROP PROCEDURE IF EXISTS	ContenMax ;
DELIMITER $$
CREATE PROCEDURE	ContenMax(IN Type_Name VARCHAR(50))
	BEGIN



END $$
DELIMITER $$ ;


-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
DROP PROCEDURE IF EXISTS	getDeleteExam ;
DELIMITER $$
CREATE PROCEDURE	getDeleteExam(IN Exam_ID INT)
	BEGIN
		DELETE		
        FROM		Exam
        WHERE		ExamID = Exam_ID ;
    END	$$
DELIMITER ;
CALL	getDeleteExam();

-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa)
-- Sau đó in số lượng record đã remove từ các table liên quan trong khi removing
DROP PROCEDURE IF EXISTS	getDeleteExam ;
DELIMITER $$
CREATE PROCEDURE	getDeleteExam(IN Exam_ID INT)
	BEGIN



END $$
DELIMITER $$ ;


-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng
-- nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được chuyển về phòng ban default là phòng ban chờ việc



-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay 



-- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất
-- (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng") 

