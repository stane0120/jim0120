package kr.ac.kopo.day08;

import java.util.Scanner;

public class practice {

	static int getSum(int a, int b) {
		int sum = 0;
		while (a <= b) {
			sum = sum + a++;
		}
		return sum;
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("첫번째 값을 입력해주세요 : ");
			int a = sc.nextInt();

			System.out.print("두번째 값을 입력해주세요 : ");
			int b = sc.nextInt();

			int total = getSum(a, b);

			System.out.printf("%d ~ %d 사이의 총합 : %d\n", a, b, total);
		}
	}
}
