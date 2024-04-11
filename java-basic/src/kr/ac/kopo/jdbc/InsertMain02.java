package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMain02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력 : ");
		String id = sc.nextLine();
		System.out.print("이름을 입력 : ");
		String name = sc.nextLine();
		
		String sql =  "insert into t_test(id, name) ";
		       sql += " values(\'" + id + "\', \'" + name + "\') ";
		
		Connection conn = null;
		Statement stmt = null;
		try {
			// 1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
            // 2단계            		
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
			
			// 3단계 : 쿼리실행객체 생성
			stmt = conn.createStatement();
			
			// 4단계 : 쿼리 실행 후 결과 얻기
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행 삽입");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5단계
			if(stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
