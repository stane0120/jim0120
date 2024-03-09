package kr.ac.kopo.practice3;

public class Q12 {
	public static void main(String[] args) {
		for(int i = 9 ; i >= 1 ; i--) {
			 if (i <= 5) {
				for(int j = 5 ; j >= i; j--) {
					System.out.print("*");
				} 
			    }else { 
				for(int j = 5 ; j >= 10- i; j--) {
					System.out.print("*");
					}
				}
				System.out.println();
			}
		}
	}

