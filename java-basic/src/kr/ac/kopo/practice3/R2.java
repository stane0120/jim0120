package kr.ac.kopo.practice3;

public class R2 {

	public static void main(String[] args) {
		
		for (int a = 2 ; a <= 9 ; a++) {
			
			System.out.println("===" + a + "단" +  "===");
			for (int b = 1 ; b <= 9 ; b++) {
				System.out.printf("%d x %d = %d\n", a, b, a*b);
			}
			System.out.println();
		}
	}
}
