-- 조인 기본 1번
SELECT M1.INVOICE_NO, M1.OUTBOUND_DATE, M1.OUT_TYPE_DIV, D1.ITEM_CD, M2.ITEM_NM, D1.ORDER_QTY
FROM LO_OUT_M M1
JOIN LO_OUT_D D1 ON D1.INVOICE_NO = M1.INVOICE_NO
JOIN CM_ITEM M2 ON M2.ITEM_CD = D1.ITEM_CD
WHERE M1.INVOICE_NO IN ('346724703834', '346724722535', '346724717915')
ORDER BY INVOICE_NO, LINE_NO;

-- INVOICE_NO가 346724703834인 모든 데이터
SELECT *
FROM LO_OUT_M
WHERE INVOICE_NO = '346724703834'; 

-- 조인 기본 2번
SELECT M1.INVOICE_NO,
       M1.OUTBOUND_DATE, 
       M1.OUT_TYPE_DIV, 
       D1.ITEM_CD, 
       M2.ITEM_NM, 
       D1.ORDER_QTY,
       C1.CODE_NM AS TEMP_NM,
       C2.CODE_EX AS OUT_TYPE_NM
 FROM LO_OUT_M M1
 JOIN LO_OUT_D D1 ON D1.INVOICE_NO = M1.INVOICE_NO
                 AND D1.OUT_TYPE_DIV_D = M1.OUT_TYPE_DIV
 JOIN CM_ITEM  M2 ON M2.ITEM_CD = D1.ITEM_CD
 JOIN CS_CODE  C1 ON C1.CODE_CD = M1.TEMP_DIV
                 AND C1.CODE_GRP = 'LDIV01'
 JOIN CS_CODE  C2 ON C2.CODE_CD = M1.OUT_TYPE_DIV 
                 AND C2.CODE_GRP = 'LDIV03'
WHERE M1.INVOICE_NO IN ('346724703834', '346724722535', '346724717915')
ORDER BY INVOICE_NO, LINE_NO;


SELECT M2.ITEM_CD, 
       M2.ITEM_NM, 
       SUM(M2.ORDER_QTY) AS SUM_QTY
  FROM LO_OUT_M M1
  JOIN LO_OUT_D M2 ON M2.INVOICE_NO = M1.INVOICE_NO
  JOIN CM_ITEM C1 ON C1.ITEM_CD = M2.ITEM_CD
 WHERE M1.OUTBOUND_DATE = '2019-06-03'
   AND M2.ORDER_QTY > 5
 GROUP BY M2.ITEM_CD, M2.ITEM_NM
 ORDER BY SUM(M2.ORDER_QTY) DESC;
 
 SELECT *
 FROM (
  SELECT M1.INVOICE_NO, 
        M1.OUTBOUND_NO, 
        M1.OUTBOUND_BATCH,
        D1.ITEM_CD,
        D1.ITEM_NM,
        D1.ORDER_QTY
   FROM LO_OUT_M M1
   JOIN LO_OUT_D D1 ON D1.INVOICE_NO = M1.INVOICE_NO
  WHERE M1.OUTBOUND_DATE BETWEEN '2019-09-03' AND '2019-09-10'
    AND ITEM_NM LIKE '%골뱅이%'
    ORDER BY D1.ORDER_QTY DESC
      )
WHERE ROWNUM <= 5;
   
   
SELECT D1.ITEM_CD,
       C1.ITEM_NM,
       SUM(D1.ORDER_QTY) AS ORDER_QTY
  FROM LO_OUT_M M1
  JOIN LO_OUT_D D1 ON D1.INVOICE_NO = M1.INVOICE_NO
  JOIN CM_ITEM C1 ON C1.ITEM_CD = D1.ITEM_CD
 WHERE M1.OUTBOUND_DATE BETWEEN '2019-09-03' AND '2019-09-10'
   AND M1.OUT_BOX_DIV = 'D5'
 GROUP BY D1.ITEM_CD, C1.ITEM_NM
 ORDER BY SUM(D1.ORDER_QTY) DESC;
 
 SELECT M1.INVOICE_NO,
       M1.OUTBOUND_DATE, 
       M1.OUT_TYPE_DIV, 
       D1.ITEM_CD, 
       M2.ITEM_NM, 
       D1.ORDER_QTY,
       NVL(C1.CODE_NM, 'Failed..') AS TEMP_NM,
       C2.CODE_EX AS OUT_TYPE_NM
 FROM LO_OUT_M M1
      JOIN LO_OUT_D D1   ON D1.INVOICE_NO = M1.INVOICE_NO
                        AND D1.OUT_TYPE_DIV_D = M1.OUT_TYPE_DIV
      JOIN CM_ITEM  M2   ON M2.ITEM_CD = D1.ITEM_CD
 LEFT JOIN CS_CODE  C1   ON C1.CODE_CD = M1.TEMP_DIV
                        AND C1.CODE_GRP = 'LDIV011'                 
      JOIN CS_CODE  C2   ON C2.CODE_CD = M1.OUT_TYPE_DIV 
                        AND C2.CODE_GRP = 'LDIV03'
WHERE M1.INVOICE_NO IN ('346724703834', '346724722535', '346724717915')
ORDER BY INVOICE_NO, LINE_NO;
 
SELECT M1.OUT_DATE, NVL(QTY, '0')
FROM (
        SELECT TO_DATE(TO_CHAR(TO_DATE(:OUT_DATE), 'YYYYMM') || LPAD(No, 2, '0'), 'YYYY-MM-DD') AS OUT_DATE
        FROM CS_NO
        WHERE NO <= TO_DATE(:OUT_DATE) - TRUNC(TO_DATE(:OUT_DATE), 'MM') + 1
       ) M1
        LEFT JOIN (SELECT M1.OUTBOUND_DATE AS OUT_DATE, SUM(D1.ORDER_QTY) AS QTY
        FROM LO_OUT_M M1
        LEFT JOIN LO_OUT_D D1 ON D1.INVOICE_NO = M1.INVOICE_NO
                             AND D1.ORDER_QTY != 0
        WHERE OUTBOUND_DATE BETWEEN TRUNC(TO_DATE(:OUT_DATE), 'MM')
                              AND TO_DATE(:OUT_DATE)
       GROUP BY M1.OUTBOUND_DATE
      ) M2 ON M2.OUT_DATE = M1.OUT_DATE
      ORDER BY M1.OUT_DATE;
 
 
 
 -- EXIST문 예시
 SELECT M1.OUT_DATE
 FROM(
        SELECT TO_DATE(TO_CHAR(TO_DATE(:OUT_DATE), 'YYYYMM') || LPAD(No, 2, '0'), 'YYYY-MM-DD') AS OUT_DATE
        FROM CS_NO
        WHERE NO <= TO_DATE(:OUT_DATE) - TRUNC(TO_DATE(:OUT_DATE), 'MM') + 1
     ) M1
        WHERE NOT EXISTS (
        SELECT 1
        FROM LO_OUT_M S1
        WHERE S1.OUTBOUND_DATE = M1.OUT_DATE
     )
ORDER BY M1.OUT_DATE;
 
-- 분석함수로
SELECT INVOICE_NO, LINE_NO, ITEM_CD, ITEM_NM, ORDER_QTY 
      ,SUM(ORDER_QTY) OVER(PARTITION BY INVOICE_NO ORDER BY LINE_NO) AS ACC_ORDER_QTY
FROM LO_OUT_D
WHERE INVOICE_NO IN ('346724703845', '346724706214');
 
-- 분석함수로 2
SELECT INVOICE_NO, LINE_NO, ITEM_CD, ITEM_NM, ORDER_QTY 
      ,SUM(ORDER_QTY) OVER(ORDER BY INVOICE_NO, LINE_NO) AS ACC_ORDER_QTY
FROM LO_OUT_D
WHERE INVOICE_NO IN ('346724703845', '346724706214'); 
 

 
 
 
 
 
 
 
 
    
    
    
    