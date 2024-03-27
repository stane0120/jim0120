package kr.ac.kopo.practice03;

public class Q14 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				if (i < 5) {
					if (j >= 4 - i && j <= 4) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {

					if (j >= 4 - (8 - i) && j <= 4) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
