package kr.ac.kopo.day15;

import java.util.ArrayList;
import java.util.List;

/*
   LIST 특징 - 중복(O), 순서(O)
            - 
 */

public class ListMain02 {

	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<String>();

		System.out.println("add() 전 원소의 총 개수 : " + list.size());
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println("add() 전 원소의 총 개수 : " + list.size());
		list.add("one");
		System.out.println("add() 전 원소의 총 개수 : " + list.size());

		System.out.println("< 전체 데이터 출력 >");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("\"seven\" 존재여부 : " + list.contains("seven"));
		System.out.println("\"two\" 존재여부 : " + list.contains("two"));
		list.remove("two");
		System.out.println("\"two\" 존재여부 : " + list.contains("two"));

		System.out.println("0번지의 데이터 : " + list.get(0));
		list.add(0, "zero");
		System.out.println("0번지의 데이터 : " + list.get(0));
		System.out.println("1번지의 데이터 : " + list.get(1));

		if (list.isEmpty()) {
			System.out.println("데이터가 존재하지 않습니다");
		} else {
			System.out.println("데이터가 존재합니다");
		}

		list.clear();
		if (list.isEmpty()) {
			System.out.println("데이터가 존재하지 않습니다");
		} else {
			System.out.println("데이터가 존재합니다");
		}
	}
}
