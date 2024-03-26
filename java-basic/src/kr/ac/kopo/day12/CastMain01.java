package kr.ac.kopo.day12;

public class CastMain01 {
	
	/*
	public static void print(Child02 c) {
		c.info();
	}
	
	public static void print(Child01 c) {
		c.info();
	}
	*/
	public static void print(Parent p) {
		p.info();
	}
	
	public static Parent getObject() {
//		return new Parent();
	    return new Child01();
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Parent obj = getObject();
		
		print(new Child01());
		print(new Child02());
		print(new Parent());
		
		Parent p = new Child01();
		p.info();
		
		p = new Child02();
		p.info();
		
		p = new Parent();
		p.info();
	}
}