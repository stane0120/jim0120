package kr.ac.kopo.practice10;

import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		if (N > 100000) {
			System.out.println("10000보다 작은 수를 입력해주세요");
		} else {
			for (int i = 1; i <= N; i++) {
				System.out.println(i);
			}

			sc.close();
		}
	}
}
