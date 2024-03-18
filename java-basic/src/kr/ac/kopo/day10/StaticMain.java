package kr.ac.kopo.day10;

class Test {
	int a = 100;
	static int b = 50;
}

public class StaticMain {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Test t = new Test();
		t.a = 30;
		Test t2 = new Test();
		t2.a = 90;
		
		t.b = 10000;
		
		System.out.println(t.a);
		System.out.println(t2.a);		
		System.out.println(t.b);
		System.out.println(t2.b);	
	}
}
