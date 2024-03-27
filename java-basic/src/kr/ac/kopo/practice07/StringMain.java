package kr.ac.kopo.practice07;

public class StringMain {
	
	public static void main(String[] args) {
		
		StringUtil st = new StringUtil();
		
		System.out.println(st.isUpperChar('A'));
		System.out.println(st.isLowerChar('A'));
		System.out.println(st.max(9, 1));
		System.out.println(st.min(9, 1));
		System.out.println(st.reverseString("ABC"));
		System.out.println(st.toUpperString("a"));
		System.out.println(st.toLowerString("B"));
	}
}
