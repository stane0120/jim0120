package kr.ac.kopo.day14.homework;

import java.util.Scanner;

public class CalendarView {

	private Scanner sc = new Scanner(System.in);

	public int scanInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}

	public void process() {

		CalendarUtil util = new CalendarUtil();

		while (true) {
			int type = scanInt("항목을 선택하세요(1. 특정년도 2. 특정월 3. 종료) => ");
			switch (type) {
			case 1:
				int year = scanInt("년도를 입력하세요 : ");
				util.showByYear(year);
				break;
			case 2:
				year = scanInt("년도를 입력하세요 : ");
				int month = scanInt("월을 입력하세요 : ");
				util.showByMonth(year, month);
				break;
			case 3:
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}
		}
	}
}
