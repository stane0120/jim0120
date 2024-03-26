package kr.ac.kopo.day13;

import java.util.Scanner;

public class ExceptionMain06 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			try {
				System.out.print("짝수를 입력하세요 : ");
				int num = sc.nextInt();

				if (num % 2 == 1) {
					throw new OddException("입력하신 정수 " + num + "는 홀수입니다.");
				}

				System.out.println("출력 : " + num);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
