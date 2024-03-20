package kr.ac.kopo.day08;

public class MethodMain03 {

	public static void main(String[] args) {
		Method m = new Method();
		m.call();
		m.call(10);
		m.call("hello");
		m.call(12.34);
		m.call('A');
		
	}
}
