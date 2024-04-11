package kr.ac.kopo.practice12;

import java.util.Scanner;

public class practice12 {
	   @SuppressWarnings("resource")
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt();
	        
	        int[] dp = new int[N + 1];
	        
	        if (N == 1) {
	            System.out.println(2);
	            return;
	        }
	        

	        dp[1] = 2; 
	        

	        for (int i = 2; i <= N; i++) {
	            dp[i] = dp[i - 1] * 2; 
	        }
	        
	        System.out.println(dp[N]);
	        
	        sc.close();
	    }
	}