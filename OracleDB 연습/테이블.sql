CREATE TABLE t_board(
   NO number(5) PRIMARY KEY,
   title varchar2(300) NOT NULL,
   writer varchar2(100) NOT NULL,
   content varchar(4000) NOT NULL,
   view_cnt number(5) DEFAULT 0,
   reg_DATE DATE DEFAULT sysdate
);

CREATE SEQUENCE seq_t_board_no nocache;

COMMIT;

INSERT INTO t_board(NO, title, writer, content)
VALUES(seq_t_board_no.nextval, '길을잃었다', '홍길동', '어딜가야할까');

INSERT INTO t_board(NO, title, writer, content)
VALUES(seq_t_board_no.nextval, '죽을만큼아파서', '고길동', '지옥같은여기서날꺼내줘');

COMMIT;

CREATE TABLE t_board_file(
    NO number(10) PRIMARY KEY,
    board_no Number(5) NOT NULL,
    file_ori_name varchar2(100),
    file_save_name varchar2(100),
    file_size number(10),
    CONSTRAINT t_board_file_no_fk FOREIGN KEY(board_no)
    REFERENCES t_board(no) ON DELETE CASCADE 
);

-- 첨부파일 테이블 시퀀스 생성
CREATE SEQUENCE seq_t_board_file_no nocache;

COMMIT;

SELECT NO, title, writer, to_char(reg_date, 'yyyy-mm-dd') REG_DATE
FROM t_board
ORDER BY NO DESC;


SELECT * FROM t_board_file;

SELECT sysdate FROM dual;
SELECT seq_t_board_no.nextval FROM dual;

CREATE TABLE T_MEMBER(
    ID 			VARCHAR2(20) PRIMARY KEY,
    NAME 		VARCHAR2(20) NOT NULL,
    PASSWORD 		VARCHAR2(20) NOT NULL,
    EMAIL_ID 		VARCHAR2(30),
    EMAIL_DOMAIN 	VARCHAR2(20),
    TEL1 			CHAR(3),
    TEL2 			CHAR(4),  
    TEL3 			CHAR(4),
    POST 			CHAR(6),
    BASIC_ADDR 		VARCHAR2(200),
    DETAIL_ADDR 		VARCHAR2(200),
    TYPE            		CHAR(1) default 'U',
    REG_DATE 		DATE default sysdate
);

COMMIT;

SELECT * FROM T_MEMBER;

INSERT INTO T_MEMBER
VALUES('admin', 'admin', '1234', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

INSERT INTO T_MEMBER
VALUES('user1', '유저일', '5678', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

COMMIT;
