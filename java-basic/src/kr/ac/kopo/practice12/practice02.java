package kr.ac.kopo.practice12;

import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			long perimeter = 4L * (n + 1) - 4; 
			System.out.println(perimeter);
		}
    }
}
