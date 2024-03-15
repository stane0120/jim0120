package kr.ac.kopo.practice5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("아이스크림 몇개 구입할래? : ");
		int num = sc.nextInt();
		sc.nextLine();

		IceCream[] iceCreams = new IceCream[num];

		for (int i = 0; i < num; i++) {
			System.out.printf("** %d's 아이스크림 구매정보 입력 **\n", i + 1);
			System.out.print("아이스크림명 : ");
			String name = sc.nextLine();
			System.out.print("아이스크림가격 : ");
			int price = sc.nextInt();
			sc.nextLine();

			iceCreams[i] = new IceCream(name, price);
		}

		System.out.println("\n< 총 " + num + "개의 아이스크림 구매정보 출력 >");
		System.out.println("-------------------------------------------------");
		System.out.println("번호      아이스크림명           아이스크림가격");
		System.out.println("-------------------------------------------------");

		int total = 0;
		for (int i = 0; i < num; i++) {
			IceCream iceCream = iceCreams[i];
			total += iceCream.price;

			System.out.printf("%d            %-8s            %d원\n", i + 1, iceCream.name, iceCream.price);
		}

		System.out.println("-------------------------------------------------");
		System.out.println("총계 : " + total + "원");

		sc.close();
	}
}
