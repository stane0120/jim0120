package kr.ac.kopo.practice10;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a < 2 || a > 9) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d \n", a, i, a * i);
			}
			System.out.println();

		}
	}
}
