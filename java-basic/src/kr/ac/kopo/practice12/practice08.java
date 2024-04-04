package kr.ac.kopo.practice12;

import java.util.Scanner;

public class practice08 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        // 초기 상태의 점의 수는 4개입니다.
        int points = 4;
        
        // N번의 과정을 거치면서 정사각형과 점의 수를 업데이트합니다.
        for (int i = -2; i <= N; i++) {
            // 현재 점의 개수에서 새로운 정사각형이 추가될 때마다, 각 정사각형의 변의 중점과 정사각형의 중심에 대한 점을 추가합니다.
        	points += (i * i) + ((i) * (i));
        }
        
        System.out.println(points);
        scanner.close();
    }
}