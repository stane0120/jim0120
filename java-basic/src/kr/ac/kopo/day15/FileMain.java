package kr.ac.kopo.day15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {
	
	public static void main(String[] args) {
		
		File fileObj = new File("iotest/a/b.txt");
		System.out.println("파일 이름 : " + fileObj.getName());
		System.out.println("파일 경로 : " + fileObj.getParent());
		System.out.println("디렉토리 여부 : " + fileObj.isDirectory());
		System.out.println("파일여부 : " + fileObj.isFile());
		System.out.println("존재여부 : " + fileObj.exists());
		
		System.out.println("읽기여부 : " + fileObj.canRead());
		System.out.println("쓰기여부 : " + fileObj.canWrite());
		System.out.println("실행여부 : " + fileObj.canExecute());
		System.out.println("파일크기 : " + fileObj.length() + "byte(s)");
		long time = fileObj.lastModified();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("마지막 수정날짜 : " + sdf.format(new Date(time)));
		
		/*
		File dirObj = new File("iotest/a");
		
		System.out.println("디렉토리여부 : " + dirObj.isDirectory());
		System.out.println("파일여부 : " + dirObj.isFile());
		System.out.println("존재여부 : " + dirObj.exists());
		System.out.println("parent : " + dirObj.getParent());
		System.out.println("path : " + dirObj.getPath());
		
//		File dirObj2 = new File("iotest/a/aaa");
		File dirObj2 = new File("iotest/b/구름");
//		dirObj2.mkdir();
		dirObj2.mkdirs();
		
		System.out.println("----------------------------------");
		System.out.println(dirObj.getPath() + "정보");
		System.out.println("----------------------------------");
		
		String[] list = dirObj.list();
		for(String e : list) {
			System.out.println(e);
		}
		*/
	}
}
