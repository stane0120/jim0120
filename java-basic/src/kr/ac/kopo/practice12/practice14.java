package kr.ac.kopo.practice12;

import java.util.Scanner;

public class practice14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int B = sc.nextInt();
			
			String result = convertToBaseB(N, B);
			System.out.println(result);
		}
    }
    
    public static String convertToBaseB(int N, int B) {
        StringBuilder sb = new StringBuilder();
        
        while (N > 0) {
            int remainder = N % B;
            if (remainder < 10)
                sb.insert(0, remainder);
            else
                sb.insert(0, (char) ('A' + remainder - 10)); 
            N /= B;
        }
        
        return sb.toString();
    }
}
