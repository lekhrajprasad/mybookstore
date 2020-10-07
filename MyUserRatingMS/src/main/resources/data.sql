
drop table IF EXISTS myuserratings;
create table myuserratings(
rating_id int primary key,
book_id int,
user_id char(10),
rating double,
review char(55)
);
drop table IF EXISTS mybookratings;
create table mybookratings(
book_id int primary key,
avg_rating double,
number_of_searches int
);
insert into myuserratings values(1,101,'U-11',3.5,'Excellent');
insert into myuserratings values(2,102,'U-12',3.5,'Good');
insert into myuserratings values(3,101,'U-13',3.5,'Excellent');
--insert into myuserratings values(4,103,'U-11',3.5,'Good');
insert into myuserratings values(5,104,'U-12',3.5,'Excellent');

insert into mybookratings values(101,3.5,99);
insert into mybookratings values(102,3.5,99);
insert into mybookratings values(103,3.5,99);
insert into mybookratings values(104,3.5,99);
insert into mybookratings values(105,3.5,99);
insert into mybookratings values(106,3.5,99);
insert into mybookratings values(107,3.5,99);
insert into mybookratings values(108,3.5,99);
insert into mybookratings values(109,3.5,99);