package kr.ac.kopo.practice04;

import java.util.Scanner;

public class QU1 {
	public static void main(String[] args) { 
		try (Scanner sc = new Scanner(System.in)) {
			int[] num = new int[10];
			int a = 0;
			int b = 0;

			System.out.println("10개의 정수를 입력하세요:");
			for (int i = 0; i < 10; i++) {
				num[i] = sc.nextInt();
			}

			System.out.println("< 짝수 >");
			for (int number : num) {
				if (number % 2 == 0) {
					System.out.print(number + " ");
					a++;
				}
			}
			System.out.println("\n짝수 정수의 개수: " + a);

			System.out.println("< 홀수 >");
			for (int number : num) {
				if (number % 2 != 0) {
					System.out.print(number + " ");
					b++;
				}
			}
			System.out.println("\n홀수 정수의 개수: " + b);
		}
		}
	}

