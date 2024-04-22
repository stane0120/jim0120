package em.ac.kr.ui;

import em.ac.kr.vo.EmailVO;

public class DeleteUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		System.out.println("<<< 메일 삭제 서비스 >>>");
		String write_title = scanStr("삭제할 제목을 입력하세요 : ");
		
		EmailVO email = new EmailVO();
		email.setWrite_title(write_title);
		service.Delete(email);
		
		System.out.println("삭제 완료.");
	}
}
