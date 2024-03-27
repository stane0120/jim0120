package kr.ac.kopo.practice10;

import java.util.Scanner;

public class Main11 {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int T;
	        do {
	            T = sc.nextInt();
	        } while (T < 1 || T > 10);

	        sc.nextLine();

	        for (int i = 0; i < T; i++) {

	            String str;
	            do {
	                str = sc.nextLine();
	            } while (str.length() >= 1000);

	            char firstChar = str.charAt(0);
	            char lastChar = str.charAt(str.length() - 1);
	            System.out.println(firstChar + "" + lastChar);
	        }

	        sc.close();
	    }
	}

