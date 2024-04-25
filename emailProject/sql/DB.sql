CREATE TABLE USER_U (
	USER_NO	NUMBER	PRIMARY KEY,
	USER_ID	VARCHAR2(30)	NOT NULL,
	USER_PW	VARCHAR2(100)	NOT NULL,
	USER_DATE	DATE	DEFAULT sysdate, 
	USER_TEL VARCHAR2(100) NOT NULL
);

CREATE TABLE WRITE_W (
	WRITE_NO	NUMBER	PRIMARY KEY,
	USER_NO	NUMBER	NOT NULL,
	WRITE_TITLE	VARCHAR(40)	NOT NULL,
	WRITE_CONTENT	VARCHAR2(300)	NOT NULL,
	WRITE_DATE	DATE	DEFAULT sysdate,
	USER_ID VARCHAR2(30) NOT NULL
);

CREATE TABLE WRITE_R (
	WRITE_NO	NUMBER	PRIMARY KEY,
	USER_NO	NUMBER	NOT NULL,
	WRITE_TITLE	VARCHAR(40)	NOT NULL,
	WRITE_CONTENT	VARCHAR2(300)	NOT NULL,
	WRITE_DATE	DATE	DEFAULT sysdate, 
	USER_ID VARCHAR2(30) NOT NULL
);

CREATE TABLE WRITE_H (
	WRITE_NO	NUMBER	PRIMARY KEY,
	USER_NO	NUMBER	NOT NULL,
	WRITE_TITLE	VARCHAR(40)	NOT NULL,
	WRITE_CONTENT	VARCHAR2(300)	NOT NULL,
	WRITE_DATE	DATE	DEFAULT sysdate, 
	USER_ID VARCHAR2(30) NOT NULL
);

CREATE SEQUENCE SEQ_USER_NO nocache;
CREATE SEQUENCE SEQ_WRITE_NO nocache;

COMMIT;


