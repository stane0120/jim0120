package kr.ac.kopo.day03;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("우리들은 연습이다");
			System.out.print("몇번 반복하겠습니까? : ");
			int a = sc.nextInt();
			
			for(int i = 1; i <= a  ; i++  ) {
				System.out.println("Hello");
			}
		}
		
		System.out.println("종료");		
	}
}
