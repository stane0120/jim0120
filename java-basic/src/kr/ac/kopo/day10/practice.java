package kr.ac.kopo.day10;

public class practice {
	
	public static void main(String[] args) {
		
		String word = "hello world";
		String word2 = "hello";

		int cmp = word.compareTo(word2);

		if (cmp == 0) {
			System.out.printf("%s == s\n", word, word2);
		} else if (cmp > 0) {
			System.out.printf("%s > s\n", word, word2);
		} else {
			System.out.printf("%s < s\n", word, word2);
		}
	}
}
