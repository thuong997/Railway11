DROP DATABASE IF EXISTS Assignment2;
CREATE DATABASE Assignment2;
USE Assignment2;

CREATE TABLE Department (
	 Department_id     TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	 Department_name   NVARCHAR(50) UNIQUE KEY NOT NULL
 );
 
 CREATE TABLE Position (
	position_id        TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	position_name      ENUM('Dev', 'Test', 'Scrum Master', 'PM') NOT NULL UNIQUE KEY
   );
   
   CREATE TABLE `Account` (
	account_id         SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Email              VARCHAR(100) UNIQUE KEY NOT NULL,
	UseName            VARCHAR(100) NOT NULL,
	FullName           NVARCHAR(100) NOT NULL,
	Department_id      TINYINT UNSIGNED NOT NULL,
	position_id        TINYINT UNSIGNED NOT NULL,
	create_date        DATE,
    FOREIGN KEY (department_id) REFERENCES Department (Department_id),
    FOREIGN KEY (position_id) REFERENCES position (position_id)
 );
 
 CREATE TABLE `Group` (
	group_id           TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
	group_name         NVARCHAR(50) NOT NULL UNIQUE KEY,
	creator_id         SMALLINT UNSIGNED NOT NULL,
	create_date        DATE,
    FOREIGN KEY (creator_id) REFERENCES `account` (account_id)
 );
 
 CREATE TABLE GroupAccount (
	group_id           TINYINT UNSIGNED NOT NULL,
	account_id         SMALLINT UNSIGNED NOT NULL,
	join_date          DATE,
    PRIMARY KEY (group_id,account_id),
    FOREIGN KEY (group_id) REFERENCES`group` (group_id),
    FOREIGN KEY (account_id) REFERENCES `account` (account_id)
 );
 
 CREATE TABLE TypeQuestion (
	type_id            TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	type_name          ENUM('Essay', 'Multiple-Choice') NOT NULL UNIQUE KEY 
  );
  
  CREATE TABLE CategoryQuestion (
	category_id        TINYINT AUTO_INCREMENT PRIMARY KEY,
	category_name      NVARCHAR(50)
 );
 
 CREATE TABLE Question (
	 question_id       SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	 content           TEXT,
	 category_id       TINYINT NOT NULL,
	 type_id           TINYINT UNSIGNED NOT NULL,
	 creator_id        SMALLINT UNSIGNED NOT NULL,
	 create_date       DATE,
     FOREIGN KEY (category_id) REFERENCES CategoryQuestion (category_id),
     FOREIGN KEY (type_id) REFERENCES TypeQuestion (type_id),
     FOREIGN KEY (creator_id) REFERENCES `account` (account_id)
 );
 
 CREATE TABLE Answer (
	answer_id          TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	content            TEXT,
	question_id        SMALLINT UNSIGNED,
	is_correct         BOOLEAN,
    FOREIGN KEY (question_id) REFERENCES question (question_id)
  );
  
  CREATE TABLE Exam (
	exam_id            SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	`code`             CHAR(50) NOT NULL,
	title              NVARCHAR(100) NOT NULL,
	category_id        TINYINT NOT NULL,
	duration           TINYINT NOT NULL,
	creator_id         SMALLINT UNSIGNED NOT NULL,
	create_date        DATE,
    FOREIGN KEY (category_id) REFERENCES CategoryQuestion (category_id),
    FOREIGN KEY (creator_id) REFERENCES `account` (account_id)
);
    
    CREATE TABLE ExamQuestion (
	exam_id            SMALLINT UNSIGNED NOT NULL,
	question_id        SMALLINT UNSIGNED NOT NULL,
    PRIMARY KEY (exam_id,question_id),
    FOREIGN KEY (question_id) REFERENCES Question (question_id),
    FOREIGN KEY (exam_id) REFERENCES Exam (exam_id)
    );
    
 
 
 