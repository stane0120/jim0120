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

SELECT * FROM t_board;