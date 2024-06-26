-- 데이터 압축하기 3번
SELECT SUM(CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '01' THEN ORDER_QTY END) AS M01,
       SUM(CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '02' THEN ORDER_QTY END) AS M02,
       SUM(CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '03' THEN ORDER_QTY END) AS M03,
       SUM(CASE WHEN TO_CHAR(OUTBOUND_DATE, 'MM') BETWEEN '01' AND '03' THEN ORDER_QTY END) AS Q1,
       SUM(CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '04' THEN ORDER_QTY END) AS M04,
       SUM(CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '05' THEN ORDER_QTY END) AS M05,
       SUM(CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '06' THEN ORDER_QTY END) AS M06,
       SUM(CASE WHEN TO_CHAR(OUTBOUND_DATE, 'MM') BETWEEN '04' AND '06' THEN ORDER_QTY END) AS Q2,
       SUM(CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '07' THEN ORDER_QTY END) AS M07,
       SUM(CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '08' THEN ORDER_QTY END) AS M08,
       SUM(CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '09' THEN ORDER_QTY END) AS M09,
       SUM(CASE WHEN TO_CHAR(OUTBOUND_DATE, 'MM') BETWEEN '07' AND '09' THEN ORDER_QTY END) AS Q3,
       SUM(CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '10' THEN ORDER_QTY END) AS M10,
       SUM(CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '11' THEN ORDER_QTY END) AS M11,
       SUM(CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '12' THEN ORDER_QTY END) AS M12,
       SUM(CASE WHEN TO_CHAR(OUTBOUND_DATE, 'MM') BETWEEN '10' AND '12' THEN ORDER_QTY END) AS Q4
       FROM LO_OUT_M M1
       JOIN LO_OUT_D D1 ON D1.INVOICE_NO = M1.INVOICE_NO
       WHERE M1.OUTBOUND_DATE LIKE '2019%';
       
-- 데이터 압축하기 4번
SELECT CASE WHEN ROWNUM <= 5 THEN ROWNUM ELSE 0 END AS RNUM,
       CASE WHEN ROWNUM <= 5 THEN C1.ITEM_CD ELSE '99999' END AS ITEM_CD,
       CASE WHEN ROWNUM <= 5 THEN C1.ITEM_NM ELSE 'TOP5제외 합계' END AS ITEM_NM,
       SUM(ORDER_QTY) AS ORDER_QTY
FROM (
       SELECT D1.ITEM_CD,
              D1.ITEM_NM,
              SUM(D1.ORDER_QTY) AS ORDER_QTY
       FROM LO_OUT_M M1
       JOIN LO_OUT_D D1 ON D1.INVOICE_NO = M1.INVOICE_NO
       WHERE OUTBOUND_DATE BETWEEN '2019-06-01' AND '2019-06-30'
       AND ITEM_NM LIKE '%참치%'
       GROUP BY D1.ITEM_CD, D1.ITEM_NM
       ORDER BY SUM(D1.ORDER_QTY) DESC
     ) C1
GROUP BY CASE WHEN ROWNUM <= 5 THEN ROWNUM ELSE 0 END,
         CASE WHEN ROWNUM <= 5 THEN C1.ITEM_CD ELSE '99999' END, 
         CASE WHEN ROWNUM <= 5 THEN C1.ITEM_NM ELSE 'TOP5제외 합계' END          
ORDER BY (CASE WHEN ITEM_CD = '99999' THEN 2 ELSE 1 END), ORDER_QTY DESC;












       