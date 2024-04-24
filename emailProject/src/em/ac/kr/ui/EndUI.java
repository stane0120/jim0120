package em.ac.kr.ui;

import em.ac.kr.vo.UserVO;

public class EndUI extends BaseUI {

	@Override
	public void execute() throws Exception {
				
		System.out.println("<<< 회원탈퇴 >>>");
		
		String user_id = scanStr("삭제할 아이디를 입력하세요 : ");
		
		UserVO user = new UserVO();
		user.setUser_id(user_id);
		service.End(user);
		
		System.out.println("탈퇴 완료.");
	}
}
