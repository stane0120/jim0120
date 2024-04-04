package kr.ac.kopo.practice12;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int w = sc.nextInt();
			int h = sc.nextInt();

			int minXDistance = Math.min(x, w - x); 
			int minYDistance = Math.min(y, h - y); 

			int minDistance = Math.min(minXDistance, minYDistance); 

			System.out.println(minDistance);
		}
    }
}