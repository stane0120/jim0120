package kr.ac.kopo.practice10;

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, X;
        do {
            N = sc.nextInt();
            X = sc.nextInt();
        } while (N < 1 || N > 10000 || X < 1 || X > 10000);

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            int num;
            do {
                num = sc.nextInt();
            } while (num < 1 || num > 10000);
            A[i] = num;
        }

        for (int i = 0; i < N; i++) {
            if (A[i] < X) {
                System.out.print(A[i] + " ");
            }
        }

        sc.close();
    }
}

