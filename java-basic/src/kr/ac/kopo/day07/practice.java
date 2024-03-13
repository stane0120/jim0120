package kr.ac.kopo.day07;

import java.util.Random;

public class practice {
	public static void main(String[] args) {
		
		Random r = new Random();
		int number = r.nextInt(101) + 20;
		
		System.out.println("< 1 ~ " + number + " 369게임 >");
	    for(int i = 1; i <= number; i++) {
	    	System.out.print(i + "\t");
	    	
	    	int n1 = i % 10;
	    	int n10 = i % 100 / 10;
	    	
	    	if(n1 == 3 || n1 == 6 || n1 == 9 ) {
	    		System.out.print("짝");
	    	}
	    	if(n10 != 0 && n10 % 3 == 0 ){
	    		System.out.print("짝");
	    	}
	    	if(i % 10 == 0) {
	    		n10 = i / 10;
	    		while(n10-- > 0)
	    			System.out.print('뽀');
	    		System.out.print("숑");
	    	}

	    	
	    	System.out.println();
	    }
	}
}
