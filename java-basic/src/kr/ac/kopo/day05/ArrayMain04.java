package kr.ac.kopo.day05;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {

//		int[] arr = new int[] {10, 20, 30, 40, 50};
		int[] arr = { 10, 20, 30, 40, 50 };

//		int[] arr = new int[5];

//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();

		arr = new int[8];

		arr = new int[] { 8, 7, 6, 5, 4, 3, 2, 1 };

		/*
		 * 배열의 모든 원소를 출력방식 1. index를 이용한 출력 2. 1.5버전의 for문을 이용한 출력
		 */

		System.out.println("< index를 이용한 출력 >");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();

		System.out.println("< 1.5버전의 for문을 이용한 출력 >");
		for (int data : arr) {
			System.out.print(data + "  ");
		}
		System.out.println();

		System.out.println(" < Arrays.toString() 메소드를 이용한 출력 >");
		System.out.println(Arrays.toString(arr));
	}
}
