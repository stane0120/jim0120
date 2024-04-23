package em.ac.kr.ui;

public class EmailUI extends BaseUI{
	
	private String HelpId;
	
	public String getHelpId() {
		return HelpId;
	}

	public void setHelpId(String HelpId) {
		this.HelpId = HelpId;
	}
	
	private int choiceMenu() {
		System.out.println("***** MAIL *****");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 아이디/비밀번호 찾기");
		System.out.println("0. 종료");
		int type = scanInt("항목을 선택하세요 : ");
		return type;
	}
	
	@Override
	public void execute() throws Exception {
		while (true) {
			IEmailUI ui = null;
			int type = choiceMenu();
			switch (type) {
			case 1:
				ui = new InsertUI();
				break;
			case 2:
				ui = new LoginUI();
				break;
			case 3:
				ui = new HelpUI(HelpId);
				break;
			case 0:
				ui = new ExitUI();
			}
			
			if(ui != null) {
				ui.execute();
			} else {
				System.out.println("잘못선택하셨습니다");
			}
		}
	}
}
