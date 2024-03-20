package kr.ac.kopo.day09;

import java.util.Arrays;

public class StringMain03 {

	public static void main(String[] args) {

		String s = new String("Hello World!!");

		int len = s.length();

		System.out.printf("[%s] 길이 : %d\n", s, len);
		System.out.printf("7번째에 위치한 문자 : %c\n", s.charAt(7));

		String s2 = "hello";
		System.out.println(s2.charAt(0));
		System.out.println("Hello".charAt(0));

		char[] chars = new char[5];
		s.getChars(6, 11, chars, 0);
		System.out.println("chars : " + Arrays.toString(chars));
	}
}
