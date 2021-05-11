CREATE DATABASE Exercise2;
USE Exercise2;

CREATE TABLE DataTypes (
	ID					INT AUTO_INCREMENT PRIMARY KEY,
    `Name`				VARCHAR(100) NOT NULL,
    `Code`				CHAR(5) NOT NULL,
    ModifiedDate		DATETIME
    );