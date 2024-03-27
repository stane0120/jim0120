package kr.ac.kopo.practice10;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n < 1 || n > 10000) {
			System.out.println("1 이상 10000 이하 수를 입력해주세요");
		} else {
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += i;
			}

			System.out.println(sum);

			sc.close();
		}
	}
}
