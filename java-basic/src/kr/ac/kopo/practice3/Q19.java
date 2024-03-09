package kr.ac.kopo.practice3;

public class Q19 {
	public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
        	
            int a;
            int b;
            
            if (i < 5) {
                a= i + 1;
                b = i + 1;
            } else {
                a = 9 - i;
                b = 9 - i;
            }

            
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }

            
            for (int j = 0; j < 10 - 2 * b; j++) {
                System.out.print(" ");
            }

            
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
