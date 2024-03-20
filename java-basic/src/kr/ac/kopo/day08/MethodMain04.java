package kr.ac.kopo.day08;

public class MethodMain04 {
	
	public static void main(String[] args) {
	
		GugudanUtil gu = new GugudanUtil();
		
		int startDan = gu.inputDan("시작단을 입력 : ");
		int endDan = gu.inputDan("종료단을 입력 : ");
		gu.print(startDan, endDan);
		
		int dan = gu.inputDan();
		gu.print(dan);
		gu.printAll();
	}
}
