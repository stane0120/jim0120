SELECT CASE SUBSTR(OUT_TYPE_DIV, 1, 2)
            WHEN 'M1' THEN '���'
            WHEN 'M2' THEN '����'
            ELSE '��Ÿ'
      END AS TEMP
     ,COUNT(*) AS CNT
   FROM LO_OUT_M
   GROUP BY CASE SUBSTR(OUT_TYPE_DIV, 1, 2)
            WHEN 'M1' THEN '���'
            WHEN 'M2' THEN '����'
            ELSE '��Ÿ'
      END
   ORDER BY COUNT(*);
   
   SELECT TEMP ,COUNT(*) AS CNT
   FROM (
          SELECT CASE SUBSTR(OUT_TYPE_DIV, 1, 2)
                   WHEN 'M1' THEN '���'
                   WHEN 'M2' THEN '����'
                   ELSE '��Ÿ'
          END AS TEMP
          FROM LO_OUT_M)
   GROUP BY TEMP
   ORDER BY COUNT(*);
   
SELECT CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '01' THEN SET_QTY END AS M01
      ,CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '02' THEN SET_QTY END AS M02
      ,CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '03' THEN SET_QTY END AS M03
      ,CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '04' THEN SET_QTY END AS M04
      ,CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '05' THEN SET_QTY END AS M05
      ,CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '06' THEN SET_QTY END AS M06
      ,CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '07' THEN SET_QTY END AS M07
      ,CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '08' THEN SET_QTY END AS M08
      ,CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '09' THEN SET_QTY END AS M09
      ,CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '10' THEN SET_QTY END AS M10
      ,CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '11' THEN SET_QTY END AS M11
      ,CASE TO_CHAR(OUTBOUND_DATE, 'MM') WHEN '12' THEN SET_QTY END AS M12
FROM LO_OUT_M
WHERE OUTBOUND_DATE BETWEEN TO_DATE('20190101', 'YYYY-MM-DD') AND TO_DATE('20191231', 'YYYY-MM-DD');






   
   
   
   
   