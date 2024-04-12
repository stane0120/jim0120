package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class PrnEmpSalary {

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력 : ");
        String salary = sc.nextLine();
        
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {

            conn = new ConnectionFactory().getConnection();
            
            String sql  = "SELECT J1.JOB_TITLE, AVG(E1.SALARY) AS AVG_SALARY " +
                          "FROM JOBS J1 " +
                          "JOIN EMPLOYEES E1 ON E1.JOB_ID = J1.JOB_ID " +
                          "WHERE E1.SALARY >= ? " +
                          "GROUP BY J1.JOB_TITLE " +
                          "ORDER BY AVG(E1.SALARY) DESC";
            pstmt = conn.prepareStatement(sql);
    
            pstmt.setString(1, salary);
            
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                String jobTitle = rs.getString("JOB_TITLE");
                String avgSalary = rs.getString("AVG_SALARY");
                System.out.println("[" + jobTitle + "] " + avgSalary);  
            }
            
            int cnt = pstmt.executeUpdate();
            System.out.println();
            System.out.println("총 " + "[" + cnt + "]" + "명이 검색되었습니다");
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
    
            JDBCClose.close(conn, pstmt);
        }
    }
}