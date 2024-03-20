package kr.ac.kopo.day05;

import java.util.Arrays;

public class ArrayMain05 {

	public static void main(String[] args) {
		// "2024년" "java" "교육" 문자열을 저장
//		String str = "2024년";
		String str = new String("2024년");
		String str2 = "java";
		String str3 = "교육";

		String[] strArr = { str, str2, str3 };

		System.out.println("원소의 총개수 : " + strArr.length);

		for (int i = 0; i < strArr.length; i++) { // 배열 안의 요소를 출력
			System.out.println(strArr[i]);
		}
		System.out.println("================================");

		for (String s : strArr) { // 자료형 변수 : 집합(배열) 형태
			System.out.println(s);
		}
		System.out.println("================================");
		System.out.println(Arrays.toString(strArr)); // 단순 배열값 확인
	}
}
