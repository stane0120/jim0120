package kr.ac.kopo.day02;

public class OperationMain01 {

	public static void main(String[] args) {

		int a = 0, b = 1, c = -1;

//      boolean result = ++a > 0 && ++b >= 1 && ++c > 0; // a 1 b 2 c 0   false
//      boolean result = a++ > 0 || b++ >= 1 || c++ > 0; // a 1 b 2 c -1  true
//      boolean result = a-- >= 0 || b-- >= 0 && c-- > 0;  // a -1 b 1 c -1 true
		boolean result = b-- >= 0 && c-- >= 0 || a-- > 0; // a -1 b 0 c -2 false

		System.out.println(result); // false
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
	}
}
