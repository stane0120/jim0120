package kr.ac.kopo.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain07 {

	public static void write() { // 입력하는 스트림
		Member m = new Member("hong", "홍길동", "010-1111-2222");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("iotest/member.dat"); // 출력하는 스트림
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(m);
			oos.flush();  // 모든 데이터를 출력 장치로 전송
			
			System.out.println("member.dat 저장완료...");
			
		} catch (Exception e) { // 광범위한 예외처리
			e.printStackTrace();
		} finally {
			FileClose.close(fos, oos);
		}
	}
	
	public static void read() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/member.dat");
			ois = new ObjectInputStream(fis);
			
			Member m = (Member)ois.readObject();
			System.out.println("읽어온 데이터 : " + m);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fis, ois);
		}
	}
	
	public static void main(String[] args) {
		
		read();
	//	write();
	}
}









