USE ovpDataBase;

INSERT INTO user_type (Id, userType)
VALUES (1, "admin"),
	(2, "student"),
    (3, "checker");

INSERT INTO user(email, userName, password, userTypeId)
VALUES ("email@gmail.com", "username1", "password1", 1),
	("email2@gmail.com", "username2", "password2", 1),
    ("email3@gmail.com", "username3", "password3", 2),
    ("email4@gmail.com", "username4", "password4", 2);

