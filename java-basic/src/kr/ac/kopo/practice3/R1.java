package kr.ac.kopo.practice3;

import java.util.Scanner;

public class R1 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("2 ~ 9 사이의 숫자를 입력해주세요. : ");
			int a = sc.nextInt();

			if (a < 2 || a > 9) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				System.out.println("===" + a + "단" + "===");
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d x %d = %d \n", a, i, a * i);
				}
				System.out.println();

			}
		}
	}

}
