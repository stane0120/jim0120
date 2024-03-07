package kr.ac.kopo.day03;
/*
 *  1 입력시 -> "ONE"
 *  2       -> "TWO"
 *  3       -> "THREE"
 *  그외   -> "ERROR"
 */

import java.util.Random;

public class SwitchMain01 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int num = r.nextInt(5) + 1; // 0+1 ~ 4+1 => 1 ~ 5
		
		System.out.println("num : " + num);
		
		switch(num) {
			case 1 : System.out.println("ONE"); break;
			case 2 : System.out.println("TWO"); break;
			case 3 : System.out.println("THREE"); break;
			case 4 : System.out.println("FOUR"); break;
			default : System.out.println("ERROR"); break;
			
		}
	}

}
