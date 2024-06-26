-- 데이터 늘리기2 1번
SELECT LINE_NO, 
       ITEM_CD, 
       ITEM_NM, 
       ORDER_QTY,
       NO
  FROM LO_OUT_D D1
  JOIN CS_NO C1 ON NO <= CASE MOD(ORDER_QTY, 2) WHEN 0 THEN 1 ELSE 2 END
 WHERE INVOICE_NO = '346724702600'
;

-- 데이터 늘리기2 2번

-- 데이터 늘리기2 3번

-- 데이터 늘리기2 4번
SELECT OUT_DATE,
       ITEM_CD,
       ITEM_NM,
       ORDER_QTY AS SUM_QTY
FROM (
SELECT CASE NO WHEN 3 THEN '합계' ELSE TO_CHAR(OUTBOUND_DATE) END AS OUT_DATE,
       CASE NO WHEN 1 THEN ITEM_CD WHEN 2 THEN '소계' ELSE '-' END AS ITEM_CD, 
       CASE NO WHEN 1 THEN ITEM_NM ELSE '-' END AS ITEM_NM,
       SUM(SUM_QTY) AS ORDER_QTY,
       NO
FROM (
      SELECT M1.OUTBOUND_DATE,
             D1.ITEM_CD,
             ITEM_NM,
             SUM(ORDER_QTY) AS SUM_QTY
        FROM LO_OUT_M M1
        JOIN LO_OUT_D D1 ON D1.INVOICE_NO = M1.INVOICE_NO
       WHERE OUTBOUND_DATE IN ('2019-09-03', '2019-09-04')
         AND ITEM_NM LIKE '%동원참치%'
         GROUP BY OUTBOUND_DATE, ITEM_CD, ITEM_NM
         ORDER BY OUTBOUND_DATE, ITEM_CD
) M1
         JOIN CS_NO C1 ON C1.NO <= 3
         GROUP BY CASE NO WHEN 3 THEN '합계' ELSE TO_CHAR(OUTBOUND_DATE) END,
                  CASE NO WHEN 1 THEN ITEM_CD WHEN 2 THEN '소계' ELSE '-' END, 
                  CASE NO WHEN 1 THEN ITEM_NM ELSE '-' END, 
                  NO
) L1
            ORDER BY (CASE WHEN NO = 3 THEN 3 ELSE 1 END) * (CASE WHEN :SORT = 1 THEN 1 ELSE -1 END)
            , OUT_DATE
            , NO * (CASE WHEN :SORT = 1 THEN 1 ELSE -1 END)
            , ITEM_CD;
    
