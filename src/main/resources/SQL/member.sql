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

SELECT * FROM tbl_member;

truncate table tbl_member;

select *
from tbl_member
where account='qwer1234';