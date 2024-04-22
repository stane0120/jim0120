package em.ac.kr.ui;

public class BackUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		EmailUI back = new EmailUI();
		
		System.out.println("로그아웃 되었습니다.");

		back.execute();	
	}
}
