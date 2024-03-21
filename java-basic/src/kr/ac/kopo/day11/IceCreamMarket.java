package kr.ac.kopo.day11;

import java.util.Scanner;

public class IceCreamMarket {

	private IceCream[] iceList;
	Scanner sc = new Scanner(System.in);
	
	public int scanInt() {
		Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			sc.nextLine();
			return num;
		}
	
	
	public void open() {
		
		System.out.print("아이스크림 몇개 구입할래? => ");
		int cnt = scanInt();
		
		iceList = new IceCream[cnt];
		
		for(int i = 0; i < iceList.length; i++) {
			System.out.println("** " + (i + 1) + "번째 아이스크림 구매정보 입력 **");
			System.out.print("아이스크림명 : ");
			String name = sc.nextLine();
			System.out.print("아이스크림가격 : ");
			int price = scanInt();
			
			iceList[i] = new IceCream(name, price);
		}
		
		printReceipt();
	}
	
	public void printReceipt() {
		System.out.println("---------------------------------------------------");
		System.out.println("\t총 " + iceList.length + "개 아이스크림 구매정보 출력");
		System.out.println("---------------------------------------------------");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		System.out.println("---------------------------------------------------");
		for(int i = 0; i < iceList.length; i++) {
			IceCream ice = iceList[i];
			System.out.printf("%3d\t%-12s\t%5d\n", i+1, ice.getName(), ice.getPrice());
		}
		System.out.println("---------------------------------------------------");
	}
}
