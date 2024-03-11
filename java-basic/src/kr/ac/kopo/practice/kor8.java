package kr.ac.kopo.practice;

import java.util.Scanner;

public class kor8 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("물건값을 입력 : ");
			int a = sc.nextInt();
			sc.nextLine();

			System.out.print("지불할 돈의 액수 : ");
			int b = sc.nextInt();
			sc.nextLine();

			int c = b - a;
			int d = c / 1000;
			int e = (c - (d * 1000)) / 500;
			int f = (c - (d * 1000) - (e * 500)) / 100;
			int g = (c - (d * 1000) - (e * 500) - (f * 100)) / 50;
			int h = (c - (d * 1000) - (e * 500) - (f * 100) - (g * 50)) / 10;

			System.out.printf("거스름돈 : %d원 \n", c);
			System.out.printf("1000원 : %d개 \n", d);
			System.out.printf("500원 : %d개 \n", e);
			System.out.printf("100원 : %d개 \n", f);
			System.out.printf("50원 : %d개 \n", g);
			System.out.printf("10원 : %d개 \n", h);
		}
	}
}
