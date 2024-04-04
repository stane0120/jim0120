package kr.ac.kopo.practice12;

import java.util.Scanner;

public class practice08 {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();
         int answer = 4;

         // 메모이제이션 테이블 생성
         int[] memo = new int[n + 1];
         memo[1] = 4;

         // 1부터 n까지 반복
         for (int i = 2; i <= n; i++) {
             // 각 변의 중앙에 점 추가
             memo[i] *= 2;

             // 홀수 번 과정에서 정사각형 중심에 점 추가
             if (i % 2 == 1) {
                 memo[i] += 1;
             }

             // 중복되는 점 제거
             for (int j = 1; j < i; j++) {
                 if (i % j == 0) {
                     memo[i] -= memo[j];
                 }
             }
         }

         // 결과 출력
         System.out.println(memo[n]);
     }
 }