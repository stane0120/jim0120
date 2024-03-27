package kr.ac.kopo.practice03;

import java.util.Scanner;

public class R6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("20 ~ 120 사이의 숫자를 입력: ");
		int a = Integer.parseInt(sc.nextLine());
		sc.close();

		System.out.printf("<1 ~ %d 사이의 369게임>\n", a);
		for (int i = 1; i <= a; i++) {

			int ten = i / 10, first = i % 10;

			if (first != 0 && first % 3 != 0 && ten % 3 != 0) {
				System.out.print(i);
			} else {

				if (ten == 3 || ten == 6 || ten == 9) {
					System.out.print("짝");
				}

				if (first == 3 || first == 6 || first == 9) {
					System.out.print("짝");
				}

				if (first == 0) {
					for (int j = 0; j < ten; j++) {
						System.out.print("뽀");
					}
					System.out.print("숑");
				}
			}
			System.out.println();
		}
	}
}
