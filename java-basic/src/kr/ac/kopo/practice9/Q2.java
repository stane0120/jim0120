package kr.ac.kopo.practice9;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();

			if (a < 1 || a > 100) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				for (int i = a; i >= 1; i--) {
					for (int j = 1; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
	}
}