package kr.ac.kopo.practice09;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int year = sc.nextInt();
			int result = isLeapYear(year);
			System.out.println(result);
		}
    }

    public static int isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 1;
        } else {
            return 0;
        }
    }
}

