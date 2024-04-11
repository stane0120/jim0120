package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
     JDBC 작업순서
     1. JDBC드라이버 로딩
     2. DriverManager를 이용하여 DB 접속 후 접속 객체 얻기
     3. Statement를 이용하여 쿼리 실행
     4. 결과 얻어오기
     5. 연결 해제
*/
public class DBMain {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		try {
		// 1단계 : 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("드라이버 로딩 완료...");
		// 2단계 : DB접속 후 connection 객체 얻기
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		System.out.println("conn : " + conn);
		
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5단계 : DB연결 해제
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
