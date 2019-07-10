create database db_example;
create user 'springuser'@'%' identified by 'icecream';
grant all on db_example.* to 'springuser'@'%';