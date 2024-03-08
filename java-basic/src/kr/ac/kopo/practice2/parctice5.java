package kr.ac.kopo.practice2;

import java.util.Scanner;

public class parctice5 {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("2 ~ 10 사이의 정수 입력 : ");
			int i = Integer.parseInt(sc.nextLine());
			
			    if(i < 2 || i > 10) {
				System.out.print("2 ~ 10 사이의 정수를 입력해주세요");
				
			    } else {
			
			    for(int a = 1 ; a <= 100 ; a++) {		
			      if( a % i != 0) {
					System.out.print("");
				} else {
					System.out.print(a + " ");
				}
			}
}
		}
}
}

