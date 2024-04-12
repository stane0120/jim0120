package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;

public class SelectMain02 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("급여 입력 : ");
		int salary = Integer.parseInt(sc.nextLine());
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT job_title, avg(salary)");
		sql.append("  FROM employees e INNER JOIN jobs J");
		sql.append("   ON e.JOB_ID = j.JOB_ID");
		sql.append(" WHERE salary >= ?");
		sql.append(" GROUP BY j.JOB_TITLE");
		sql.append(" ORDER BY 2 DESC");
		
		try (
		    Connection conn = new ConnectionFactory().getConnection();
		    PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		) {			
			pstmt.setInt(1,  salary);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String jobTitle = rs.getString("job_title");
				int avgSalary = rs.getInt(2);
				
				System.out.printf("[%s] %d\n", jobTitle, avgSalary);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}	   
	}
}
