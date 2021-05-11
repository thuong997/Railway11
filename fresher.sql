CREATE DATABASE fresher;
USE fresher;

CREATE TABLE Trainee (
	TraineeID			TINYINT AUTO_INCREMENT PRIMARY KEY,
    Full_Name			NVARCHAR(50) NOT NULL,
    Birth_Date			DATE,
    Gender				ENUM ('male','female','unknown'),
	ET_IQ				TINYINT CHECK (ET_IQ>=0 && ET_IQ<=20),
    ET_Gmath			TINYINT CHECK (ET_Gmath>=0 && ET_Gmath<=20),
    ET_English			TINYINT CHECK (ET_English>=0 && ET_English<=50),
    Training_Class		CHAR(50),
    Evaluation_Notes 	TEXT
    );
    
    ALTER TABLE Trainee
    ADD VTI_Account VARCHAR(50) NOT NULL UNIQUE KEY;
    
    