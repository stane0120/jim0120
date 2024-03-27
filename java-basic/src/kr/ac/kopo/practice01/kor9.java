package kr.ac.kopo.practice01;

import java.util.Scanner;

public class kor9 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("보유하고 있는 책권수 : ");
			int a = sc.nextInt();

			if (a < 0) {
				System.out.println("잘못입력했습니다");
			} else if (a == 0) {
				System.out.println("보유하고 있는 책 없음");
			} else if (a == 1) {
				System.out.printf("%d " + "book", a);
			} else {
				System.out.printf("%d " + "books", a);
			}
		}
	}
}
