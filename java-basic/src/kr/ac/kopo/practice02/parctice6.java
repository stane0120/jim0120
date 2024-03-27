package kr.ac.kopo.practice02;

import java.util.Scanner;

public class parctice6 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] a = new int[5];

			for (int i = 0; i < 5; i++) {
				System.out.print((i + 1) + "'s 성적: ");
				a[i] = sc.nextInt();

				char b;
				switch (a[i] / 10) {
				case 10:
				case 9:
					b = 'A';
					break;
				case 8:
					b = 'B';
					break;
				case 7:
					b = 'C';
					break;
				case 6:
					b = 'D';
					break;
				default:
					b = 'F';
					break;
				}
				if (a[i] < 0 || a[i] > 100) {
					System.out.println("잘못 입력하셨습니다.");
				} else {
					System.out.println(a[i] + "점의 학점은 " + b + "입니다.");
				}
			}
		}
	}
}
