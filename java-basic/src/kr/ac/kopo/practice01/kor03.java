package kr.ac.kopo.practice01;

import java.util.Scanner;

public class kor03 {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("반지름 입력 : ");
			int a = sc.nextInt();

			double pi = 3.141592;
			double b = pi * a * a;

			System.out.printf("반지름이 %d일때 원의 면적은 %.4f 입니다.", a, b);
		}
	}
}
