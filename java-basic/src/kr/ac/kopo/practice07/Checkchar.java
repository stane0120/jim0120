package kr.ac.kopo.practice07;

public class Checkchar {
	    public static void main(String[] args) {
	        String strData = "Hello World Java";
	        char ch = 'l';
	        int count = checkChar(strData, ch);
	        System.out.println(count);
	    }

	    public static int checkChar(String strData, char ch) {
	        int count = 0;
	        for (int i = 0; i < strData.length(); i++) {
	            if (strData.charAt(i) == ch) {
	                count++;
	            }
	        }
	        return count;
	    }
}