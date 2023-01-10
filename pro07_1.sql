create database goverment;

use goverment;

create table sample(id varchar(20), pw varchar(20));

insert into sample values('kkt', '1234');
insert into sample values('kim', '1004');
insert into sample values('lee', '1111');
insert into sample values('cho', '2222');
insert into sample values('jeong', '3333');

commit;

drop table user;

create table user(userid varchar(20) primary key,
passwd varchar(300) not null,
username varchar(100) not null,
email varchar(100),
tel varchar(20),
authority varchar(20) not null,
regdate datetime default now(),
enabled int default 1
);

desc user;

CREATE TABLE ACCOUNT (
    id varchar(100) primary key,
    password varchar(300),
    email varchar(100),
    phone varchar(20),
    role varchar(20)
);

create table attach(UUID varchar(50) not null, 
uploadpath varchar(100), 
filename varchar(200), 
filetype varchar(1) default "O", 
bno int);

select * from attach;


