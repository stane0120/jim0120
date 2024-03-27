package kr.ac.kopo.practice03;

import java.util.Scanner;

public class R3 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("시작단 : ");
			int a = sc.nextInt();

			System.out.print("종료단 : ");
			int b = sc.nextInt();

			if (a < 2 || a > 9 || b < 2 || b > 9) {
				System.out.println("2~9 사이의 숫자를 입력해주세요.");
			} else if (a <= b) {
				for (int i = a; i <= b; i++) {
					System.out.println("===" + i + "단" + "===");
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d * %d = %d\n", i, j, i * j);
					}
					System.out.println();
				}
			} else {
				for (int i = b; i <= a; i++) {
					System.out.println("===" + i + "단" + "===");
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d * %d = %d\n", i, j, i * j);

					}
					System.out.println();
				}
			}
		}
	}
}
