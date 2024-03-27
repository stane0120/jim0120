package kr.ac.kopo.practice03;

public class Q13 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			if (i < 5) {

				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}

				for (int j = 0; j < 5 - i; j++) {
					System.out.print("*");
				}
			} else {

				for (int j = 0; j < 8 - i; j++) {
					System.out.print(" ");
				}

				for (int j = 0; j < i - 3; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
