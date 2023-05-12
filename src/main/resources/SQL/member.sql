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
where account='qwer1234';

# 게시글에 회원 계정명을 FK로 추가
alter table tbl_board
add account VARCHAR(50) not null;

alter table tbl_board
add constraint fk_account
foreign key (account)
reference tbl_member (account);

select  * from tbl_board;
SELECT * FROM tbl_member;

update tbl_member
set auth='ADMIN'
where account='aaa1234';

update tbl_board
set account = 'aaa1234';
