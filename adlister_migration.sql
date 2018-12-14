
USE adlister_db;

DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;


CREATE TABLE IF NOT EXISTS users(
  id INT UNSIGNED AUTO_INCREMENT,
  username VARCHAR(100) NOT NULL UNIQUE,
  email VARCHAR(200) NOT NULL UNIQUE,
  password VARCHAR(100) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS ads(
  id INT UNSIGNED AUTO_INCREMENT,
  userId INT UNSIGNED NOT NULL,
  title VARCHAR(100) NOT NULL,
  description VARCHAR(500) NOT NULL,
  FOREIGN KEY (userId) REFERENCES users (id),
  PRIMARY KEY (id)
);

SELECT * FROM ads;

GRANT ALL ON adlister_db.* TO 'bob'@'localhost';

insert into users (username, email, password)
values ('user1', 'user1@email.com', 'password1')


