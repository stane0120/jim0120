package kr.ac.kopo.practice;

import java.util.Scanner;

public class kor11 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("정수 4개 입력 : ");

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			int max = 0;

			if (a > b && a > c && a > d) {
				max = a;
			} else if (b > a && b > c && b > d) {
				max = b;
			} else if (c > a && c > b && c > d) {
				max = c;
			} else if (d > a && d > b && d > c) {
				max = d;
			}
			System.out.printf("가장 큰 수 : %d", max);
		}
	}
}
