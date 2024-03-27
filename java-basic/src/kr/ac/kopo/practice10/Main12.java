package kr.ac.kopo.practice10;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        do {
            N = sc.nextInt();
        } while (N < 1 || N > 100);

        sc.nextLine();

        String numbers;
        do {
            numbers = sc.nextLine();
        } while (numbers.length() != N);

        int sum = 0;
        for (int i = 0; i < N; i++) {
            int digit = Character.getNumericValue(numbers.charAt(i));
            sum += digit;
        }

        System.out.println(sum);

        sc.close();
    }
}