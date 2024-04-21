package em.ac.kr.service;

public class EmailServiceFactory {
	private static EmailService service;
	
	public static EmailService getInstance() {
		if(service == null) {
			service = new EmailService();
		}
		return service;
	}
}
