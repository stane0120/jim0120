package kr.ac.kopo.day12.abs01;

/*
    출력할 프린터를 선택하세요(1. LG 2. 삼성) => 1
    LG프린터에서 출력됨
    출력할 프린터를 선택하세요(1. LG 2. 삼성) => 2
    삼성프린터에서 출력됨
 */

public class UserMain {
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.process();
	}
}
