package em.ac.kr.ui;

public class EmailUI extends BaseUI {

    private String helpId;

    private String scanPhoneNumber() {
        return scanStr("전화번호를 입력하세요: ");
    }

    private int choiceMenu() {
        System.out.println("***** MAIL *****");
        System.out.println("1. 회원가입");
        System.out.println("2. 로그인");
        System.out.println("3. 아이디/비밀번호 찾기");
        System.out.println("4. 회원탈퇴");
        System.out.println("0. 종료");
        int type = scanInt("항목을 선택하세요: ");
        return type;
    }

    @Override
    public void execute() throws Exception {
        while (true) {
            int type = choiceMenu();
            switch (type) {
                case 1:
                    new InsertUI().execute();
                    break;
                case 2:
                    new LoginUI().execute();
                    break;
                case 3:
                    helpId = scanPhoneNumber();
                    new HelpUI(helpId).execute();
                    break;
                case 4:
                    new EndUI().execute();
                    break;
                case 0:
                    new ExitUI().execute();
                    return;
                default:
                    System.out.println("잘못 선택하셨습니다.");
                    break;
            }
        }
    }
}