package kr.ac.kopo.practice12;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long perimeter = 4L * (n + 1) - 4; 
        System.out.println(perimeter);
    }
}
