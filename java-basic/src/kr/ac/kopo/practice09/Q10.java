package kr.ac.kopo.practice09;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int max = 0;
			int index = 0;

			for (int i = 1; i <= 9; i++) {
			    int num = sc.nextInt();
			    if (num > max) {
			        max = num;
			        index = i;
			    }
			}

			System.out.println(max);
			System.out.println(index);
		}
    }
}
