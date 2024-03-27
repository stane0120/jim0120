package kr.ac.kopo.practice01;

import java.util.Scanner;

public class kor04 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("정수를 입력하세요 : ");
			int a = sc.nextInt();
			sc.nextLine();

			System.out.print("나눌 수를 입력하세요 : ");
			int b = sc.nextInt();
			sc.nextLine();

			System.out.printf("몫 : %d\n", a / b);
			System.out.printf("나머지 : %d", a % b);
		}
	}
}
