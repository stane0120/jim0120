package kr.ac.kopo.practice07;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    Calculator calculator = new Calculator();

	    System.out.print("정수: ");
	    int num1 = scan.nextInt();
	    System.out.print("정수: ");
	    int num2 = scan.nextInt();

	    System.out.println(num1 + " + " + num2 + " = " + calculator.add(num1, num2));
	    System.out.println(num1 + " - " + num2 + " = " + calculator.subtract(num1, num2));
	    System.out.println(num1 + " * " + num2 + " = " + calculator.multiply(num1, num2));
	    System.out.println(num1 + " / " + num2 + " = " + calculator.divide(num1, num2));

	    System.out.println(num1 + " 소수체크: " + calculator.isPrime(num1));
	    System.out.println(num2 + " 소수체크: " + calculator.isPrime(num2));

	    scan.close();
	}
}

