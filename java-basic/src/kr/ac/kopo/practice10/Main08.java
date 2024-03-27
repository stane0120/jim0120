package kr.ac.kopo.practice10;

import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 1; i <= 9; i++) {
            int num;
            do {
                num = sc.nextInt();
            } while (num >= 100); 
            if (num > max) {
                max = num;
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);

        sc.close();
    }
}
