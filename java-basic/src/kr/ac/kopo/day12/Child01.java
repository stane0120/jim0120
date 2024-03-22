package kr.ac.kopo.day12;

public class Child01 extends Parent {
	
	private String name;
	private int age;
	
	public Child01() {
		name = "자식01";
		age = 20;
	}
	
	@Override
	public void info() {
		System.out.println("나는 자식01이고 나이는 " + age + "살입니다");
	}
	
	public void study() {
		System.out.println("나는 공부를 합니다");
	}
	
	public void sleep() {
		System.out.println("나는 잠을 잡니다");
	}
}
