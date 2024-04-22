package em.ac.kr.ui;

import em.ac.kr.vo.EmailVO;

public class LoginUI extends BaseUI {
    @Override
    public void execute() throws Exception {
    	
        EmailUI2 start = new EmailUI2();
        
        System.out.println("<<< 로그인 >>>");
        String ID = scanStr("아이디를 입력하세요 : ");
        String PW = scanStr("비밀번호를 입력하세요 : ");
        
        EmailVO email = new EmailVO();
        email.setUser_id(ID);
        email.setUser_pw(PW);
        
        boolean loggedIn = service.LoginEmail(email);
        
        if (loggedIn) {
            start.execute();
        } else {
            System.out.print("");
        }
    }
}