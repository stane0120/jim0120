package kr.ac.kopo.day12;

public class CastMain02 {
	
	public static void info(Parent p) {
		if(p instanceof Child01) {
			Child01 c = (Child01)p;
			c.study();
			c.sleep();
			c.info();
		} else if(p instanceof Child02) {
			Child02 c = (Child02)p;
			c.play();
			c.sing();
		}
		p.info();
		
		/*
		System.out.println("p instanceof Child01 : " + (p instanceof Child01));
		System.out.println("p instanceof Child02 : " + (p instanceof Child02));
		System.out.println("p instanceof Parent : " + (p instanceof Parent));
		*/
		
//		Child02 c = (Child02)p;
//		c.info();
//		c.sing();
//		c.play();
	}
	
	public static void main(String[] args) {
		
		// 묵시적형변환    부모타입 = 지식타입
		// Parent p = new Child01();
		
		// 명시적형변환    자식타입 = (자식타입)부모타입	
		// Child01 c01 = (Child01)new Parent(); // 실행시 오류
		/*
		Parent p = new Child01();
		Child01 c01 = (Child01)p;
		c01.study();
		c01.sleep();
		c01.info();
		*/
		
//		info(new Parent());
//		info(new Child01());
		info(new Child02());
	}
}
