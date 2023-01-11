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

drop table board;
-- 게시판 테이블
CREATE TABLE BOARD (
    BNO INT primary key auto_increment,
    BWRITTER VARCHAR(20) NOT NULL,
    BPASSWORD VARCHAR(4) NOT NULL, -- 원래 비밀번호
    BPASSWORDENC VARCHAR(200) NOT NULL, -- 암호화된 비밀번호
    BSUBJECT VARCHAR(100) NOT NULL,
    BCONTENT VARCHAR(500) NOT NULL, -- SUMMERNOTE를 사용하기 때문에 CLOB으로 설정한다.
    BREGDATE DATETIME NOT NULL default now(),
    BMODDATE DATETIME NOT NULL default now(),
    BCOUNT INT DEFAULT 0 -- 조회수는 DEFALUT 0으로 설정
);

select count(*) from board;

create table CHATMESSAGE(
    roomId int not null,            -- 방 번호
    messageId int primary key auto_increment,        -- 메세지 번호
    message varchar(500) not null,            -- 메세지 내용
    name varchar(50) not null,            -- 보낸이 이름
    email varchar(50) not null,            -- 보낸이 이메일
    unReadCount int,        -- 안 읽은 메세지 수
    sessionCount int        -- 현재 세션 수
);

create table CHATROOM(
    roomId int primary key auto_increment,        -- 방 번호
    userEmail varchar(50) not null,    -- 사용자 이메일
    userName varchar(50) not null,    -- 사용자 이름
    userPic varchar(100),        -- 사용자 사진
    masterEmail varchar(50), 	-- 상대방 이메일
    masterName varchar(50),    -- 상대방 이름
    masterPic varchar(100),    -- 상대방 사진
	unReadCount int    			-- 안 읽은 메세지 수
);

CREATE TABLE tb_message (
ms_title VARCHAR(50) NULL DEFAULT NULL,
receiver_name VARCHAR(50) NULL DEFAULT NULL,
gubun INT(1) NULL DEFAULT '0',
creat_dt DATE NULL DEFAULT NULL,
ms_content VARCHAR(500) NULL DEFAULT NULL,
sender_name VARCHAR(50) NULL DEFAULT NULL,
user_id VARCHAR(50) NOT NULL,
read_yn INT(1) NOT NULL DEFAULT '0',
PRIMARY KEY (user_id)
);
