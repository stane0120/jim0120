package kr.ac.kopo.day12.abs01;

import java.util.Scanner;

public class Menu {
	
	public void process() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("출력할 프린터를 선택하세요(1. LG  2. 삼성) => ");
			String type = sc.nextLine();
			
			switch(type) {
			case "1" :
				LGPrinter lg = new LGPrinter();
				lg.print();
				break;
			case "2" :
				SamsungPrinter sam = new SamsungPrinter();
				sam.print();
				break;
			default:
				System.out.println("잘못선택하셨습니다.");
			}
		}
	}
}
