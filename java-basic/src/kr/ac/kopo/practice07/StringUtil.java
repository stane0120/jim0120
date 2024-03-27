package kr.ac.kopo.practice07;

public class StringUtil {
	
	boolean isUpperChar (char c) {
		if(c >= 'A' && c <= 'Z') {
			return true;
		} else {
			return false;
		}
		}
	boolean isLowerChar (char c) {
		if( c >= 'a' && c <= 'z') {
			return true;
		} else {
			return false;
		}
	}
	
	int max(int i, int j) {
		if( i > j ) {
			return i;
		} else {
			return j;
		}
	}
	
	int min(int i, int j) {
		if( i > j) {
			return j;
		} else {
			return j;
		}
	}
	
	String reverseString( String str ){
		return new StringBuilder(str).reverse().toString();
	}
	
	String toUpperString( String str ) {
		return str.toUpperCase();
	}
	
	String toLowerString( String str ) {
		return str.toLowerCase();
	}
}

