package kr.ac.kopo.ui;

import kr.ac.kopo.vo.BoardVO;

/**
 * 새로운 게시글 등록하기 위한 사용자와 입출력 제어
 * @author User
 *
 */
public class AddUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		
		System.out.println("<<< 게시글 등록 서비스 >>>");
		String title = scanStr("등록할 제목을 입력하세요 : ");
		String writer = scanStr("등록할 작성자를 입력하세요 : ");
		
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		service.addBoard(board);
		
		System.out.println("새글 등록을 완료하였습니다.");
	}
}
