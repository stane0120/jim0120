package em.ac.kr.ui;

import java.util.List;

import em.ac.kr.vo.EmailVO;
import kr.ac.kopo.vo.BoardVO;

public class GetUI implements IEmailUI {

	@Override
	public void execute() throws Exception {
		List<EmailVO> list = service.GetUI();
		
		System.out.println("----------------------------------");
		System.out.println("\t<<< 전체 메일 조회 >>>");
		System.out.println("----------------------------------");
		System.out.println("번호\t등록일\t작성자\t제목");
		System.out.println("----------------------------------");
		if(list.isEmpty()) {
			System.out.println("게시글이 존재하지 않습니다");
		} else {
			for(EmailVO : list) {
				System.out.println(EmailVO.get() + "\t" 
								+ EmailVO.getRegDate() + "\t"
								+ EmailVO.getWriter() + "\t"
								+ EmailVO.getTitle());
			}
		}
		System.out.println("----------------------------------");
	}
}
	}

}
