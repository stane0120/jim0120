-- �ζ��κ� 2�� ����

SELECT BRAND_CD, ITEM_CD, ITEM_NM, QTY_IN_BOX, SUM_QTY, 
       TRUNC(TO_NUMBER(SUM_QTY / QTY_IN_BOX), 0) AS BOX_QTY,
       TO_NUMBER(MOD(SUM_QTY, QTY_IN_BOX)) AS NAT_QTY
FROM (
       SELECT BRAND_CD, ITEM_CD, ITEM_NM, QTY_IN_BOX, SUM_QTY
       FROM (
             SELECT BRAND_CD, ITEM_CD, SUM_QTY
            ,TO_NUMBER(SUBSTR(ITEM_INFO, 1, 10)) AS QTY_IN_BOX
                      ,SUBSTR(ITEM_INFO, 11, 10) AS ITEM_NM
            FROM(
                SELECT BRAND_CD
                      ,ITEM_CD
                      ,(
                         SELECT LPAD(S1.QTY_IN_BOX, 10, '0') || S1.ITEM_NM
                         FROM A_ITEM S1
                         WHERE S1.BRAND_CD = M1.BRAND_CD
                         AND   S1.ITEM_CD = M1.ITEM_CD
        ) AS ITEM_INFO
     , SUM_QTY
FROM (
      SELECT BRAND_CD, ITEM_CD, SUM(ORDER_QTY) AS SUM_QTY
      FROM A_OUT_D
      GROUP BY BRAND_CD, ITEM_CD
     ) M1
    )
  )
);


-- �ζ��κ� 3�� ����
SELECT BRAND_CD, ITEM_CD, ITEM_NM, QTY_IN_BOX, SUM_QTY, BOX_QTY, NAT_QTY
FROM(
SELECT BRAND_CD, ITEM_CD, ITEM_NM, QTY_IN_BOX, SUM_QTY, 
       TRUNC(TO_NUMBER(SUM_QTY / QTY_IN_BOX), 0) AS BOX_QTY,
       TO_NUMBER(MOD(SUM_QTY, QTY_IN_BOX)) AS NAT_QTY
FROM (
       SELECT BRAND_CD, ITEM_CD, ITEM_NM, QTY_IN_BOX, SUM_QTY
       FROM (
             SELECT BRAND_CD, ITEM_CD, SUM_QTY
            ,TO_NUMBER(SUBSTR(ITEM_INFO, 1, 10)) AS QTY_IN_BOX
                      ,SUBSTR(ITEM_INFO, 11, 10) AS ITEM_NM
            FROM(
                SELECT BRAND_CD
                      ,ITEM_CD
                      ,(
                         SELECT LPAD(S1.QTY_IN_BOX, 10, '0') || S1.ITEM_NM
                         FROM A_ITEM S1
                         WHERE S1.BRAND_CD = M1.BRAND_CD
                         AND   S1.ITEM_CD = M1.ITEM_CD
        ) AS ITEM_INFO
     , SUM_QTY
FROM (
      SELECT BRAND_CD, ITEM_CD, SUM(ORDER_QTY) AS SUM_QTY
      FROM A_OUT_D
      GROUP BY BRAND_CD, ITEM_CD
     ) M1
   )
)
)
ORDER BY BOX_QTY DESC
)
WHERE ROWNUM <= 3;








