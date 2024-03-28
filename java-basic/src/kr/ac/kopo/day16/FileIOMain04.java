package kr.ac.kopo.day16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain04 {
	// iotest/Koala.jpg => iotest/Koala3.jpg 복사
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		long start = System.currentTimeMillis(); // 시간을 시작하는 구문
		
		try {
			fis = new FileInputStream("iotest/Koala.jpg");  // 이 이미지를 입력
			fos = new FileOutputStream("iotest/Koala3.jpg"); //  이 이미지로 출력
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while(true) {
				int c = bis.read();
				if(c == -1) break;
				bos.write(c);  // 파일이 -1이면 멈추기
			}
			bos.flush();
			System.out.println("koala3.jpg 복사완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(fis, bis);
			FileClose.close(fos, bos);
			
//			FileClose.close(bis);
//			FileClose.close(fis);
//			FileClose.close(bos);
//			FileClose.close(fos);
		}
		
		long end = System.currentTimeMillis(); // 끝나는 시간 계산
		System.out.println("소요시간 : " + (end - start) / 1000. + "(초)"); // 소요시간 계산하기
	}
}







