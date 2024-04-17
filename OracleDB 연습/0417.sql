-- ��������1 1��
SELECT C1.ZONE_CD, 
       C1.BANK_CD,
       C1.BAY_CD,
       C1.LEV_CD,
       C1.LOC_CD,
       ROWNUM AS ORDER_NO
FROM (
SELECT ZONE_CD,
       BANK_CD,
       BAY_CD,
       LEV_CD,
       LOC_CD,
       TO_NUMBER(BAY_CD) + TO_NUMBER(LEV_CD) AS ORDER_VAL
FROM (
      SELECT ZONE_CD,
             BANK_CD,
             BAY_CD,
             LEV_CD,
             TO_CHAR(ZONE_CD || '-' || BANK_CD || '-' || BAY_CD || '-' || LEV_CD) AS LOC_CD,
             ROWNUM AS ORDER_NO
      FROM (
            SELECT ZONE_CD,
                   BANK_CD,
                   CASE WHEN NO BETWEEN 1 AND 4 THEN '01'
                        WHEN NO BETWEEN 5 AND 8 THEN '02'
                        WHEN NO BETWEEN 9 AND 12 THEN '03'
                        WHEN NO BETWEEN 13 AND 16 THEN '04'
                        END AS BAY_CD,
                   CASE WHEN NO IN (1, 5, 9, 13) THEN '01'
                        WHEN NO IN (2, 6, 10, 14) THEN '02'
                        WHEN NO IN (3, 7, 11, 15) THEN '03'
                        WHEN NO IN (4, 8, 12, 16) THEN '04'
                        END AS LEV_CD
            FROM (
                  SELECT '01' AS ZONE_CD, 
                         '01' AS BANK_CD, 
                         '01' AS BAY_CD, 
                         '01' AS LEV_CD
                    FROM DUAL 
                 ) M1
                    JOIN (
                          SELECT * 
                            FROM CS_NO
                           WHERE NO <= 16
                           ) M2 ON 1 = 1
      ) 
) M1
 ORDER BY ORDER_VAL, BAY_CD DESC
) C1
;

-- �̸� �������� V_LOC�� �ٽ� Ǯ��
SELECT ZONE_CD, BANK_CD, BAY_CD, LEV_CD, LOC_CD, ROWNUM AS ORDER_NO
FROM (
      SELECT M1.*,
             TO_NUMBER(BAY_CD) + TO_NUMBER(LEV_CD) AS ORDER_VAL
        FROM V_LOC M1
       ORDER BY ORDER_VAL, BAY_CD DESC
)
;

-- ��������1 2��
SELECT CASE NO WHEN 1 THEN '�հ�' ELSE OUT_TYPE_DIV END OUT_TYPE_DIV,
       CASE NO WHEN 2 THEN OUT_BOX_DIV WHEN 3 THEN '�Ұ�' ELSE '-' END AS OUT_BOX_DIV, 
       SUM(SUM_QTY) AS ORDER_QTY
FROM (
      SELECT OUT_TYPE_DIV, OUT_BOX_DIV, SUM(ORDER_QTY) AS SUM_QTY
        FROM LO_OUT_M M1
        JOIN LO_OUT_D D1 ON D1.INVOICE_NO = M1.INVOICE_NO        
       WHERE OUTBOUND_DATE = '2019-09-03'
         AND OUT_TYPE_DIV IN ('M21', 'M22')
         AND OUT_BOX_DIV LIKE 'F%'
       GROUP BY OUT_TYPE_DIV, OUT_BOX_DIV
       ORDER BY OUT_TYPE_DIV
) M1
  JOIN CS_NO C1 ON NO <= CASE OUT_TYPE_DIV WHEN 'M21' THEN 2 ELSE 3 END
  GROUP BY CASE NO WHEN 1 THEN '�հ�' ELSE OUT_TYPE_DIV END,
           CASE NO WHEN 2 THEN OUT_BOX_DIV WHEN 3 THEN '�Ұ�' ELSE '-' END
  ORDER BY OUT_TYPE_DIV
;

-- �м��Լ� �н�
SELECT OUT_TYPE_DIV, OUT_BOX_DIV, SUM_QTY
      ,COUNT(1) OVER() AS TOT_CNT
      ,COUNT(1) OVER(PARTITION BY OUT_TYPE_DIV) AS CNT1
      ,SUM(SUM_QTY) OVER() AS TOT_SUM
      ,SUM(SUM_QTY) OVER(PARTITION BY OUT_TYPE_DIV) AS SUM1
      ,SUM(SUM_QTY) OVER(ORDER BY OUT_TYPE_DIV, OUT_BOX_DIV) AS ACC_SUM1
      ,SUM(SUM_QTY) OVER(PARTITION BY OUT_TYPE_DIV ORDER BY OUT_BOX_DIV) AS ACC_SUM2
      ,LAG(OUT_TYPE_DIV) OVER(ORDER BY OUT_TYPE_DIV, OUT_BOX_DIV) AS LAG_VAL1
      ,LAG(OUT_TYPE_DIV) OVER(PARTITION BY OUT_TYPE_DIV ORDER BY OUT_BOX_DIV) AS LAG_VAL2
      ,LEAD(OUT_TYPE_DIV) OVER(ORDER BY OUT_TYPE_DIV, OUT_BOX_DIV) AS LAG_VAL1
      ,LEAD(OUT_TYPE_DIV) OVER(PARTITION BY OUT_TYPE_DIV ORDER BY OUT_BOX_DIV) AS LAG_VAL2
FROM (
      SELECT OUT_TYPE_DIV, OUT_BOX_DIV, SUM(ORDER_QTY) AS SUM_QTY
        FROM LO_OUT_M M1
        JOIN LO_OUT_D D1 ON D1.INVOICE_NO = M1.INVOICE_NO        
       WHERE OUTBOUND_DATE = '2019-09-03'
         AND OUT_TYPE_DIV IN ('M21', 'M22')
         AND OUT_BOX_DIV LIKE 'F%'
       GROUP BY OUT_TYPE_DIV, OUT_BOX_DIV
       ORDER BY OUT_TYPE_DIV
)
  JOIN CS_NO C1 ON NO <= CASE OUT_TYPE_DIV WHEN 'M21' THEN 2 ELSE 3 END
  GROUP BY OUT_TYPE_DIV, OUT_BOX_DIV, SUM_QTY;
  
