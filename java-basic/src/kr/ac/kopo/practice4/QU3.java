package kr.ac.kopo.practice4;

import java.util.Scanner;

public class QU3 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			double[] scores = new double[5];
			double total = 0;
			int error = 0;

			System.out.println("5개의 점수를 입력하세요:");
			for (int i = 0; i < 5; i++) {
				System.out.print((i + 1) + "'s" + "점수" + " : ");
				double score = scanner.nextDouble();
				if (score >= 0 && score <= 100) {
					scores[i] = score;
					total += score;
				} else {
					scores[i] = score;
				}
			}

			System.out.println("------------------------------------");
			System.out.println("대상\t\t점수\t\t등급");
			System.out.println("------------------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.print((i + 1) + "\t\t" + scores[i] + "\t\t");
				if (scores[i] >= 90 && scores[i] <= 100) {
					System.out.println("A");
				} else if (scores[i] >= 80 && scores[i] < 90) {
					System.out.println("B");
				} else if (scores[i] >= 70 && scores[i] < 80) {
					System.out.println("C");
				} else if (scores[i] >= 60 && scores[i] < 70) {
					System.out.println("D");
				} else {
					System.out.println("ERROR!!!");
					error++;
				}
			}
			System.out.println("--------------------------");

			System.out.println("5개의 점수 중 " + "[" + error + "]" + "개의 에러가 있습니다.");
			System.out.println("총점 : " + total + "점");
			System.out.println("평균 : " + String.format("%.2f", (double) total / (5)) + "점");
		}
	}
}
