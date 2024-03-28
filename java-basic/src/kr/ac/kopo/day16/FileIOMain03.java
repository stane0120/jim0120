package kr.ac.kopo.day16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain03 {
	// iotest/koala.jpg => iotest/koala4.jpg 복사
	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		long start = System.currentTimeMillis();

		try {
			fis = new FileInputStream("iotest/koala.jpg");
			fos = new FileOutputStream("iotest/koala4.jpg");

			bis = new BufferedInputStream(fis); // bis를 close해야 fis를 close할 수 있음
			bos = new BufferedOutputStream(fos); // bos를 close해야 fos를 close할 수 있음

			while (true) {
				int c = bis.read();
				if (c == -1)
					break;
				bos.write(c);
			}
			bos.flush();
			System.out.println("koala4.jpg 복사완료...");

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
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start) / 1000. + "(초)");
	}
}
