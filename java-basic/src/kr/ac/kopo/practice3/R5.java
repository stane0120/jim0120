package kr.ac.kopo.practice3;

import java.util.Random;
import java.util.Scanner;

public class R5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int Num = random.nextInt(100) + 1;

		System.out.println("1부터 100 사이의 숫자를 맞춰보세요.");
		System.out.println("기회는 6번 주어집니다.");

		for (int b = 1; b <= 6; b++) {
			System.out.print(b + "번째 시도: ");
			int a = sc.nextInt();

			if (a == Num) {
				System.out.println("축하합니다 정답입니다!!");
				return;
			} else if (a < Num) {
				System.out.printf("%d보다 큰 수입니다\n", a);
				System.out.printf("기회는 총 %d번 남았습니다\n", 6 - b);
			} else {
				System.out.printf("%d보다 작은 수입니다\n", a);
				System.out.printf("기회는 총 %d번 남았습니다\n", 6 - b);
			}
		}

		System.out.println("아쉽습니다, 기회를 다 소진하셨습니다.");
		System.out.println("정답은 [" + Num + "] 입니다");
	}
}


