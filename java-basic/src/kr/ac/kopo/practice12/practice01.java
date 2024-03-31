package kr.ac.kopo.practice12;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {
    	
        try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();

			if(N < 1) {
			    System.out.println("N은 1 이상의 정수이어야 합니다.");
			} else {
			    for (int i = 0; i < 2 * N - 1; i++) {
   
			        for (int j = 0; j < Math.abs(N - 1 - i); j++) {
			            System.out.print(" ");
			        }
   
			        for (int j = 0; j < 2 * Math.min(i + 1, 2 * N - 1 - i) - 1; j++) {
			            System.out.print("*");
			        }
			        System.out.println();
			    }
			}
		}
    }
}
