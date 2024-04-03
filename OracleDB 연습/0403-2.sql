SELECT OUTBOUND_DATE,
       INVOICE_NO,
       OUT_TYPE_DIV
FROM LO_OUT_M
WHERE INVOICE_NO = (
                    SELECT MAX(INVOICE_NO)
                    FROM LO_OUT_D
                    WHERE ITEM_NM LIKE '% ȣ����'
                    AND ORDER_QTY = 10
                    );
                    
SELECT OUTBOUND_DATE,
       INVOICE_NO,
       OUT_TYPE_DIV
FROM LO_OUT_M
WHERE INVOICE_NO IN (
                    SELECT INVOICE_NO
                    FROM LO_OUT_D
                    WHERE ITEM_NM LIKE '% ȣ����'
                    AND ORDER_QTY = 10
                    );
                    
SELECT OUTBOUND_DATE,
       INVOICE_NO,
       OUT_TYPE_DIV
FROM LO_OUT_M
WHERE (INVOICE_NO, OUT_TYPE_DIV) IN (
                                     SELECT INVOICE_NO, OUT_TYPE_DIV_D
                                     FROM LO_OUT_D
                                     WHERE ITEM_NM LIKE '%ȣ����'
                                     AND ORDER_QTY > 100
                                    );      
                                
                                
SELECT OUTBOUND_DATE,
       INVOICE_NO,
       OUT_TYPE_DIV
FROM LO_OUT_M M1
WHERE M1.OUTBOUND_DATE = TO_DATE('20190903', 'YYYY-MM-DD')
AND M1.INVOICE_NO IN (SELECT S1.INVOICE_NO
                        FROM LO_OUT_D S1
                      WHERE  S1.INVOICE_NO = M1.INVOICE_NO
                         AND S1.ORDER_QTY > 100  
                     );
                                
SELECT OUTBOUND_DATE,
       INVOICE_NO,
       OUT_TYPE_DIV
FROM LO_OUT_M M1
WHERE M1.OUTBOUND_DATE = TO_DATE('20190903', 'YYYY-MM-DD')
AND EXISTS (SELECT 1
              FROM LO_OUT_D S1
             WHERE S1.INVOICE_NO = M1.INVOICE_NO
               AND S1.ORDER_QTY > 100
           );            

SELECT *
  FROM (
        SELECT 9999 AS NO
        FROM DUAL
        UNION ALL
        SELECT 10001 AS NO
        FROM DUAL
        UNION ALL
        SELECT 10002 AS NO
        FROM DUAL
        ) M1
WHERE NO <= 100000
AND EXISTS ( 
             SELECT 1
               FROM CS_NO S1
              WHERE S1.NO = M1.NO
              );

SELECT M1.OUTBOUND_DATE,
       M1.INVOICE_NO,
       M1.OUT_TYPE_DIV,
      (SELECT SUM(S1.ORDER_QTY) AS SUM_ORDER_QTY  -- (@)�� ������ �����ϴ�
         FROM LO_OUT_D S1
        WHERE S1.INVOICE_NO = M1.INVOICE_NO
      ) AS SUM_QTY                          -- (3) SUM(ORDER_QTY)�� ���� ���?
FROM LO_OUT_M M1
WHERE M1.INVOICE_NO LIKE '3467247026%'; -- (1) ��Į�������� ������ ���忡�� ���� ������ ��


       
-- Ʈ����� ���̺��� ���ڵ� �Ǽ� ���� �б� ù ���
SELECT OUTBOUND_DATE, COUNT(OUTBOUND_DATE)
FROM LO_OUT_M
WHERE OUTBOUND_DATE BETWEEN '2019-06-15' AND '2019-06-25'
GROUP BY OUTBOUND_DATE;

-- Ʈ����� ���̺��� ���ڵ� �Ǽ� ���� �б� �� ���
SELECT DISTINCT OUTBOUND_DATE
FROM LO_OUT_M
WHERE OUTBOUND_DATE BETWEEN TO_DATE(:OUTBOUND_DATE, 'YYYY_MM_DD') AND TO_DATE(:OUTBOUND_DATE, 'YYYY_MM_DD') + 10
;

SELECT *
  FROM (
       SELECT TO_DATE(:OUTBOUND_DATE, 'YYYY_MM_DD') + NO AS OUT_DATE
       FROM CS_NO
       WHERE NO <= 10
       ) M1
 WHERE EXISTS (
               SELECT 1
                 FROM LO_OUT_M S1
               WHERE S1.OUTBOUND_DATE = M1.OUT_DATE
              );
       
SELECT OUT_DATE
  FROM (
       SELECT TO_DATE(:OUTBOUND_DATE, 'YYYY_MM_DD') + LEVEL AS OUT_DATE
       FROM DUAL
       CONNECT BY LEVEL < = 10
       ) M1
 WHERE EXISTS (
               SELECT 1
                 FROM LO_OUT_M S1
               WHERE S1.OUTBOUND_DATE = M1.OUT_DATE
              );

-- 2��
SELECT INVOICE_NO,
       OUT_TYPE_DIV,
       OUT_BOX_DIV,
       TO_NUMBER(SUBSTR(VAL, 1, 10)) AS MAX_ORDER_QTY,
       TO_NUMBER(SUBSTR(VAL, 12, 10)) AS MAX_LINE_NO
FROM(
     SELECT INVOICE_NO,
            OUT_TYPE_DIV,
            OUT_BOX_DIV,
        (
       SELECT MAX(LPAD(ORDER_QTY, 10, '0') || '-' || LPAD(LINE_NO, 10, '0')) -- || �� �� ���ڿ��� �����ϴ� ��
       FROM LO_OUT_D S1
       WHERE S1.INVOICE_NO = M1.INVOICE_NO
       ) AS VAL
       FROM LO_OUT_M M1
       WHERE OUTBOUND_DATE = '2019-06-03'
       AND OUTBOUND_NO BETWEEN 'D190603-897353' AND 'D190603-897360');






       
                                
                                
                                