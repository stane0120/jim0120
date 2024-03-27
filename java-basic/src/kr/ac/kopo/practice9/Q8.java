package kr.ac.kopo.practice9;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int hour = sc.nextInt();
			int minute = sc.nextInt();
			
			int cooking = sc.nextInt();

			int totalMinutes = hour * 60 + minute + cooking;
			int endHour = (totalMinutes / 60) % 24;
			int endMinute = totalMinutes % 60;

			System.out.println(endHour + " " + endMinute);
		}
	}
}