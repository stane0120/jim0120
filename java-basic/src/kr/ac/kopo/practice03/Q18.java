package kr.ac.kopo.practice03;

public class Q18 {
	public static void main(String[] args) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) { // 9 * 9의 모양을 만든다

				if (i < 4) {
					if (j >= i && j < 9 - i) { // i가 1,2,3일때 이 조건으로 *을 출력한다
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {

					if (j >= 8 - i && j < i + 1) { // i가 4~8일때 이 조건으로 *을 출력한다.
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
