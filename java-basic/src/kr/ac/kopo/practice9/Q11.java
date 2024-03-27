package kr.ac.kopo.practice9;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int[][] A = new int[N][M];
			for (int i = 0; i < N; i++) {
			    for (int j = 0; j < M; j++) {
			        A[i][j] = sc.nextInt();
			    }
			}

			int[][] B = new int[N][M];
			for (int i = 0; i < N; i++) {
			    for (int j = 0; j < M; j++) {
			        B[i][j] = sc.nextInt();
			    }
			}

			int[][] result = new int[N][M];
			for (int i = 0; i < N; i++) {
			    for (int j = 0; j < M; j++) {
			        result[i][j] = A[i][j] + B[i][j];
			        System.out.print(result[i][j] + " ");
			    }
			    System.out.println();
			}
		}
    }
}

