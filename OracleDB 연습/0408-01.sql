-- 점검
SELECT OUTBOUND_DATE, INVOICE_NO, WORK_SEQ
  FROM LO_OUT_M
 WHERE OUTBOUND_DATE BETWEEN '2019-06-03' AND '2019-06-04'
   AND SET_TYPE_CD = '000581225'
   AND SET_QTY = '3'
ORDER BY CASE :SORT_TYPE WHEN '1' THEN WORK_SEQ
                         WHEN '2' THEN -WORK_SEQ 
                         END, INVOICE_NO;
                         
                         
-- 변수별로 다르게 정렬하기
SELECT INVOICE_NO, LINE_NO, ITEM_NM
  FROM LO_OUT_D
 WHERE INVOICE_NO = '346724704405'
 ORDER BY CASE :SORT_TYPE WHEN '1' THEN TO_CHAR(ITEM_NM) END
         ,CASE :SORT_TYPE WHEN '2' THEN TO_CHAR(ITEM_NM) END DESC;
         
-- 데이터 압축하기 1번         
SELECT M1.OUTBOUND_DATE, SUM(D1.ORDER_QTY) AS SUM_QTY
FROM LO_OUT_M M1
JOIN LO_OUT_D D1 ON D1.INVOICE_NO = M1.INVOICE_NO
WHERE M1.OUTBOUND_DATE LIKE '2019-09%'
GROUP BY M1.OUTBOUND_DATE
ORDER BY SUM(D1.ORDER_QTY) DESC;
    
-- 데이터 압축하기 2번         
SELECT SUM(CASE TO_CHAR(OUTBOUND_DATE, 'DAY') WHEN '일요일' THEN ORDER_QTY END) AS SUN,
       SUM(CASE TO_CHAR(OUTBOUND_DATE, 'DAY') WHEN '월요일' THEN ORDER_QTY END) AS MON,
       SUM(CASE TO_CHAR(OUTBOUND_DATE, 'DAY') WHEN '화요일' THEN ORDER_QTY END) AS TUE,
       SUM(CASE TO_CHAR(OUTBOUND_DATE, 'DAY') WHEN '수요일' THEN ORDER_QTY END) AS WED,
       SUM(CASE TO_CHAR(OUTBOUND_DATE, 'DAY') WHEN '목요일' THEN ORDER_QTY END) AS THU,
       SUM(CASE TO_CHAR(OUTBOUND_DATE, 'DAY') WHEN '금요일' THEN ORDER_QTY END) AS FRI,
       SUM(CASE TO_CHAR(OUTBOUND_DATE, 'DAY') WHEN '토요일' THEN ORDER_QTY END) AS SQT
       FROM LO_OUT_M M1
       JOIN LO_OUT_D D1 ON D1.INVOICE_NO = M1.INVOICE_NO
       WHERE M1.OUTBOUND_DATE LIKE '2019-09%';

-- 데이터 압축하기 2-2번
SELECT TO_CHAR(OUTBOUND_DATE, 'DAY') AS DY, SUM(D1.ORDER_QTY) AS SUM_QTY
  FROM LO_OUT_M M1
  JOIN LO_OUT_D D1 ON D1.INVOICE_NO = M1.INVOICE_NO
 WHERE M1.OUTBOUND_DATE LIKE '2019-09%'
 GROUP BY TO_CHAR(OUTBOUND_DATE, 'DAY')
 ORDER BY DECODE(TO_CHAR(OUTBOUND_DATE, 'DAY'), '일요일', 1, '월요일',2 ,3), DY DESC;







