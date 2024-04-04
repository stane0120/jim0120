package kr.ac.kopo.practice12;

import java.util.Scanner;

public class practice11 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // N 입력 받기
        int N = scanner.nextInt();

        // 서로 다른 색상인 조합의 가짓수 구하기
        long combinations = (long) N * (N - 1);

        // 결과 출력
        System.out.println(combinations);

        scanner.close();
    }
}