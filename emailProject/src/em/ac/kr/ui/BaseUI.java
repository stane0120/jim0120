package em.ac.kr.ui;

import java.util.Scanner;
import em.ac.kr.service.EmailService;
import em.ac.kr.service.EmailServiceFactory;

public abstract class BaseUI implements IEmailUI{
	private Scanner sc ;
	protected EmailService service;
	protected String loggedInUserId; 
	
	public BaseUI() {
		sc = new Scanner(System.in);
		service = EmailServiceFactory.getInstance();
	}
	
	protected String scanStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	
	protected int scanInt(String msg) {
		return Integer.parseInt(scanStr(msg));
	}	
	
	public void setLoggedInUserId(String loggedInUserId) {
	this.loggedInUserId = loggedInUserId;
	    }
}
