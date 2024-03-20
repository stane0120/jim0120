package kr.ac.kopo.day08;

import java.util.Scanner;

public class GugudanUtil {

	Scanner sc = new Scanner(System.in);

	/**
	 * 호출자가 넘겨준 두정수(시작단, 종료단) 사이의 구구단을 출력하는 기능
	 * 
	 * @param startDan 시작단
	 * @param endDan   종료단
	 */
	void print(int startDan, int endDan) {
		for (int dan = startDan; dan <= endDan; dan++) {
			print(dan);
		}
	}

	/**
	 * 2 ~ 9단까지의 구구단을 출력하는 기능
	 */
	void printAll() {
		print(2, 9);
	}

	/**
	 * 호출자가 넘겨준 단을 이용하여 구구단을 출력하는 기능
	 */

	void print() {
		for (int dan = 2; dan <= 9; dan++) {
			this.print(dan);
		}
	}

	void print(int dan) {
		System.out.println("*** " + dan + "단 ***");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}

	/**
	 * 키보드로 단을 입력받는 기능
	 */
	int inputDan() {
		System.out.print("단을 입력 : ");
		int dan = sc.nextInt();
		sc.nextLine();

		return dan;
	}

	int inputDan(String msg) {
		System.out.print(msg);
		int dan = Integer.parseInt(sc.nextLine());

		return dan;
	}
}
