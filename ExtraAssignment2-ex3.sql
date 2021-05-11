CREATE DATABASE Exercise3;
USE Exercise3;

CREATE TABLE DataTypes2 (
	ID				INT AUTO_INCREMENT PRIMARY KEY,
    `Name`			VARCHAR(100) NOT NULL,
    BirthDate		DATE,
    Gender			BIT,
    IsDeletedFlag	BIT
    );
    