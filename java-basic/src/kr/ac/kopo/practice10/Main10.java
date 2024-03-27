package kr.ac.kopo.practice10;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String word;
        do {
            word = sc.nextLine();
        } while (word.length() > 100);

        int length = word.length();
        System.out.println(length);

        sc.close();
    }
}