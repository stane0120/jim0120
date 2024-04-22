package em.ac.kr.ui;

import em.ac.kr.vo.EmailVO;

public class WriteUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("<<< 메일 전송 서비스 >>>");
		String write_title = scanStr("등록할 제목을 입력하세요 : ");
		String write_content = scanStr("등록할 내용을 입력하세요 : ");
		String user_id = scanStr("메일을 보낼 아이디를 입력하세요 : ");
		
		EmailVO email = new EmailVO();
		email.setWrite_title(write_title);
		email.setWrite_content(write_content);
		email.setUser_id(user_id);
		service.Write(email);
		
		System.out.println("메세지를 전송하였습니다.");
	}
}
