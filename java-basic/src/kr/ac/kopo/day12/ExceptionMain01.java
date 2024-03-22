package kr.ac.kopo.day12;

import java.util.Random;

public class ExceptionMain01 {
	
	public static void main(String[] args) {
		
		System.out.println("--------------start----------------");
		
		Random r = new Random();
		int num = r.nextInt(3);
		System.out.println("추출된 난수 : " + num);
		System.out.println(10 / num);
		
		System.out.println("---------------end-----------------");
	}
}
