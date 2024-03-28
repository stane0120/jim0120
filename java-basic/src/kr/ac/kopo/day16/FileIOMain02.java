package kr.ac.kopo.day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOMain02 {

	public static void main(String[] args) {
		// iotest/koala.jpg -> iotest/koala2.jpg 복사

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		long start = System.currentTimeMillis();
		try {
			fis = new FileInputStream("iotest/koala.jpg");
			fos = new FileOutputStream("iotest/koala4.jpg");

			while (true) {
				int c = fis.read(); // fis를 한바이트씩 읽겠다.
				if (c == -1)
					break;
				fos.write(c);
			}
			fos.flush();
			System.out.println("파일복사 완료....");

		} catch (FileNotFoundException fnfe) { // 예외처리
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start) / 1000. + "(초)");
	}
}
