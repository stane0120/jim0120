package kr.ac.kopo.day12;

public class Child02 extends Parent {
	
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int age;
	
	public Child02() {
		name = "자식02";
		age = 17;
	}
	
	@Override
	public void info() {
		System.out.println("나는 자식02이고 나이는 17살입니다");
	}
	
	public void play() {
		System.out.println("나는 놉니다");
	}
	
	public void sing() {
		System.out.println("나는 노래를 부릅니다");
	}
}
