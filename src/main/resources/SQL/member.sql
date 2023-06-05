-- 회원 관리 테이블
CREATE TABLE tbl_member
(
    account  VARCHAR(50),
    password VARCHAR(150) NOT NULL,
    name     VARCHAR(50)  NOT NULL,
    email    VARCHAR(100) NOT NULL UNIQUE,
    auth     VARCHAR(20) DEFAULT 'COMMON',
    reg_date DATETIME    DEFAULT current_timestamp,
    CONSTRAINT pk_member PRIMARY KEY (account)
);


truncate table tbl_member;

select *
from tbl_member
where account = 'qwer1234';

# 게시글에 회원 계정명을 FK로 추가
alter table tbl_board
    add account VARCHAR(50) not null;

alter table tbl_board
    add constraint fk_account
        foreign key (account)
    reference tbl_member (account);

select *
from tbl_board;
SELECT *
FROM tbl_member;

update tbl_member
set auth='ADMIN'
where account = 'aaa1234';

update tbl_board
set account = 'aaa1234';

# 자동 로그인 관련 컬럼 추가
alter table tbl_member
    add session_id varchar(200) default 'none';

alter table tbl_member
    add limit_time datetime;



select *
from tbl_member;
select *
from tbl_reply
where board_no = 298;

alter table tbl_member
    add profile_image VARCHAR(200);


alter table spring.tbl_reply
    add account VARCHAR(50) not null;

update tbl_reply
set account = 'qwer12344';

select A.reply_no
     , A.reply_text
     , A.account
     , B.profile_image
from tbl_reply A
         join tbl_member B
              on A.account = b.account
where board_no = 299;

alter table tbl_member
    add login_method VARCHAR(20);

select * from tbl_member;