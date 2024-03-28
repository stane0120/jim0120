package kr.ac.kopo.day16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain05 {
	
	public static void write() {
		
		FileOutputStream fos = null; // 출력하는 구문(파일)
		DataOutputStream dos = null; // 출력하는 구문(데이터)
		
		try {
			fos = new FileOutputStream("iotest/test.txt");
			dos = new DataOutputStream(fos);
			
			fos.write(10);
			fos.write('A');
			fos.flush(); // 저장된 데이터 출력
			
			dos.writeInt(10);
			dos.writeChar('A');
			dos.flush();

			System.out.println("저장완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fos);
			FileClose.close(dos);
		}
	}
	
	public static void read() {

		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("iotest/test.txt");
			dis = new DataInputStream(fis);
			
			int i = dis.read();
			int c = dis.read();
			int i2 = dis.readInt();
			char c2 = dis.readChar();
			
			System.out.println("읽어온 정수 : " + i);
			System.out.println("읽어온 문자 : " + (char)c);
			System.out.println("읽어온 int : " + i2);
			System.out.println("읽어온 char : " + c2);  // 읽어오는 구문)
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fis, dis);
		}
	}
	
	public static void main(String[] args) {
		
			read();

	}
}
