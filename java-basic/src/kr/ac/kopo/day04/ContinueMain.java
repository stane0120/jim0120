package kr.ac.kopo.day04;

public class ContinueMain {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("A");
				if (j > i) {
					break;
				}
				System.out.print("B");
			}
			System.out.println();
		}
	}
}
