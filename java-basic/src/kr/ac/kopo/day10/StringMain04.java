package kr.ac.kopo.day10;

import java.util.Arrays;

public class StringMain04 {

	public static void main(String[] args) {

		String s = "Hello";
		String s2 = new String("Hello");

		System.out.printf("s : [%s]\n", s);
		System.out.printf("s2 : [%s]\n", s2);

		s = new String("Hello");
		s2 = new String("Hello");

		// 주소비교
		System.out.println("-----------------------------");
		if (s == s2) {
			System.out.println("s == s2");
		} else {
			System.out.println("s != s2");
		}

		// 문자열 비교
		System.out.println("-----------------------------");
		boolean bool = s.equals(s2);
		if (bool) {
			System.out.println("equals() : 같다");
		} else {
			System.out.println("equals() : 다르다");
		}

		System.out.println("-----------------------------");
		bool = s.equalsIgnoreCase(s2);
		if (bool) {
			System.out.println("equalsIgnoreCare() : 같다");
		} else {
			System.out.println("equalsignoreCare() : 다르다");
		}

		String[] names = { "홍길동", "김길동", "강길동", "윤갈동", "심길동", "홍길동", "나갈길", "길길순" };

		System.out.println("-----------------------------");
		System.out.println("\"길\" 포함된 사람을 출력");
		for (String name : names) {
			if (name.contains("길")) {
				System.out.println(name);
			}
		}

		System.out.println("-----------------------------");
		System.out.println("<이름이 \"길동\"인 사람을 출력>");
		for (String name : names) {
			if (name.endsWith("길동")) {
				System.out.println(name);
			}
		}

		System.out.println("-----------------------------");
		System.out.println("< \"홍\" 씨 성을 가진 이름을 출력 > ");
		for (String name : names) {
			if (name.startsWith("홍")) {
				System.out.println(name);
			}
		}

		System.out.println("-----------------------------");
		for (String name : names) {
			if (name.charAt(0) == '홍') {
				System.out.println(name);
			}
		}

		// 전체이름이 "홍길동"인 이름을 출력
		System.out.println("-----------------------------");
		System.out.println("< 전체이름이 \"홍길동\"인 이름을 출력 > ");
		for (String name : names) {
			switch (name) {
			case "홍길동" -> {
				System.out.println(name);
				break;
			}
			case "김길동" -> {
				System.out.println("!!");
			}
			}
		}

		System.out.println("-----------------------------");
		for (String name : names) {
			if (name.equals("홍길동")) {
				System.out.println(name);
			}
		}

		System.out.println("-----------------------------");
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("홍길동")) {
				System.out.println(names[i]);
			}
		}
		System.out.println("-----------------------------");
		for (String name : names) {
			if (name.compareTo("홍길동") == 0) {
				System.out.println(name);
			}
		}
		System.out.println(Arrays.toString(names));
	}
}
