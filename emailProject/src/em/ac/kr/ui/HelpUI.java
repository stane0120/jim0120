package em.ac.kr.ui;

import java.util.List;
import em.ac.kr.vo.UserVO;

public class HelpUI extends BaseUI {
	
    private String HelpId;

    public HelpUI(String HelpId) {
        this.HelpId = HelpId;
    }
    
	@Override
	public void execute() throws Exception {
		
		List<UserVO> list = service.HelpEmail(HelpId);
		
		System.out.println("<<< 아이디/비밀번호 찾기 >>>");
		String user_tel = scanStr("전화번호를 입력하세요 : ");
		
		if(list.isEmpty()) {
			System.out.println("해당되는 아이디/비밀번호가 없습니다");
		} else {
			for(UserVO user : list) {
				System.out.println(user.getUser_id() + "\t"
						        +  user.getUser_pw() + "\t"
						        +  user.getUser_tel());		
			}
		}
		System.out.println(user_tel + "의 아이디/비밀번호 찾기가 완료되었습니다.");		
		System.out.println("------------------------------------------------------------------");
	}
}
