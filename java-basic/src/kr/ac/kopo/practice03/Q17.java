package kr.ac.kopo.practice03;

public class Q17 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < Math.abs(4 - i); j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 9 - 2 * Math.abs(4 - i); j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
