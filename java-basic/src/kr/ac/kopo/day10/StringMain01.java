package kr.ac.kopo.day10;

public class StringMain01 {

	public static void main(String[] args) {

		char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		String s = new String();
		String s2 = new String(chars);
		String s3 = new String(chars, 3, 4);
		String s4 = new String("Hello");

		System.out.println("s : [" + s + "]");
		System.out.println("s2 : [" + s2 + "]");
		System.out.println("s3 : [" + s3 + "]");
		System.out.println("s4 : [" + s4 + "]");
	}
}
