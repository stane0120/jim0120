package kr.ac.kopo.practice12;

import java.util.Arrays;
import java.util.Scanner;

public class practice05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sides = new int[3];
        for (int i = 0; i < 3; i++) {
            sides[i] = scanner.nextInt();
        }

        Arrays.sort(sides);
        int maxPerimeter = calculateMaxPerimeter(sides[0], sides[1], sides[2]);
        System.out.println(maxPerimeter);

        scanner.close();
    }


    private static int calculateMaxPerimeter(int a, int b, int c) {
  
        return (a + b > c) ? a + b + c : 2 * (a + b) - 1;
    }
}