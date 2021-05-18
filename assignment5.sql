--  Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
 
 CREATE OR REPLACE VIEW view1 AS
	SELECT	AccountID, FullName, DepartmentName
	FROM 	`account`
    JOIN	Department USING (DepartmentID)
    WHERE	DepartmentName = 'sale';

-- CTE Question1
WITH 		cte1(AccountID,FullName,DepartmentName) AS (
	SELECT 	AccountID,FullName,DepartmentName
    FROM	`Account`
    JOIN	Department USING (DepartmentID)
    WHERE	DepartmentName = 'sale'
    )
    SELECT 	*
    FROM	cte1;
 


-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất

CREATE OR REPLACE VIEW view2 AS
SELECT 		A.*, COUNT(GA.AccountID) AS 'SO LUONG'
FROM		`Account` A 
INNER JOIN 	GroupAccount GA ON A.AccountID = GA.AccountID
GROUP BY	A.AccountID
HAVING		COUNT(GA.AccountID) = (	SELECT 		COUNT(GA.AccountID) 
									FROM		`Account` A 
									INNER JOIN 	GroupAccount GA ON A.AccountID = GA.AccountID
									GROUP BY	A.AccountID
									ORDER BY	COUNT(GA.AccountID) DESC
									LIMIT		1
                                    );
    
    
-- CTE Question 2 


-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi 

CREATE OR REPLACE VIEW view3 AS
	SELECT	content
    FROM	question
    WHERE	length(content) > 18;

-- CTE Quetion 3
WITH			CTE3 (content) AS (
	SELECT		content
    FROM		Question
    WHERE		length(content) > 18
    )
    SELECT		*
    FROM		CTE3;
	
-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất

 CREATE OR REPLACE VIEW view4 AS
	SELECT 		*, COUNT(DepartmentID)
    FROM		`Account`
    JOIN		department USING(departmentID)
    GROUP BY	DepartmentID
    HAVING		COUNT(DepartmentID) =(	SELECT		COUNT(DepartmentID)
										FROM		`Account`
										JOIN		department USING(departmentID)
										GROUP BY	DepartmentID
                                        ORDER BY	COUNT(DepartmentID) DESC
										LIMIT		1
                                        );

--  Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo

  CREATE OR REPLACE VIEW view5 AS
	SELECT		A.FullName, Q.*
    FROM		Question Q
    JOIN		`Account` A ON A.AccountID = Q.CreatorID
    WHERE		A.FullName LIKE 'Nguyen_%';
    
--  CTE Question 5
WITH	CTE5  AS (
	SELECT		A.FullName, Q.*
    FROM		Question Q
    JOIN		`Account` A ON A.AccountID = Q.CreatorID
    WHERE		A.FullName LIKE 'Nguyen_%'
    )
	SELECT	*
    FROM	CTE5;
