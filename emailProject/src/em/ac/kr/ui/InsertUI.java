package em.ac.kr.ui;

import em.ac.kr.vo.EmailVO;

public class InsertUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("<<< 회원가입 서비스 >>>");
		String ID = scanStr("가입할 아이디를 입력하세요 : ");
		String PW = scanStr("가입할 비밀번호를 입력하세요 : ");
		String TEL = scanStr("가입할 전화번호를 입력하세요 : ");
		
		EmailVO email = new EmailVO();
		email.setUser_id(ID);
		email.setUser_pw(PW);
		email.setUser_tel(TEL);
		service.addEmail(email);
		
		System.out.println("회원 가입 완료");
	}
}

