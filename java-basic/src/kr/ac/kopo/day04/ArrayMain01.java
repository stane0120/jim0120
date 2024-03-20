package kr.ac.kopo.day04;

import java.util.Scanner;

/*
      1's : 10
      2's : 34
      3's : 276
      
      print
      10 34 276
 */

public class ArrayMain01 {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int[] arr = new int[3];

			for (int i = 0; i < arr.length; i++) {
				System.out.printf(i + 1 + "\'s num : ");
				arr[i] = sc.nextInt();
			}
			System.out.println(" < PRINT > ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}

		System.out.println();
	}
}
