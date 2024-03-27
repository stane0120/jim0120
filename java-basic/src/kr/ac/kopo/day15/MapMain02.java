package kr.ac.kopo.day15;

import java.util.HashMap;
import java.util.Map;

class Car {
	@SuppressWarnings("unused")
	private String no;
	@SuppressWarnings("unused")
	private String model;
	
	public Car(String no, String model) {
		this.no = no;
		this.model = model;
	}
}
class Person extends Object{
	private String name;
	private String phone;

	public Person(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this.name == null || this.phone == null)
			return false;
		
		Person p = (Person)obj;
		
		if(this.name.equals(((Person)obj).name) && this.phone.equals(p.phone)) {
			return true;
		}
		
		return false;
	}
}


public class MapMain02 {
	
	public static void main(String[] args) {
		
		Map<Person, Car> map = new HashMap<Person, Car>();
		
		map.put(new Person("홍길동", "010-1111-2222"), new Car("12가3456", "소나타"));
		map.put(new Person("홍길순", "010-3333-4444"), new Car("34너5678", "산타페"));
		map.put(new Person("홍길동", "010-5555-6666"), new Car("55다2763", "모닝"));
		map.put(new Person("홍길동", "010-1111-2222"), new Car("11라3333", "제네시스"));
		
		System.out.println("등록된 차량개수 : " + map.size());
	}
}
