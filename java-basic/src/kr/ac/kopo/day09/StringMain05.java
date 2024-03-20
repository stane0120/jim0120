package kr.ac.kopo.day09;

import java.util.Arrays;

public class StringMain05 {
	
	public static void main(String[] args) {
		
		String str = "hello world";
		char search = 'o';
		
		int idx = str.indexOf(search);
		System.out.println("indexof() : " + search + "문자의 위치 : " + idx);
		
		idx = str.lastIndexOf(search);
		System.out.println("lastIndexof() : " + search + "문자의 위치 : " + idx);
		
		search = 'p';
		idx = str.indexOf(search);
		System.out.println("indexof() : " + search + "문자의 위치 : " + idx);
		
		search = 'o';
		System.out.println("< [" + str + "]에서 " + search + "문자 위치 >");
		idx = str.indexOf(search);
		while(idx != -1) {
			System.out.println("찾은 위치 : " + idx);
			idx = str.indexOf(search, idx+1);
		}
		System.out.println("---------------------------------------");
		
		idx = str.indexOf(search, 0);
		while((idx = str.indexOf(search, idx+1)) != -1) {
			System.out.println("찾은 위치 : " + idx);
		}
		System.out.println("--------------------------------------");
		
		idx = -1;
		while(true) {
			idx = str.indexOf(search, idx+1);
			if(idx == -1) {
				break;
			}
			System.out.println("찾은 위치 : " + idx);
		}
		
		str = "hello world!!";
		
		String sub = str.substring(6, 11);
		System.out.println("str : " + str);
		System.out.println("substr(6, 11) : " + sub);
		sub = str.substring(6);
		System.out.println("substr(6) : " + sub);
		
		str = "hello";
		String str2 = "world";
		
		String str3 = str.concat(str2);
		System.out.println("str : " + str);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		str = "               hello world                  ";
		System.out.printf("[%s] 길이 : %d\n", str, str.length());
		
		String trimStr = str.trim();
		System.out.printf("trim() => [%s] 길이 : %d\n", trimStr, trimStr.length());
	
	    str = "Hello World!!!";
	    System.out.println("str : " + str);
	    System.out.println("대문자 : " + str.toUpperCase());
	    System.out.println("소문자 : " + str.toLowerCase());
	    
	    String date = "2024-3-18";
	    
	    String[] dateArr = date.split("-");
	    System.out.println(Arrays.toString(dateArr));
	    
	    str = "172.31.9.164";
	    String[] ipArr = str.split("\\.");
	    System.out.println(Arrays.toString(ipArr));
	}
}
