package kr.ac.kopo.practice12;

import java.util.Scanner;

public class practice15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int[] numbers = new int[N];
			for (int i = 0; i < N; i++) {
			    numbers[i] = sc.nextInt();
			}
			
			int primeCount = countPrimes(numbers);
			System.out.println(primeCount);
		}
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        if (number == 2)
            return true;
        if (number % 2 == 0)
            return false;
        
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
    
    public static int countPrimes(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (isPrime(num))
                count++;
        }
        return count;
    }
}