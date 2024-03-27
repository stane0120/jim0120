package kr.ac.kopo.practice04;

import java.util.Scanner;

public class QU5 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("1 ~ 100사이의 정수를 입력해주세요. : ");
			int num = sc.nextInt();

			if (num < 1 || num > 100) {
				System.out.println("잘못된 입력입니다. 1부터 100 사이의 정수를 입력하세요.");
				return;
			}

			int count = 0;
			System.out.print("\n" + num + "의 약수의 개수 : ");

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			System.out.println(count + "개");

			System.out.print("약수 : ");
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					System.out.print(i + "  ");
				}
			}
		}
		}
	}

