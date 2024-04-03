package kr.ac.kopo.practice12;

import java.util.Scanner;

public class practice09 {

    public static void main(String[] args) {
    	
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();

            long combinations = (long) Math.pow(N, 2);

            System.out.println(combinations);
        }
    }
