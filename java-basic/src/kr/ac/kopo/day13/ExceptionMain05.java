package kr.ac.kopo.day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class ExceptionMain05 {
	
	public static void a() {
		
		try {
		try (FileReader fr = new FileReader("a.txt")) {
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
	}
	public static void b() {
		
		Random r = new Random();
		int random = r.nextInt(3);
		int[] nums = new int[2];
		nums[random] = random;
	}
	
	public static void main(String[] args) {
		
		System.out.println("-------------- start ---------------------");
		a();
		try {
		b();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("--------------- end -----------------------");
	}
}
