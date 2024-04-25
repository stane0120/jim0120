package em.ac.kr.ui;

import java.util.List;
import em.ac.kr.vo.EmailVO;

public class GetUI extends BaseUI {
    private String loggedInUserId;

    public GetUI(String loggedInUserId) {
        this.loggedInUserId = loggedInUserId;
    }

	@Override
	public void execute() throws Exception {
        
		List<EmailVO> list = service.GetEmail(loggedInUserId);
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("\t<<< 받은 메일 조회 >>>");
		System.out.println("------------------------------------------------------------------");
		System.out.println("제목\t내용\t등록일\t\t\t보낼 아이디");
		System.out.println("------------------------------------------------------------------");
		if(list.isEmpty()) {
			System.out.println("게시글이 존재하지 않습니다");
		} else {
			for(EmailVO email : list) {
				System.out.println(email.getWrite_title() + "\t"
								 + email.getWrite_content() + "\t"
								 + email.getWrite_date() + "\t\t"
								 + email.getUser_id());
			}
		}
		System.out.println("------------------------------------------------------------------");
	}
}

