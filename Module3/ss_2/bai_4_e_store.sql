CREATE DATABASE e_store;
USE e_store;

create table Customer (
cID int primary key auto_increment,
cName varchar(20),
cAge int
);
 create table Product (
 pID int primary key auto_increment,
 pName varchar(20),
 pPrice double
 );
 
 create table `Order`(
 oID int primary key auto_increment,
 cID int,
 ODate date,
 oTotalPrice double,
 FOREIGN KEY (cID) REFERENCES Customer(cID)
 );
 
 create table OrderDetail (
 oID int,
 pID int,
 odQTY int,
 PRIMARY KEY (oID, pID),
 FOREIGN KEY (oID) REFERENCES `Order`(oID),
 FOREIGN KEY (pID) REFERENCES Product(pID)
 );