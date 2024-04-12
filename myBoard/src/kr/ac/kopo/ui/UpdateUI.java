package kr.ac.kopo.ui;

public class UpdateUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		
		System.out.println("<<< 게시판 수정 서비스 >>>");
		int no = scanInt("수정할 글번호를 입력하세요 : ");
		String title = scanStr("수정할 제목을 입력하세요 : ");
		String writer = scanStr("수정할 작성자를 입력하세요 : ");
		
		// 
		
		System.out.println("게시글 [" + no + "]번 게시글을 수정하였습니다.");
	}
}
