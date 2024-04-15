-- ������ �����ϱ�2 4��
SELECT WEEK_OF_YEAR, ORDER_QTY,
       CASE WHEN ORDER_QTY >= 900000 THEN 'A'
            WHEN ORDER_QTY >= 800000 THEN 'B'
            WHEN ORDER_QTY >= 700000 THEN 'C'
            WHEN ORDER_QTY >= 600000 THEN 'D'
            ELSE 'F' END AS GRADE
       
FROM (
      SELECT C1.WEEK_OF_YEAR, SUM(ORDER_QTY) AS ORDER_QTY
        FROM (
              SELECT TO_CHAR(M1.OUTBOUND_DATE, 'IW') AS WEEK_OF_YEAR,
                     SUM(D1.ORDER_QTY) AS ORDER_QTY
                FROM LO_OUT_M M1
                JOIN LO_OUT_D D1 ON D1.INVOICE_NO = M1.INVOICE_NO
               WHERE OUTBOUND_DATE LIKE '2019%'
               GROUP BY OUTBOUND_DATE
               ORDER BY OUTBOUND_DATE
      ) C1
      GROUP BY WEEK_OF_YEAR
      ORDER BY WEEK_OF_YEAR
) M1;


-- ������ �ø���1 1�� ����
SELECT CASE NO WHEN 1 THEN UOM1
               WHEN 2 THEN UOM2
               WHEN 3 THEN UOM3
               ELSE UOM4 END AS UOM
FROM (
      SELECT 'PCS' AS UOM1, 
             'CASE' AS UOM2, 
             'BOX' AS UOM3, 
             'PLT' AS UOM4
      FROM DUAL
     ) M1
     JOIN (
           SELECT * 
             FROM CS_NO
            WHERE NO <= 4
          ) M2 ON 1 = 1;


-- ������ �ø���1 2��
SELECT ITEM_NM,
       ORDER_QTY,
       NO AS BOX_NO,
       CASE WHEN CHECK_VAL >= 0 THEN TO_NUMBER(:QTY_IN_BOX) ELSE MOD(ORDER_QTY, :QTY_IN_BOX) END AS QTY
FROM (
      SELECT ITEM_NM, 
             NO,
             ORDER_QTY,           
             ORDER_QTY - (NO * :QTY_IN_BOX) AS CHECK_VAL
      FROM LO_OUT_D M1 
         JOIN CS_NO C1 ON NO <= CEIL(ORDER_QTY / :QTY_IN_BOX)
      WHERE INVOICE_NO = '346724706214'
      ORDER BY ITEM_NM, NO
);


-- ������ �ø���1 3��
SELECT NO, ITEM_CD, ITEM_NM, ORDER_QTY
FROM (
SELECT ITEM_CD, 
       ITEM_NM, 
       ORDER_QTY
FROM (
      SELECT ITEM_CD, 
             ITEM_NM, 
             SUM(ORDER_QTY) AS ORDER_QTY
        FROM LO_OUT_M M1
        JOIN LO_OUT_D D1 ON D1.INVOICE_NO = M1.INVOICE_NO
                        AND ITEM_NM LIKE '%����%'
       WHERE OUTBOUND_DATE = '2019-09-04'  
         AND OUTBOUND_BATCH = '018'
       GROUP BY ITEM_CD, ITEM_NM
      HAVING SUM(ORDER_QTY) < 1000
       ORDER BY ORDER_QTY DESC
       ) 
       WHERE ROWNUM <= 5
       ) M1
JOIN CS_NO C1 ON C1.NO <= CEIL(ORDER_QTY / 100)
;



-- ������ �ø���1 4��
SELECT CASE WHEN NO = '2' THEN ITEM_NM ELSE '�հ�' END ITEM,
       SUM(ORDER_QTY) AS ORDER_QTY
  FROM LO_OUT_D M1
       JOIN CS_NO C1 ON C1.NO <= 2
 WHERE INVOICE_NO = '346724706214'
 GROUP BY CASE WHEN NO = '2' THEN ITEM_NM ELSE '�հ�' END
 ORDER BY (CASE WHEN ITEM = '�հ�' THEN 2 ELSE 1 END), ORDER_QTY DESC;







