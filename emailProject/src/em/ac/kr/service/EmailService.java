package em.ac.kr.service;

import java.util.List; 
import em.ac.kr.dao.EmailDAO;
import em.ac.kr.vo.EmailVO;
import em.ac.kr.vo.UserVO;

public class EmailService {
	private EmailDAO dao;
	
	public EmailService() {
		dao = new EmailDAO();
	}
	
	public void addEmail(EmailVO email) {	
		dao.insert(email);
	}
	
	public boolean LoginEmail(EmailVO email) {
	    try {
	        return dao.Login(email);
	    } catch (Exception e) {
	        System.out.println("로그인 과정에서 오류가 발생했습니다: " + e.getMessage());
	        return false;
	    }
	}
	
	public List<EmailVO> GetEmail(String loggedInUserId) {
		List<EmailVO> list = dao.Get(loggedInUserId);
		return list;
	}
	
	public List<EmailVO> SendEmail(String loggedInUserId) {
		List<EmailVO> list = dao.Send(loggedInUserId);
		return list;
	}
	
	public List<EmailVO> HandEmail() {
		List<EmailVO> list = dao.Hand();
		return list;
	}

	public void Write(EmailVO email) {
		dao.Write(email);
	}

	public void Delete(EmailVO email) {
		dao.Delete(email);
	}
	

	public List<UserVO> HelpEmail(String helpId) {
		List<UserVO> list = dao.Help(helpId);
		return list;
	}

	public void End(UserVO user) {
		dao.End(user);	
	}
}


