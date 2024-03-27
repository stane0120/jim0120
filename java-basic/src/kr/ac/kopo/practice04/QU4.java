package kr.ac.kopo.practice04;

import java.util.Scanner;

public class QU4 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] num = new int[5];
			int count = 0;

			System.out.println("짝수를 5개 입력하세요:");

			while (count < 5) {
				System.out.printf("num%d : ", count + 1);
				int number = sc.nextInt();
				if (number % 2 == 0) {
					num[count] = number;
					count++;
				} else {
					System.out.print("");
				}
			}

			System.out.println("< PRINT >");
			for (int i = 0; i < 5; i++) {
				System.out.print(num[i]);
				if (i != 4) {
					System.out.print("  ");
				}
			}
		}
		}
	}
