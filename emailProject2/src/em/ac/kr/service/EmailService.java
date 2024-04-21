package em.ac.kr.service;

import java.util.List; 
import em.ac.kr.dao.EmailDAO;
import em.ac.kr.vo.EmailVO;

public class EmailService {
	private EmailDAO dao;
	
	public EmailService() {
		dao = new EmailDAO();
	}
	
	public void addEmail(EmailVO email) {	
		dao.insert(email);
	}
	
	public void LoginEmail(EmailVO email) {
		dao.Login(email);
	}
	
	public List<EmailVO> GetEmail() {
		List<EmailVO> list = dao.Get();
		return list;
	}
	
	public List<EmailVO> SendEmail() {
		List<EmailVO> list = dao.Send();
		return list;
	}

	public List<EmailVO> HandEmail() {
		List<EmailVO> list = dao.Hand();
		return list;
	}
}


