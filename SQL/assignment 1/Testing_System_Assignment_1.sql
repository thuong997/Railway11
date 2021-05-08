CREATE DATABASE Testing_System_Assignment_1;
USE Testing_System_Assignment_1;

CREATE TABLE Department (
 Department_id INT,
 Department_name VARCHAR(50)
 );
 
 CREATE TABLE Position (
  position_id INT,
   position_name VARCHAR(50)
   );
   
   CREATE TABLE `Account` (
 account_id INT,
 email VARCHAR(50),
 usename VARCHAR(50),
  fullname VARCHAR(50),
 department_id INT,
 position_id INT,
 create_date DATE
 );
 
 CREATE TABLE `Group` (
  group_id INT,
  group_name VARCHAR(50),
  creator_id INT,
 create_date DATE
 );
 
 CREATE TABLE GroupAccount (
  group_id INT,
  account_id INT,
 join_date DATE
 );
 
 CREATE TABLE TypeQuestion (
 type_id int,
  type_name VARCHAR(50)
  );
  
  CREATE TABLE CategoryQuestion (
 category_id INT,
 category_name VARCHAR(50)
 );
 
 CREATE TABLE Question (
 question_id INT,
 content VARCHAR(50),
 category_id INT,
 type_id INT,
 creator_id INT,
 create_date date
 );
 
 CREATE TABLE Answer (
  answer_id INT,
  content VARCHAR(50),
  question_id INT,
  is_correct VARCHAR(50)
  );
  
  CREATE TABLE Exam (
 exam_id INT,
 `code` INT,
 title VARCHAR(50),
 category_id INT,
  duration DATE,
   creator_id INT,
    create_date DATE
    );
    
    CREATE TABLE ExamQuestion (
    exam_id INT,
    question_id INT
    );
    
 
 
 