package kr.ac.kopo.practice01;

import java.util.Scanner;

public class kor07 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("입력(알파벳) : ");
			char a = sc.nextLine().charAt(0);

			if (Character.isUpperCase(a)) {
				a = Character.toLowerCase(a);
			} else {
				a = Character.toUpperCase(a);
			}
			System.out.printf("변경된 값 : %s", a);
		}
	}
}
