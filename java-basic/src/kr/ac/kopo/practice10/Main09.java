package kr.ac.kopo.practice10;

import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String S;
        do {
            S = sc.nextLine();
        } while (S.length() > 1000);

        int i;
        do {
            i = sc.nextInt();
        } while (i < 1 || i > S.length());

        char result = S.charAt(i - 1);
        System.out.println(result);

        sc.close();
    }
}
