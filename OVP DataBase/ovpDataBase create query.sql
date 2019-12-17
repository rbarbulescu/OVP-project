CREATE DATABASE ovpDataBase;
USE ovpdatabase;

CREATE TABLE user_type (
    Id INT PRIMARY KEY,
    userType VARCHAR(25)
);

CREATE TABLE user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(50),
    userName VARCHAR(50) UNIQUE,
    password VARCHAR(50),
    userTypeId INT,
    FOREIGN KEY (userTypeId)
        REFERENCES ovpDataBase.user_type (Id)
        ON DELETE CASCADE ON UPDATE CASCADE
);

