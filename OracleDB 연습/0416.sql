-- 테이블 그대로 복사하기
CREATE TABLE BAK_A_OUT_M
AS
SELECT *
  FROM A_OUT_M;
  
-- 확인
SELECT *
FROM BAK_A_OUT_M;

-- 삭제
DELETE FROM BAK_A_OUT_M;

-- 데이터 그대로 삽입하기
INSERT INTO BAK_A_OUT_M
SELECT *
FROM A_OUT_M;

SELECT *
FROM Z_DAY17_1;


UPDATE Z_DAY17_1 U1
   SET U1.UPDATE_COL2 = (SELECT SUM(M2.ORDER_QTY)
                           FROM LO_OUT_M M1
                           JOIN LO_OUT_D M2 ON M2.INVOICE_NO = M1.INVOICE_NO
                          WHERE M1.OUTBOUND_DATE = U1.OUTBOUND_DATE
                         )
 WHERE U1.OUTBOUND_DATE IN (SELECT M1.OUTBOUND_DATE
                              FROM LO_OUT_M M1
                              JOIN LO_OUT_D M2 ON M2.INVOICE_NO = M1.INVOICE_NO
                             WHERE M1.OUTBOUND_DATE LIKE '2019-08%'
                             GROUP BY M1.OUTBOUND_DATE
                           );


SELECT OUTBOUND_DATE, SUM_QTY, UPDATE_COL1, (
    SELECT SUM(S1.SUM_QTY)
    FROM Z_DAY17_1 S1
    WHERE S1.OUTBOUND_DATE BETWEEN TO_DATE(:YYYYMM || '01', 'YYYY-MM-DD') AND LAST_DAY(TO_DATE(:YYYYMM || '01', 'YYYY-MM-DD'))
      AND TO_CHAR(S1.OUTBOUND_DATE, 'D') = TO_CHAR(U1.OUTBOUND_DATE, 'D')
    ) - SUM_QTY AS UPDATE_COL2
  FROM Z_DAY17_1 U1
  WHERE U1.OUTBOUND_DATE BETWEEN TO_DATE(:YYYYMM || '01', 'YYYY-MM-DD') AND LAST_DAY(TO_DATE(:YYYYMM || '01', 'YYYY-MM-DD'))
  ORDER BY OUTBOUND_DATE;

DELETE
  FROM Z_DAY17_1
 WHERE SUM_QTY < (
                   SELECT AVG(SUM_QTY)
                     FROM (
                          SELECT M1.OUTBOUND_DATE, SUM(M2.ORDER_QTY) AS SUM_QTY
                            FROM LO_OUT_M M1
                                 JOIN LO_OUT_D M2 ON M2.INVOICE_NO = M1.INVOICE_NO
                           WHERE M1.OUTBOUND_DATE BETWEEN TO_DATE(:YYYYMM || '01', 'YYYY-MM-DD') AND LAST_DAY(:YYYYMM || '01')
                           GROUP BY M1.OUTBOUND_DATE
                          )
                 )
   AND OUTBOUND_DATE BETWEEN '2019-08-01' AND '2019-08-31';




