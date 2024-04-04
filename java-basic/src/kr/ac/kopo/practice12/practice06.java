package kr.ac.kopo.practice12;

import java.util.Scanner;

public class practice06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();


            if (a == 0 && b == 0 && c == 0) {
                break;
            }


            if (isValidTriangle(a, b, c)) {

                if (a == b && b == c) {
                    System.out.println("Equilateral");
                } else if (a == b || b == c || c == a) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }
        }

        scanner.close();
    }


    private static boolean isValidTriangle(int a, int b, int c) {

        int maxSide = Math.max(Math.max(a, b), c);

        int sumOfOtherTwoSides = a + b + c - maxSide;

        return maxSide < sumOfOtherTwoSides;
    }
}
