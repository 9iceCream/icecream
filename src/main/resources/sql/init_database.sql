create database db_icecream;
create user 'springuser'@'%' identified by 'icecream';
grant all on db_icecream.* to 'springuser'@'%';