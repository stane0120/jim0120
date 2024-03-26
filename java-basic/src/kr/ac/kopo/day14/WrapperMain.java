package kr.ac.kopo.day14;


/*
                 java.lang
     기본자료형    참조자료형(Wrapper Class)
     boolean     Boolean
     char        Character
     byte        Byte
     short       Short
     int         Integer
     long        Long
     float       Float
     double      Double
 */

public class WrapperMain {
	
	public static void main(String[] args) {
		
		int i = 100;
		@SuppressWarnings("removal")
		Integer i2 = new Integer(100);
		
		@SuppressWarnings({ "removal", "unused" })
		int i3 = new Integer(100);
		
	    @SuppressWarnings("unused")
		Integer i4 = 100;
		
		System.out.println(i);
		System.out.println(i2);
	}
}
