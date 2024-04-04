package kr.ac.kopo.practice12;

import java.util.Scanner;

public class practice13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			long result = factorial(n);
			System.out.println(result);
		}
    }
    
    public static long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}