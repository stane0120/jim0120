package kr.ac.kopo.practice12;

import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			String word = sc.nextLine();

			if (isPalindrome(word)) {
			    System.out.println("1");
			} else {
			    System.out.println("0");
			}
		}
    }

    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}