package em.ac.kr.service;

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
}

