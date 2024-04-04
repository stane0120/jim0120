package kr.ac.kopo.practice12;

import java.util.Scanner;

public class practice11 {

    public static void main(String[] args) {
    	
            try (Scanner sc = new Scanner(System.in)) {
				int N = sc.nextInt();

				long combinations = (long) Math.pow(N, 2);

				System.out.println(combinations);
			}
        }
    }
