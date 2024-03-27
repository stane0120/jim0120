package kr.ac.kopo.day15;

public class TestMain {

		public static void main(String[] args) {
			
			CEO ceo = CEO.getInstance();				
			System.out.println(ceo.toString());
			ceo = CEO.getInstance();
			System.out.println(ceo.toString());
			
			Person p = new Person("홍길동", "010-1111-2222");
			Person p2 = new Person("홍길동", "010-1111-3333");
			Person p3 = new Person("홍길동", "010-1111-2222");
			
			if(p.equals(p2)) {
				System.out.println("p == p2");
			} else {
				System.out.println("p != p2");
			}
			
			if(p.equals(p3)) {
				System.out.println("p == p3");
			} else {
				System.out.println("p != p3");
			}
			
			System.out.println(p.hashCode());
			System.out.println(p2.hashCode());
			System.out.println(p3.hashCode());
			
			String s = "hello";
			String s2 = new String("hello");
			
			if(s.equals(s2)) {
				System.out.println("s == s2");
			} else {
				System.out.println("s != s2");
			}
			
			System.out.println(s.hashCode());
			System.out.println(s2.hashCode());
			
		}
	}
