package kr.ac.kopo.day09;

public class Member {
	String name;
	int age;
	String bloodType;
	
	Member() {
		this("알수없음", -1);
	}
	
	Member(String name) {
		this(name, -1, "알수없음");
	}
	
	Member(String name, int age){
		this(name, age, "알수없음");
		System.out.println("Member(name, age) -> this(name, age, none)");
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	void info() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 혈액형 : " + bloodType);
	}
}
