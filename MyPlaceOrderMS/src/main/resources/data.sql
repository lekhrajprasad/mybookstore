drop table IF EXISTS myorders;
create table myorders(
order_id int primary key,
order_date char(25),
user_id char(10),
total_qty int,
total_cost double,
status char(15)
);
drop table IF EXISTS myorderitems;
create table myorderitems(
order_Item_id int primary key,
order_id int,
book_id int,
qty int,
cost double
);
drop table IF EXISTS mybookinventory;
create table mybookinventory(
book_id int primary key,
books_available int
);

insert into myorders values(1001,'12-Sept-2020','U-123',5,500,'New');

insert into myorderitems values(1,1001,101,2,200);
insert into myorderitems values(2,1001,102,3,300);

insert into mybookinventory values(101,50);
insert into mybookinventory values(102,50);
insert into mybookinventory values(103,50);
insert into mybookinventory values(104,50);
insert into mybookinventory values(105,50);
insert into mybookinventory values(106,50);
insert into mybookinventory values(107,50);
insert into mybookinventory values(108,50);
insert into mybookinventory values(109,50);