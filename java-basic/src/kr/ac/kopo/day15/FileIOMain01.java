package kr.ac.kopo.day15;

import java.io.IOException;
import java.io.InputStream;
// import java.util.Scanner;
import java.io.InputStreamReader;

public class FileIOMain01 {

	public static void main(String[] args) {
		// quit가 나올때까지 문자를 입력받아 출력하는 코드를 작성
		System.out.println("문자를 입력하세요 ctrl+c 입력시 종료");
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		while (true) {
			try {
				int ch = isr.read();
				if (ch == -1)
					break;
				System.out.print((char)ch);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		/*
		 * Scanner sc = new Scanner(System.in); while(true) { String str =
		 * sc.nextLine(); if(str.equals("quit")) break; System.out.println(str); }
		 */
	}
}
