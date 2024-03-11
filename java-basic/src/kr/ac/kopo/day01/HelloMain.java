package kr.ac.kopo.day01;

/**
 * print(), printf() 차이점을 알아봅시다
 * 
 * @author 유저
 * @version 0.1
 */

public class HelloMain {

	/**
	 * 실행하기 위한 메소드
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.print(3);
		System.out.print(' ');
		System.out.print('+');
		System.out.print(' ');
		System.out.print(4);
		System.out.println();
		System.out.println(3 + " + " + 4);
		System.out.printf("[%4d] %c %d\n", 3, '+', 4);
		System.out.printf("[%-4d] %c %d\n", 3, '+', 4);
		System.out.printf("[%04d] %c %d\n", 3, '+', 4);
	}
}
