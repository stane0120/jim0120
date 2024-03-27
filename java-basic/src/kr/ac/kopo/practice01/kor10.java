package kr.ac.kopo.practice01;

import java.util.Scanner;

public class kor10 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("첫번째 정수 : ");
			int a = sc.nextInt();
			sc.nextLine();

			System.out.print("두번째 정수 : ");
			int b = sc.nextInt();
			sc.nextLine();

			System.out.print("세번째 정수 : ");
			int c = sc.nextInt();
			sc.nextLine();

			int max = a > b ? a : b;
			if (c > max) {
				max = c;
			}

			int min = a > b ? b : a;
			if (c < min) {
				min = c;
			}

			int mid = 0;
			if (a >= b) {
				if (b >= c) {
					mid = b;
				} else if (c <= a) {
					mid = c;
				} else {
					mid = a;
				}
			} else if (a > c) {
				mid = a;
			} else if (b > c) {
				mid = c;
			} else {
				mid = b;
			}
			System.out.printf("%d %d %d", max, mid, min);
		}
	}
}
