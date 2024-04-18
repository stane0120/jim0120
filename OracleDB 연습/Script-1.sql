-- 게시판 테이블
CREATE TABLE tbl_board(
   NO number(5) PRIMARY KEY,
   title varchar2(1000) NOT NULL,
   writer varchar2(200) NOT NULL,
   reg_date DATE DEFAULT sysdate 
);

COMMIT;

CREATE SEQUENCE seq_tbl_board_no nocache;

SELECT * FROM tbl_board;

DELETE FROM tbl_board
WHERE NO = '1';

INSERT INTO tbl_board(NO, title, writer)
VALUES(seq_tbl_board_no.nextval, 'test', 'hong');

CREATE SEQUENCE seq_01;
CREATE SEQUENCE seq_02
 START WITH 2400001;

SELECT seq_02.nextval FROM dual;





















