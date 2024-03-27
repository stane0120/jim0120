package kr.ac.kopo.practice09;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			sc.nextLine();

			String numbers = sc.nextLine();
			int sum = 0;
			for (int i = 0; i < N; i++) {
			    int digit = Character.getNumericValue(numbers.charAt(i));
			    sum += digit;
			}

			System.out.println(sum);
		}
    }
}

