package kr.ac.kopo.practice11;

import java.util.Set;
import java.util.TreeSet;

public class abc {
public static void main(String[] args) {
	
	Set<String> set = new TreeSet<String>();
	
	set.add("one");
	set.add("two");
	set.add("three");
	set.add("four");
	boolean bool = set.add("five");
	System.out.println("bool = " + bool);
	set.add("six");
	set.add("seven");
	bool = set.add("five");
	System.out.println("bool = " + bool);
	
	set.remove("three");
	
	System.out.println("삭제후 데이터 개수 : " + set.size());
	
	if(set.contains("three")) {
		System.out.println("three가 존재합니다");
	} else {
		System.out.println("three가 존재하지 않습니다");
	}
}
}
