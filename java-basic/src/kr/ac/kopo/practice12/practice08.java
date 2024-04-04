package kr.ac.kopo.practice12;

import java.util.Scanner;

public class practice08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int product = num1 * num2;

        String result = String.valueOf(product);

        for (int i = 0; i < 4; i++) {
            System.out.println(result.charAt(i + 2));
        }

        scanner.close();
    }
}