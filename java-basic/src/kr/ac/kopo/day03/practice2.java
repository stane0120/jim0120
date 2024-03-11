package kr.ac.kopo.day03;

import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("구구단도 해볼까");
			System.out.print("몇단을 보실까요? : ");

			int a = sc.nextInt();

			if (a < 2 || a > 9) {
				System.out.println("다시 입력해주세요");
			} else {
				for (int b = 1; b <= 9; b++) {
					System.out.printf("%d * %d = %d \n", a, b, a * b);
				}
			}
			System.out.println("아니다");
		}
	}
}
