-- 두개의 테이블 이용하기 미리 1
SELECT BRAND_CD, ITEM_CD, SUM(ORDER_QTY)
FROM A_OUT_D
WHERE (BRAND_CD, INVOICE_NO) IN ( SELECT BRAND_CD, INVOICE_NO
                                  FROM A_OUT_M
                                  WHERE OUTBOUND_DATE = '2023-01-03')
GROUP BY BRAND_CD, ITEM_CD
ORDER BY BRAND_CD, ITEM_CD;

-- 두개의 테이블 이용하기 미리 2
SELECT M2.BRAND_CD, M2.ITEM_CD, SUM(M2.ORDER_QTY) 
FROM A_OUT_M M1 
JOIN A_OUT_D M2 ON  M2.BRAND_CD = M1.BRAND_CD
AND M2.INVOICE_NO = M1.INVOICE_NO
WHERE M1.OUTBOUND_DATE = '2023-01-03'
GROUP BY M2.BRAND_CD, M2.ITEM_CD
ORDER BY M2.BRAND_CD, M2.ITEM_CD;


-- GROUP BY 없는 집계 SELECT 집계함수's FROM WHERE 1번
SELECT COUNT(INVOICE_NO)
FROM A_OUT_M
WHERE OUTBOUND_DATE IN ('2023-01-03', '2023-01-04')
ORDER BY OUTBOUND_DATE;

-- GROUP BY 없는 집계 SELECT 집계함수's FROM WHERE 2번
SELECT SUM(ORDER_QTY)
FROM A_OUT_D
WHERE BRAND_CD = '1001';

-- GROUP BY 있는 집계 SELECT 집계함수's FROM WHERE 1번
SELECT BRAND_CD, COUNT(INVOICE_NO)
FROM A_OUT_M
GROUP BY BRAND_CD;

-- GROUP BY 있는 집계 SELECT 집계함수's FROM WHERE 2번
SELECT BRAND_CD, OUTBOUND_DATE, COUNT(INVOICE_NO)
FROM A_OUT_M
GROUP BY BRAND_CD, OUTBOUND_DATE;

-- GROUP BY 있는 집계 SELECT 집계함수's FROM WHERE 3번
SELECT BRAND_CD, SUM(ORDER_QTY)
FROM A_OUT_D
GROUP BY BRAND_CD;

-- GROUP BY 있는 집계 SELECT 집계함수's FROM WHERE 4번
SELECT BRAND_CD, ITEM_CD, SUM(ORDER_QTY)
FROM A_OUT_D
GROUP BY BRAND_CD, ITEM_CD
ORDER BY BRAND_CD, ITEM_CD;

-- GROUP BY 있는 집계 SELECT 집계함수's FROM WHERE 5번
SELECT BRAND_CD, MAX(ORDER_QTY), MIN(ORDER_QTY)
FROM A_OUT_D
GROUP BY BRAND_CD;

-- WHERE절 서브쿼라 SELECT 컬럼's FROM WHERE 컬럼 IN (SELECT구문) 1번 문제
SELECT *
FROM A_OUT_D D1
WHERE D1.INVOICE_NO IN (
                        SELECT INVOICE_NO
                        FROM A_OUT_M M1
                        WHERE OUTBOUND_DATE = '2023-01-03'
                       )
ORDER BY BRAND_CD, INVOICE_NO;

-- WHERE절 서브쿼라 SELECT 컬럼's FROM WHERE 컬럼 IN (SELECT구문) 2번 문제
SELECT *
FROM A_OUT_D D1
WHERE (D1.BRAND_CD, D1.INVOICE_NO) IN (
                                       SELECT M1.BRAND_CD, M1.INVOICE_NO
                                       FROM A_OUT_M M1
                                       WHERE M1.BRAND_CD = '1001'
                                       AND M1.OUT_TYPE_DIV LIKE 'M1%'
                        )
ORDER BY BRAND_CD, INVOICE_NO;

-- WHERE절 서브쿼라 SELECT 컬럼's FROM WHERE 컬럼 IN (SELECT구문) 3번 문제
SELECT *
FROM A_OUT_M M1
WHERE (M1.BRAND_CD, M1.INVOICE_NO) IN (
                                       SELECT D1.BRAND_CD, D1.INVOICE_NO
                                       FROM A_OUT_D D1
                                       WHERE ORDER_QTY >= 3 
                                   );

SELECT *
FROM A_OUT_M
WHERE (BRAND_CD, INVOICE_NO) IN (
                                       SELECT BRAND_CD, INVOICE_NO
                                       FROM A_OUT_D
                                       GROUP BY BRAND_CD, INVOICE_NO
                                       HAVING SUM(ORDER_QTY) >= 3
                                   );              
                                   
-- 스칼라쿼리 1번                                  
SELECT BRAND_CD,
       ITEM_CD,
       SUBSTR(ITEM_INFO, 6) AS ITEM_NM,
       SUBSTR(ITEM_INFO, 1, 5) AS QTY_IN_BOX,
       SUM_QTY
FROM (
SELECT BRAND_CD,
       ITEM_CD,
       (
        SELECT LPAD(S1.QTY_IN_BOX, 5, '0') || S1.ITEM_NM
        FROM A_ITEM S1
        WHERE S1.BRAND_CD = M1.BRAND_CD
        AND S1.ITEM_CD = M1.ITEM_CD
       ) AS ITEM_INFO
       ,SUM_QTY
FROM (
      SELECT BRAND_CD,
             ITEM_CD,
             SUM(ORDER_QTY) AS SUM_QTY
      FROM A_OUT_D
      GROUP BY BRAND_CD, ITEM_CD
) M1
);
    









