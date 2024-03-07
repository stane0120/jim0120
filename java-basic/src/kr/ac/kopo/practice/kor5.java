package kr.ac.kopo.practice;

import java.util.Scanner;

public class kor5 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("달러를 입력하세요 : ");
			 int a = sc.nextInt();
			 
			 double b = 1092.50;
			 
			 System.out.printf("원화 : %.2f", a * b);
		} 
	}

}
