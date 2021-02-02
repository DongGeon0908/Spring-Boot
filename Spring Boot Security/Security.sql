create user 'cos'@'%' identified by 'cos1234';
GRANT ALL PRIVILEGES ON *.* TO 'cos'@'%';
create database security;
use security;

drop table user;

show databases;

desc user;

select * from user;

update user set role = "ROLE_MANAGER" where id=1;
update user set role = "ROLE_ADMIN" where id=2;

truncate table user;