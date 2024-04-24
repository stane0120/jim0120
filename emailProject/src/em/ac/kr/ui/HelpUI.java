package em.ac.kr.ui;

import java.util.List;
import em.ac.kr.vo.UserVO;

public class HelpUI extends BaseUI {

    private String helpId;

    public HelpUI(String helpId) {
        this.helpId = helpId;
    }

    @Override
    public void execute() throws Exception {

        List<UserVO> list = service.HelpEmail(helpId);

        System.out.println("<<< 아이디/비밀번호 찾기 >>>");

        boolean found = false;

        for (UserVO user : list) {
            if (helpId.equals(user.getUser_tel())) {
                System.out.println("사용자 아이디: " + user.getUser_id());
                System.out.println("사용자 비밀번호: " + user.getUser_pw());
                System.out.println("사용자 전화번호: " + user.getUser_tel());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당되는 아이디/비밀번호가 없습니다");
        }
    }
}