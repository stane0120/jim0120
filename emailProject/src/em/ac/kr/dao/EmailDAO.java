package em.ac.kr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import em.ac.kr.util.ConnectionFactory;
import em.ac.kr.vo.EmailVO;
import kr.ac.kopo.vo.BoardVO;

public class EmailDAO {
	public void insert(EmailVO email) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("insert into user_u(user_no, user_id, user_pw, user_date) ");
		sql.append(" values(seq_user_u_no.nextval, ?, ?, default) ");

        try(
            Connection conn = new ConnectionFactory().getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql.toString());
        ) {
        	String user_id = email.getUser_id();
        	String user_pw = email.getUser_pw();
        	pstmt.setString(1, user_id);
        	pstmt.setString(2, user_pw);
        	pstmt.executeUpdate();
        } catch(Exception e) {
        	e.printStackTrace();
        }
	}
	
	public void Login(EmailVO email) {
	    StringBuilder sql = new StringBuilder();
	    sql.append("SELECT user_id, user_pw FROM user_u ");
	    sql.append("WHERE user_id = ? ");
	    sql.append("AND user_pw = ? ");

	    try (
	        Connection conn = new ConnectionFactory().getConnection();
	        PreparedStatement pstmt = conn.prepareStatement(sql.toString());
	    ){
	        String user_id = email.getUser_id();
	        String user_pw = email.getUser_pw();
	        pstmt.setString(1, user_id);
	        pstmt.setString(2, user_pw);
	        ResultSet rs = pstmt.executeQuery();

	        if (rs.next()) {
	            System.out.println("로그인 성공");
	        } else {
	            System.out.println("로그인 실패");
	        }
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	}
	    public List<EmailVO> GetUI() {
			
			List<EmailVO> list = new ArrayList<>();
			
			StringBuilder sql = new StringBuilder();
			sql.append("select write_no, user_no, write_title, write_content");
			sql.append("     , to_char(write_date, 'yyyy-mm-dd') write_date ");
			sql.append("  from write_w ");
			
			try(
			    Connection conn = new ConnectionFactory().getConnection();
			    PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			) {
				ResultSet rs = pstmt.executeQuery();	
				
				while(rs.next()) {
				    int write_no = rs.getInt("write_no");
				    int user_no = rs.getInt("user_no");
				    String write_title = rs.getString("write_title");
				    String write_content = rs.getString("write_content");
				    String write_date = rs.getString("write_date");
				
				    EmailVO email = new EmailVO(write_no, user_no, write_title, write_content, write_date);
				    list.add(email);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return list;
		}
	}   
