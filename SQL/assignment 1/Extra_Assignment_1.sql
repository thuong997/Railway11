CREATE DATABASE Testing_System_Assignment_1;
USE Testing_System_Assignment_1;

CREATE TABLE Department (
 Department_id TINYINT UNSIGNED,
 Department_name VARCHAR(50)
 );
 
 CREATE TABLE Position (
  position_id TINYINT UNSIGNED,
   position_name ENUM('dev', 'Test', 'Scrum Master', 'PM')
   );
   
   CREATE TABLE `Account` (
 account_id TINYINT UNSIGNED,
 email VARCHAR(50),
 usename VARCHAR(50),
  fullname VARCHAR(50),
 department_id TINYINT UNSIGNED,
 position_id TINYINT UNSIGNED,
 create_date DATE
 );
 
 CREATE TABLE `Group` (
  group_id TINYINT UNSIGNED,
  group_name VARCHAR(50),
  creator_id TINYINT UNSIGNED,
 create_date DATE
 );
 
 CREATE TABLE GroupAccount (
  group_id TINYINT UNSIGNED,
  account_id TINYINT UNSIGNED,
 join_date DATE
 );
 
 CREATE TABLE TypeQuestion (
 type_id TINYINT UNSIGNED,
  type_name VARCHAR(50)
  );
  
  CREATE TABLE CategoryQuestion (
 category_id TINYINT UNSIGNED,
 category_name VARCHAR(50)
 );
 
 CREATE TABLE Question (
 question_id TINYINT UNSIGNED,
 content VARCHAR(50),
 category_id TINYINT UNSIGNED,
 type_id TINYINT UNSIGNED,
 creator_id TINYINT UNSIGNED,
 create_date DATE
 );
 
 CREATE TABLE Answer (
  answer_id TINYINT UNSIGNED,
  content VARCHAR(50),
  question_id TINYINT UNSIGNED,
  is_correct VARCHAR(50)
  );
  
  CREATE TABLE Exam (
 exam_id TINYINT UNSIGNED,
 `code` TINYINT UNSIGNED,
 title VARCHAR(50),
 category_id TINYINT UNSIGNED,
  duration DATE,
   creator_id TINYINT UNSIGNED,
    create_date DATE
    );
    
    CREATE TABLE ExamQuestion (
    exam_id TINYINT UNSIGNED,
    question_id TINYINT UNSIGNED
);
