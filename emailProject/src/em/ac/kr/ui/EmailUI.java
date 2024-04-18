package em.ac.kr.ui;

public class EmailUI extends BaseUI{
	private int choiceMenu() {
		System.out.println("***** MENU *****");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 받은메일함");
		System.out.println("4. 보낸메일함");
		System.out.println("5. 휴지통");
		System.out.println("6. 메일 보내기");
		System.out.println("7. 메일 삭제하기");
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
				ui = new GetUI();
				break;
			case 4:
				ui = new SendUI();
				break;
			case 5:
				ui = new HandUI();
				break;
			case 6:
				ui = new WriteUI();
				break;			
			case 7:
				ui = new DeleteUI();
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
