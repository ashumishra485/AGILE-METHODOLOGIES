DROP DATABASE IF EXISTS ProjectDemo;
CREATE DATABASE IF NOT EXISTS ProjectDemo;
USE ProjectDemo;

DROP TABLE IF EXISTS login;
CREATE TABLE login (
	id INT NOT NULL auto_increment Primary Key,
	username VARCHAR(30) NOT NULL,
	password VARCHAR(30) NOT NULL
);

INSERT INTO login (username,password) 
VALUES ('admin','admin');
INSERT INTO login (username,password) 
VALUES ('delivery','delivery');

DROP TABLE IF EXISTS account;
CREATE TABLE account (
	username VARCHAR(30) NOT NULL,
	password VARCHAR(30) NOT NULL,
    type VARCHAR(30) NOT NULL
);

INSERT INTO account (username,password,type) 
VALUES ('admin','admin','newsagent');
INSERT INTO account (username,password,type) 
VALUES ('admin','admin','delivery');

select * from account;

DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
	id INT NOT NULL auto_increment Primary Key,
	name VARCHAR(30) NOT NULL,
	eircode VARCHAR(8),
    tel INT(10)   
);

INSERT INTO customer (name, eircode, tel)
VALUES ('Rex','r42 wp08','0877562145');
INSERT INTO customer (name, eircode, tel)
VALUES ('Bin','w12 r518','0872145817');

select * from customer;

DROP TABLE IF EXISTS stock;
CREATE TABLE stock (
    publication VARCHAR(30) NOT NULL,
	last int(10)
);

INSERT INTO stock VALUE('newspaper','10000');
INSERT INTO stock VALUE('magezine','5000');

select * from stock;

DROP TABLE IF EXISTS summary;
CREATE TABLE summary (
    customer VARCHAR(30) NOT NULL,
	deliver VARCHAR(30) NOT NULL,
    status VARCHAR(30) NOT NULL
);

INSERT INTO summary VALUE('Rex','Arek','delivered');
INSERT INTO summary VALUE('Bin','Ashu','delivered');
select * from summary;

DROP TABLE IF EXISTS subscription;
CREATE TABLE subscription (
	sid INT(30) NOT NULL,
	subname VARCHAR(60) NOT NULL,
	subtype VARCHAR(60) NOT NULL,
	substart VARCHAR(30) NOT NULL,
    subend VARCHAR(30) NOT NULL,
    primary key(sid)
);

select * from subscription;

drop table subscription;
UPDATE subscription SET subname="cool" ,subtype="yo", substart="237642", subend="2374" WHERE sid=3