package kr.ac.kopo.practice11;

import java.util.ArrayList;

public class ab {
public static void main(String[] args) {
	
	ArrayList<String> arr = new ArrayList<String>();
	arr.add("A");
	arr.add("B");
	arr.add("C");
	arr.remove("B");
	arr.add("D");
	arr.add("A");
	arr.remove("A");
	
	for(String s : arr) {
		System.out.println(s);
	}
}
}
