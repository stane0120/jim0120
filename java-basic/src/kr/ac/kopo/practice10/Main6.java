package kr.ac.kopo.practice10;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		if (N < 1 || N > 100) {
			System.out.println("1 이상 100 이하 수를 입력해주세요");
		} else {
			int[] numbers = new int[N];
			for (int i = 0; i < N; i++) {
				numbers[i] = sc.nextInt();
			}


			int v = sc.nextInt();
			int count = countOccurrences(numbers, v);

			System.out.println(count);

			sc.close();
		}
	}
	
	public static int countOccurrences(int[] arr, int v) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == v) {
				count++;
			}
		}
		return count;
	}
}
