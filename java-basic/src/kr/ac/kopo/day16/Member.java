package kr.ac.kopo.day16;

import java.io.Serializable;

/*
 		alt + shift + s 누룬 후 	c 선택  => 기본생성자
 		                       	o 선택  => 매개변수를 가지는 생성자
 		                       	r 선택  => getter/setter 메소드
 		                       	s 선택  => toString() 오버라이딩
 */

public class Member implements Serializable { // 기본생성자

	private String id;
	private /* transient */ String name;
	private String phone;

	public Member() {
		super();
	}

	public Member(String id, String name, String phone) { // 매개변수를 가지는 생성자
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public String getId() { // getter/setter 메서드
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() { // 오버라이딩
		return "Member [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
}