package kr.ac.kopo.practice09;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int sum = 0;
			int min = 101;

			for (int i = 0; i < 7; i++) {
				int num = sc.nextInt();
				if (num % 2 != 0) {
					sum += num;
					if (num < min) {
						min = num;
					}
				}
			}

			if (sum == 0) {
				System.out.println(-1);
			} else {
				System.out.println(sum);
				System.out.println(min);
			}
		}
	}
}
