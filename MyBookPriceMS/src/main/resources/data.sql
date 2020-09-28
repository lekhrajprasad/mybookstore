/*
DROP TABLE IF EXISTS mycustomers;
CREATE TABLE mycustomers (
  cid INT AUTO_INCREMENT  PRIMARY KEY,
  cname VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  city VARCHAR(250) DEFAULT NULL,
  phone INT(20) DEFAULT NULL
);
INSERT INTO mycustomers (cname, email, city, phone) VALUES('Aliko1', 'Dangote1@gmail', 'Bang1', 12345);
INSERT INTO mycustomers (cname, email, city, phone) VALUES('Aliko1', 'Dangote1@gmail', 'Bang1', 12345);
INSERT INTO mycustomers (cname, email, city, phone) VALUES('Aliko1', 'Dangote1@gmail', 'Bang1', 12345);
*/
DROP TABLE IF EXISTS mybookprice;
create table mybookprice(
    book_id int primary key,
    price double,
    offer double
);
insert into mybookprice values(101,2000,10);
insert into mybookprice values(102,1000,10);
insert into mybookprice values(103,2000,10);
insert into mybookprice values(104,1000,10);
insert into mybookprice values(105,3000,10);
insert into mybookprice values(106,2000,10);
insert into mybookprice values(107,2000,10);
insert into mybookprice values(108,1000,10);
insert into mybookprice values(109,3000,10);
