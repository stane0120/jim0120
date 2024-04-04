package kr.ac.kopo.practice12;

import java.util.Scanner;

public class practice10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N 입력 받기
        int N = scanner.nextInt();

        // 초기 상태에서 정사각형의 갯수는 4개
        int squares = 4;

        // N번의 과정을 반복하여 정사각형의 갯수 구하기
        for (int i = 1; i < N; i++) {
            // 새로운 정사각형의 갯수는 이전 정사각형의 3배 + 1
            squares = squares * 3 + 1;
        }

        // 결과 출력
        System.out.println(squares);

        scanner.close();
    }
}