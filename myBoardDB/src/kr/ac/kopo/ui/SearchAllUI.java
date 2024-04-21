package kr.ac.kopo.ui;

import java.util.List;
import kr.ac.kopo.vo.BoardVO;

public class SearchAllUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		List<BoardVO> list = service.searchAllBoard();
		
		System.out.println("----------------------------------");
		System.out.println("\t<<< 전체 게시글 조회 >>>");
		System.out.println("----------------------------------");
		System.out.println("번호\t등록일\t작성자\t제목");
		System.out.println("----------------------------------");
		if(list.isEmpty()) {
			System.out.println("게시글이 존재하지 않습니다");
		} else {
			for(BoardVO board : list) {
				System.out.println(board.getNo() + "\t" 
						+ board.getRegDate() + "\t"
						+ board.getWriter() + "\t"
						+ board.getTitle());
			}
		}
		System.out.println("----------------------------------");
	}
}
