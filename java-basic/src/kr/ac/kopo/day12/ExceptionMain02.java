package kr.ac.kopo.day12;

import java.util.Arrays;
import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {

		System.out.println("--------------start----------------");

		try {
			Random r = new Random();
			int num = r.nextInt(3);
			System.out.println("추출된 난수 : " + num);
			System.out.println(10 / num);

			int[] nums = new int[3];
			nums[3] = 100;
			System.out.println(Arrays.toString(nums));
		} catch (Exception e) {
			System.out.println("예외발생!! => " + e.getMessage());
			return;
		} finally {
			System.out.println("---------------end-----------------");
		}
	}
}