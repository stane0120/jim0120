package kr.ac.kopo.practice06;

import java.util.Random;
import java.util.Scanner;

public class qu1 {
	public static void main(String[] args) {
		int[] number1 = generateRandomNumbers();
		int[] number2;
		int attempts = 0;

		System.out.println("숫자 야구 게임을 시작합니다!");

		while (true) {
			attempts++;
			System.out.print("세 숫자를 입력하세요 : ");
			number2 = getUserInput();

			int strikes = 0;
			int balls = 0;

			for (int i = 0; i < 3; i++) {
				if (number2[i] == number1[i]) {
					strikes++;
				} else if (containsNumber(number1, number2[i])) {
					balls++;
				}
			}

			System.out.println("스트라이크: " + strikes + ", 볼: " + balls);

			if (strikes == 3) {
				System.out.println("축하합니다! 모든 숫자를 맞추셨습니다!");
				break;
			} else if (attempts >= 3) {
				System.out.println("아쉽습니다. 시도 횟수를 모두 사용하셨습니다. 정답은 " + number1[0] + ", " + number1[1] + ", " + number1[2]
						+ " 입니다.");
				break;
			}
		}
	}

	private static int[] generateRandomNumbers() {
		Random random = new Random();
		int[] numbers = new int[3];
		boolean[] used = new boolean[10];

		for (int i = 0; i < 3; i++) {
			int num;
			do {
				num = random.nextInt(10);
			} while (used[num]);
			numbers[i] = num;
			used[num] = true;
		}

		return numbers;
	}

	private static int[] getUserInput() {
		try (Scanner scanner = new Scanner(System.in)) {
			String input = scanner.nextLine().trim();
			int[] numbers = new int[3];

			for (int i = 0; i < 3; i++) {
				numbers[i] = Character.getNumericValue(input.charAt(i));
			}

			return numbers;
		}
	}

	private static boolean containsNumber(int[] array, int number) {
		for (int num : array) {
			if (num == number) {
				return true;
			}
		}
		return false;
	}
}