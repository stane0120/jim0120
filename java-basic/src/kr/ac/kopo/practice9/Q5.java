package kr.ac.kopo.practice9;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();

			if (N < 1 || N > 100) {
			    System.out.println("잘못 입력하셨습니다.");
			} else {
			    for (int i = 1; i <= N; i++) {

			        for (int j = 1; j <= N - i; j++) {
			            System.out.print(" ");
			        }
			        for (int j = 1; j <= 2 * i - 1; j++) {
			            System.out.print("*");
			        }
			        System.out.println();
			    }
			}
		}
    }
}
