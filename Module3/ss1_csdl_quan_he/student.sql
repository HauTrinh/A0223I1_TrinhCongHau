create database student_database;
use student_database;
CREATE TABLE student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    age INT,
    country VARCHAR(50)
);

create table class(
id int primary key,
name varchar(45)
);

create table teacher(
id int primary key,
name varchar(45),
age int,
country varchar(45)
);
INSERT INTO teacher(id,`name`, age, country) 
VALUE (1,"Hậu",22, "QN"),
	  (2,"Công",20, "DN");
select * from teacher