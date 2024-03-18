package kr.ac.kopo.day10;

public class StringMain02 {

	public static void main(String[] args) {

		String s = new String("Hello");
		String s2 = "Hello";

		String s3 = new String("Hello");
		String s4 = "Hello";

		s = new String("Good-bye");
		s2 = "hi";
		s3 = new String("Hi");
		s4 = "abc";

		s = new String("Hello");
		s2 = "Hello";

		System.out.println("s : [" + s + "]");
		System.out.println("s2 : [" + s2 + "]");
		System.out.println("s3 : [" + s3 + "]");
		System.out.println("s4 : [" + s4 + "]");
	}
}
