package kr.ac.kopo.ui;

public class BoardUI extends BaseUI{

	private int choiceMenu() {
		System.out.println("***** MENU *****");
		System.out.println("1. 전체게시글 조회");
		System.out.println("2. 글번호 조회");
		System.out.println("3. 새글 등록");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("6. 종료");
		int type = scanInt("항목을 선택하세요 : ");
		return type;
	}

	@Override
	public void execute() throws Exception {
		while (true) {
			IBoardUI ui = null;
			int type = choiceMenu();
			switch (type) {
			case 1:
				System.out.println("전체 게시글 조회 서비스...");
				break;
			case 2:
				System.out.println("글번호 조회 서비스...");
				break;
			case 3:
				ui = new AddUI();
				break;
			case 4:
				ui = new UpdateUI();
				break;
			case 5:
				System.out.println("게시글 삭제 조회 서비스...");
				break;
			case 0:
				System.out.println("프로그램 종료...");
				System.exit(0);
			}
			
			if(ui != null) {
				ui.execute();
			} else {
				System.out.println("잘못선택하셨습니다.");
			}
		}
	}
}