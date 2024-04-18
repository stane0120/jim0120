package kr.ac.kopo.ui;

public class SearchOneUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		int no = scanInt("조회할 글번호를 입력하세요 : ");
		
		//
		
		System.out.println("----------------------------");
		System.out.println("게시판 번호 : " + no);
		System.out.println("제     목 : ");
		System.out.println("글  쓴  이 : " );
		System.out.println("----------------------------");
		
	}

}
