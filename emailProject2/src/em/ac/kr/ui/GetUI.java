package em.ac.kr.ui;

import java.util.List;
import em.ac.kr.vo.EmailVO;

public class GetUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		
		List<EmailVO> list = service.GetEmail();
		
		System.out.println("----------------------------------");
		System.out.println("\t<<< 전체 메일 조회 >>>");
		System.out.println("----------------------------------");
		System.out.println("글번호\t회원번호\t등록일\t작성자\t제목");
		System.out.println("----------------------------------");
		if(list.isEmpty()) {
			System.out.println("게시글이 존재하지 않습니다");
		} else {
			for(EmailVO email : list) {
				System.out.println(email.getWrite_no() + "\t" 
						         + email.getUser_no() + "\t" 
								 + email.getWrite_title() + "\t"
								 + email.getWrite_content() + "\t"
								 + email.getWrite_date());
			}
		}
		System.out.println("----------------------------------");
	}
}

