CREATE TABLE USER_U (
	USER_NO	NUMBER	PRIMARY KEY,
	USER_ID	VARCHAR2(30)	NOT NULL,
	USER_PW	VARCHAR2(100)	NOT NULL,
	USER_DATE	DATE	DEFAULT sysdate 
);

CREATE TABLE WRITE_W (
	WRITE_NO	NUMBER	PRIMARY KEY,
	USER_NO	NUMBER	NOT NULL,
	WRITE_TITLE	VARCHAR(40)	NOT NULL,
	WRITE_CONTENT	VARCHAR2(300)	NOT NULL,
	WRITE_DATE	DATE	DEFAULT sysdate 
);

CREATE TABLE WRITE_R (
	WRITE_NO	NUMBER	PRIMARY KEY,
	USER_NO	NUMBER	NOT NULL,
	WRITE_TITLE	VARCHAR(40)	NOT NULL,
	WRITE_CONTENT	VARCHAR2(300)	NOT NULL,
	WRITE_DATE	DATE	DEFAULT sysdate 
);

CREATE TABLE WRITE_H (
	WRITE_NO	NUMBER	PRIMARY KEY,
	USER_NO	NUMBER	NOT NULL,
	WRITE_TITLE	VARCHAR(40)	NOT NULL,
	WRITE_CONTENT	VARCHAR2(300)	NOT NULL,
	WRITE_DATE	DATE	DEFAULT sysdate 
);


ALTER TABLE USER_U ADD CONSTRAINT PK_USER PRIMARY KEY (
	USER_NO
);

ALTER TABLE WRITE_R ADD CONSTRAINT PK_WRITE PRIMARY KEY (
	WRITE_NO,
	USER_NO
);

ALTER TABLE WRITE_R ADD CONSTRAINT PK_WRITE PRIMARY KEY (
	WRITE_NO,
	USER_NO
);

ALTER TABLE WRITE_W ADD CONSTRAINT FK_USER_TO_WRITE FOREIGN KEY (
	USER_NO
)
REFERENCES USER_U (
	USER_NO
);

CREATE SEQUENCE SEQ_USER_U_no nocache;

INSERT INTO USER_U(USER_NO, USER_ID, USER_PW, USER_DATE)
 VALUES(SEQ_USER_U_NO.NEXTVAL, 'jin', '1234', DEFAULT);

SELECT *
FROM USER_U;

SELECT *
FROM WRITE_R;

INSERT INTO WRITE_W(WRITE_NO, USER_NO, WRITE_TITLE, WRITE_CONTENT, WRITE_DATE)
 VALUES(1,1, '감', '과일', DEFAULT);

COMMIT;

COMMIT;
