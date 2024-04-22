package em.ac.kr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import em.ac.kr.util.ConnectionFactory;
import em.ac.kr.vo.EmailVO;

public class EmailDAO {
	public void insert(EmailVO email) {

		StringBuilder sql = new StringBuilder();
		sql.append("insert into user_u(user_no, user_id, user_pw, user_date) ");
		sql.append(" values(seq_user_u_no.nextval, ?, ?, default) ");

		try (Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			String user_id = email.getUser_id();
			String user_pw = email.getUser_pw();
			pstmt.setString(1, user_id);
			pstmt.setString(2, user_pw);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean Login(EmailVO email) {
		
		boolean loggedIn = false;
	    		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT user_id, user_pw FROM user_u ");
		sql.append("WHERE user_id = ? ");
		sql.append("AND user_pw = ? ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			String user_id = email.getUser_id();
			String user_pw = email.getUser_pw();
			pstmt.setString(1, user_id);
			pstmt.setString(2, user_pw);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				System.out.println("로그인 성공");
				loggedIn = true;
			} else {
				System.out.println("아이디나 비밀번호를 잘못 입력하셨습니다");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return loggedIn;
	}

	public List<EmailVO> Get() {
		List<EmailVO> list = new ArrayList<>();

		StringBuilder sql = new StringBuilder();
		sql.append("select write_no, user_no, write_title, write_content");
		sql.append("     , to_char(write_date, 'yyyy-mm-dd') write_date, user_id ");
		sql.append("  from write_w ");
		sql.append("  where user_id = ? ");

		try (Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int write_no = rs.getInt("write_no");
				int user_no = rs.getInt("user_no");
				String write_title = rs.getString("write_title");
				String write_content = rs.getString("write_content");
				String write_date = rs.getString("write_date");
	            String user_id = rs.getString("user_id");
	            
				EmailVO email = new EmailVO(write_no, user_no, write_title, write_content, write_date, user_id);
				list.add(email);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public List<EmailVO> Send() {
	    List<EmailVO> list = new ArrayList<>();

	    StringBuilder sql = new StringBuilder();
	    sql.append("SELECT write_no, user_no, write_title, write_content");
	    sql.append(", TO_CHAR(write_date, 'yyyy-mm-dd') write_date, user_id ");
	    sql.append("FROM write_r ");
	    sql.append("WHERE user_id != ? ");

	    try (Connection conn = new ConnectionFactory().getConnection();
	        PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
	        ResultSet rs = pstmt.executeQuery();

	        while (rs.next()) {
	            int write_no = rs.getInt("write_no");
	            int user_no = rs.getInt("user_no");
	            String write_title = rs.getString("write_title");
	            String write_content = rs.getString("write_content");
	            String write_date = rs.getString("write_date");
	            String user_id = rs.getString("user_id");

	            EmailVO emailVO = new EmailVO(write_no, user_no, write_title, write_content, write_date, user_id);
	            list.add(emailVO);
           
	        } 

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return list;
	}

	public List<EmailVO> Hand() {
		List<EmailVO> list = new ArrayList<>();

		StringBuilder sql = new StringBuilder();
		sql.append("select write_no, user_no, write_title, write_content");
		sql.append("     , to_char(write_date, 'yyyy-mm-dd') write_date, user_id ");
		sql.append("  from write_h ");

		try (Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int write_no = rs.getInt("write_no");
				int user_no = rs.getInt("user_no");
				String write_title = rs.getString("write_title");
				String write_content = rs.getString("write_content");
				String write_date = rs.getString("write_date");
				String user_id = rs.getString("user_id");

				EmailVO email = new EmailVO(write_no, user_no, write_title, write_content, write_date, user_id);
				list.add(email);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public void Write(EmailVO email) {
		StringBuilder sql = new StringBuilder();
		sql.append("insert into write_r (write_no, user_no, user_id, write_title, write_content, write_date) ");
		sql.append(" values(seq_write_no.nextval, ?, ?, ?, ?, sysdate) ");

		try (Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());){
			
			String write_title = email.getWrite_title();
			String write_content = email.getWrite_content();
			int user_no = email.getUser_no();
			String user_id = email.getUser_id();
			
			pstmt.setInt(1, user_no);
			pstmt.setString(2, user_id);
			pstmt.setString(3, write_title);
			pstmt.setString(4, write_content);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Delete(EmailVO email) {
		
		    StringBuilder sql = new StringBuilder();
		    sql.append("insert into write_h (write_no, user_no, write_title, write_content, write_date, user_id) "); 
		    sql.append("select write_no, user_no, write_title, write_content, write_date, user_id ");
		    sql.append("from write_w "); 
		    sql.append("where write_title = ?");
		    
		    StringBuilder sql2 = new StringBuilder();
		    sql2.append("insert into write_h (write_no, user_no, write_title, write_content, write_date, user_id) "); 
		    sql2.append("select write_no, user_no, write_title, write_content, write_date, user_id "); 
		    sql2.append("from write_r ");
		    sql2.append("where write_title = ?");
		    
		    StringBuilder sql3 = new StringBuilder();
		    sql3.append("delete from write_r "); 
		    sql3.append("where write_title = ?");
		    
		    StringBuilder sql4 = new StringBuilder();
		    sql4.append("delete from write_w "); 
		    sql4.append("where write_title = ?");
		
		try (Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		    PreparedStatement pstmt2 = conn.prepareStatement(sql2.toString());
			PreparedStatement pstmt3 = conn.prepareStatement(sql3.toString());
			PreparedStatement pstmt4 = conn.prepareStatement(sql4.toString());){
			
			String write_title = email.getWrite_title();
			pstmt.setString(1, write_title);
			pstmt.executeUpdate();
			pstmt2.setString(1, write_title);
			pstmt2.executeUpdate();
			pstmt3.setString(1, write_title);
			pstmt3.executeUpdate();
			pstmt4.setString(1, write_title);
			pstmt4.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}