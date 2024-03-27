package kr.ac.kopo.practice04;

import java.util.Random;

public class QU2 {
	public static void main(String[] args) {
		Random ran = new Random();

		System.out.println("< PRINT >");
		for (int i = 0; i < 5; i++) {
			int num = ran.nextInt(100);
			System.out.print(num + " ");
		}
		System.out.println();

		System.out.println("< REVERSE >");
		for (int i = 5; i > 0; i--) {
			int num = ran.nextInt(100);
			{
				System.out.print(num + " ");
			}
		}
	}
}
