-- 게시판 테이블
CREATE TABLE tbl_board(
	NO number(5) PRIMARY KEY
	, title varchar2(1000) NOT NULL
	, writer varchar2(200) NOT NULL
	, reg_date DATE DEFAULT sysdate
);

-- 일련번호
CREATE SEQUENCE seq_tbl_board_no;

SELECT * FROM tbl_board;

INSERT INTO tbl_board(NO, title, writer)
 values(seq_tbl_board_no.nextval, 'test', 'hong');

COMMIT;
 
 
 
 