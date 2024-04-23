package em.ac.kr.ui;

import em.ac.kr.vo.EmailVO;

public class LoginUI extends BaseUI {
    @SuppressWarnings("unused")
	@Override
    public void execute() throws Exception {
     System.out.println("<<< 로그인 >>>");
        String ID = scanStr("아이디를 입력하세요 : ");
        String PW = scanStr("비밀번호를 입력하세요 : ");
        
        EmailVO email = new EmailVO();
        email.setUser_id(ID);
        email.setUser_pw(PW);
        
        boolean loggedIn = service.LoginEmail(email);
        
        if (loggedIn) {
            EmailUI2 start = new EmailUI2();
            start.setLoggedInUserId(ID);
            
            GetUI getUI = new GetUI(ID);
            SendUI sendUI = new SendUI(ID);
            WriteUI writeUI = new WriteUI(ID);
            
            start.execute();
        } else {
            System.out.println("로그인 실패");
        }
    }
}