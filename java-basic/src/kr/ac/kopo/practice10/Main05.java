package kr.ac.kopo.practice10;

import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		if (N < 0 || N > 20) {
			System.out.println("0 이상 20 이하 수를 입력해주세요.");
		} else {
			long factorial = calculateFactorial(N);

			System.out.println(factorial);

			sc.close();
		}
	}

	public static long calculateFactorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * calculateFactorial(n - 1);
		}
	}
}