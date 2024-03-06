package kr.ac.kopo.day02;

import java.util.Scanner;

public class ScannerMain01 {
	public static void main(String[] args) {
		
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("문자를 입력 : ");
			  char d = sc.nextLine().charAt(0);
			  System.out.println("d : " + d);
			
			  System.out.print("정수 입력 : ");
//        int a = 10;
			  int a = sc.nextInt();
			  sc.nextLine();
			  System.out.println("a : " + a);
			  
			  System.out.print("실수 입력 : ");
			  double b = sc.nextDouble();
			  sc.nextLine();
			  System.out.println("b : " + b);
			  
			  System.out.print("문자열을 입력 : ");
//          String c = sc.next(); // 단어단위 입력          
			    String c = sc.nextLine(); // 문장단위 입력
			  System.out.println("c : " + c);
		}
	}
}
