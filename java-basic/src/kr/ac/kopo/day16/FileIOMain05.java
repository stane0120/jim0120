package kr.ac.kopo.day16;

import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain05 {
	
	public static void write() {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("iotest/test.txt");
			
			fos.write(10);
			fos.write('A');
			
			fos.flush();
			System.out.println("저장완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fos);
		}
	}
	
	public static void main(String[] args) {
		
		write();
	}
}
