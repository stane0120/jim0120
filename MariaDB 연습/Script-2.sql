grant all on mysql.* to bjh@localhost;

CREATE TABLE EMP_01(
    EMP_ID INT,
    EMP_NAME VARCHAR(30),
    DEPT_TITLE VARCHAR(20)
);

INSERT INTO EMP_01()
VALUES(1234, '김뚜띠', '픽셀');

INSERT INTO EMP_01()
VALUES(9506, '김진우', '픽셀');

select * from EMP_01
order by EMP_ID desc;

commit;