package kr.ac.kopo.practice09;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();

			if (a < 1 || a > 100) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				for (int i = a; i >= 1; i--) {
					for (int j = 2; j <= i; j++) {
						System.out.print(" ");
					}
					for (int j = a; j >= i; j--) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
	}
}
