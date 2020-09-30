DROP TABLE IF EXISTS mybooks;
create table mybooks(
    book_id int primary key,
    book_name char(30),
    author char(15),
    publications char(15),
    category char(15)
);
DROP TABLE IF EXISTS mybookratings;
create table mybookratings(
    book_id int primary key,
    avg_rating double,
    number_of_searches int
);
DROP TABLE IF EXISTS mybookinventory;
create table mybookinventory(
    book_id int primary key,
    books_available int
);
insert into mybooks values(101,'Master Spring Boot','Srinivas','JLC','Spring');
insert into mybooks values(102,'Master MicroServices','Sri','JLC','Spring');
insert into mybooks values(103,'Master Angular','Srinivas','JLC','Web');
insert into mybooks values(104,'Master React','Sri','JLC','Web');
insert into mybooks values(105,'Master Spring Framework','Srinivas','JLC','Spring');
insert into mybooks values(106,'Master Spring Security','Vas','JLC','Spring');
insert into mybooks values(107,'Master Vue JS','Srinivas','JLC','Web');
insert into mybooks values(108,'Node JS','Vas','JLC','Web');
insert into mybooks values(109,'Master Spring Rest','Srinivas','JLC','Spring');

insert into mybookratings values(101,3.5,99);
insert into mybookratings values(102,3.5,99);
insert into mybookratings values(103,3.5,99);
insert into mybookratings values(104,3.5,99);
insert into mybookratings values(105,3.5,99);
insert into mybookratings values(106,3.5,99);
insert into mybookratings values(107,3.5,99);
insert into mybookratings values(108,3.5,99);
insert into mybookratings values(109,3.5,99);

insert into mybookinventory values(101,50);
insert into mybookinventory values(102,50);
insert into mybookinventory values(103,50);
insert into mybookinventory values(104,50);
insert into mybookinventory values(105,50);
insert into mybookinventory values(106,50);
insert into mybookinventory values(107,50);
insert into mybookinventory values(108,50);
insert into mybookinventory values(109,50);
