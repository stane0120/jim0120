package kr.ac.kopo.practice;

import java.util.Scanner;

public class kor2 {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("초를 입력 : ");
			int a = sc.nextInt();
			
			int b = a / 3600;
			int c = (a / 60) - (b * 60);
			int d = a % 60;
			
			
			System.out.printf("%d초 : " + "%d시간 %d분 %d초", a, b, c, d);
		}
		
	}

}
