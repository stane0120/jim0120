package kr.ac.kopo.practice12;

import java.util.Scanner;

public class practice12 {
	   public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {
				int N = sc.nextInt();

				int[] dp = new int[N + 1];
				dp[0] = 1; 

				for (int i = 1; i <= N; i++) {
				    for (int j = 1; j <= i; j++) {
				        dp[i] += dp[i - j]; 
				    }
				}

				System.out.println(dp[N]);
			}
	    }
	}
