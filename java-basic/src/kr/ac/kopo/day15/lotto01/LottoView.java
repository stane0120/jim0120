package kr.ac.kopo.day15.lotto01;

public class LottoView {

	public void process() {
		
		LottoUtil util = new LottoUtil();
		for(int game = 1; game <= 6; game++) {
			System.out.println(game + "게임 : " + util.getLotto() );  // 1 ~ 6게임까지 랜덤으로 추출된 로또번호를 순서대로 표시
		}
	}
}
