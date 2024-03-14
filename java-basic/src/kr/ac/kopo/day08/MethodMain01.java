package kr.ac.kopo.day08;

/*
   **********
   Hello
   **********
   Hi
   **********
   Good-bye
   ********** 
 */
public class MethodMain01 {
	
    static void printStart(char ch, int cnt) {
    	for(int i = 0; i < cnt; i++) {
    	System.out.print(ch);
    }
    System.out.println();	
    }

	public static void main(String[] args) {
		
		/*
		{
			for (int i = 0; i < 4; i++) {
				System.out.println("**********");
				if (i == 0) {
					System.out.println("Hello");
				} else if (i == 1) {
					System.out.println("Hi");
				} else if (i == 2) {
					System.out.println("Good-bye");
				}
			}
		}
		*/
		
		printStart('*', 10);
		System.out.println("Hello");
		printStart('!', 5);
		System.out.println("Hi");
		printStart('-', 20);
		System.out.println("Good-bye");
		printStart('#', 16);
	}
}

