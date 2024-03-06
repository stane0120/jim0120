package kr.ac.kopo.day02;

import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("나이 : ");
			int a = sc.nextInt();
			sc.nextLine();
			
			if(a < 0) {
				System.out.println("양수를 입력해 주세요.");
			} else if(a < 8) {
				System.out.println("아동입니다.");
			} else if(a < 14) {
				System.out.println("초등학생입니다.");
		    } else if(a < 20) {
				System.out.println("청소년입니다.");
			} else {
				System.out.println("성인입니다.");
}
}
}
}

