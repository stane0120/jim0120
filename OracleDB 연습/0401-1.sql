SELECT * FROM A_OUT_M;

SELECT DISTINCT OUTBOUND_DATE, OUT_TYPE_DIV
FROM A_OUT_M;

SELECT * FROM A_OUT_M
WHERE BRAND_CD = '1001'
AND OUTBOUND_DATE = TO_DATE('20230103', 'YYYY-MM-DD');

SELECT * FROM A_OUT_M
WHERE BRAND_CD = '1001'
OR OUTBOUND_DATE = TO_DATE('20230103', 'YYYY-MM-DD');

SELECT BRAND_CD, INVOICE_NO, OUTBOUND_DATE, OUT_TYPE_DIV, ORDER_NM
FROM A_OUT_M
WHERE BRAND_CD = '1001'
AND OUT_TYPE_DIV IN ('M11', 'M12')
AND OUTBOUND_DATE BETWEEN TO_DATE('20230104', 'YYYY_MM_DD') AND
                          TO_DATE('20230105', 'YYYY_MM_DD')
AND INVOICE_NO LIKE '#0%';


SELECT BRAND_CD, INVOICE_NO, OUTBOUND_DATE, OUT_TYPE_DIV, ORDER_NM
FROM A_OUT_M
WHERE BRAND_CD = '1001'
AND OUT_TYPE_DIV IN ('M11', 'M12')
AND OUTBOUND_DATE BETWEEN TO_DATE('20230104', 'YYYY_MM_DD') AND
                          TO_DATE('20230105', 'YYYY_MM_DD')
AND INVOICE_NO LIKE '#0%'
ORDER BY OUT_TYPE_DIV ASC, OUTBOUND_DATE DESC;

SELECT DISTINCT BRAND_CD, ITEM_CD, ORDER_QTY
FROM A_OUT_D
WHERE BRAND_CD IN ('1001', '2001')
AND ORDER_QTY BETWEEN 1 AND 3
ORDER BY BRAND_CD, ITEM_CD;

SELECT ITEM_CD
FROM A_OUT_D
WHERE BRAND_CD IN ('1001', '2001')
AND ORDER_QTY BETWEEN 1 AND 3
GROUP BY ITEM_CD
ORDER BY ITEM_CD DESC; 

SELECT ITEM_CD, BRAND_CD, COUNT(*), SUM(ORDER_QTY)
FROM A_OUT_D
WHERE BRAND_CD IN ('1001', '2001')
AND ORDER_QTY BETWEEN 1 AND 2
GROUP BY ITEM_CD, BRAND_CD
ORDER BY ITEM_CD; 


SELECT  BRAND_CD, ITEM_CD, SUM(ORDER_QTY) AS SUM_ORDER_QTY
FROM A_OUT_D
WHERE BRAND_CD IN ('1001', '2001')
AND ORDER_QTY BETWEEN 1 AND 2
GROUP BY  BRAND_CD, ITEM_CD, ORDER_QTY
ORDER BY SUM_ORDER_QTY DESC;


SELECT ITEM_CD, SUM(ORDER_QTY) AS SUM_ORDER_QTY, COUNT(1)
FROM A_OUT_D
WHERE BRAND_CD IN ('1001', '2001')
AND ORDER_QTY BETWEEN 1 AND 2
GROUP BY ITEM_CD
HAVING SUM(ORDER_QTY) BETWEEN 2 AND 4 AND COUNT(1) = 3
ORDER BY SUM_ORDER_QTY DESC;

SELECT SYSDATE FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'YYYY_MM') FROM DUAL;

SELECT 1 AS NO FROM DUAL
UNION ALL
SELECT 2 AS NO FROM DUAL
UNION ALL
SELECT 3 AS NO FROM DUAL
UNION ALL
SELECT 1 AS NO FROM DUAL;


SELECT 1 AS NO FROM DUAL
UNION
SELECT 2 AS NO FROM DUAL
UNION
SELECT 3 AS NO FROM DUAL
UNION
SELECT 1 AS NO FROM DUAL;


SELECT ROWNUM AS RNK, OUTBOUND_DATE, INVOICE_CNT
FROM(SELECT OUTBOUND_DATE, COUNT(1) AS INVOICE_CNT
     FROM A_OUT_M
     WHERE OUTBOUND_DATE BETWEEN '2023/01/03' AND '2023/01/05'
     GROUP BY OUTBOUND_DATE
     ORDER BY INVOICE_CNT DESC)
     WHERE ROWNUM <= 5;

SELECT ROWNUM AS RNK, OUTBOUND_DATE, INVOICE_CNT
FROM(SELECT OUTBOUND_DATE, COUNT(1) AS INVOICE_CNT
     FROM A_OUT_M
     WHERE OUTBOUND_DATE BETWEEN :OUTBOUND_DATE1 AND :OUTBOUND_DATE2
     GROUP BY OUTBOUND_DATE
     ORDER BY INVOICE_CNT DESC)
     WHERE ROWNUM <= 5;

