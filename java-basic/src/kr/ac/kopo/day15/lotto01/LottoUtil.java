package kr.ac.kopo.day15.lotto01;

import java.util.Arrays;
import java.util.Random;

public class LottoUtil {

    public String getLotto() {
        Random ra = new Random();
        int[] lottoNumbers = new int[6];  // 6 크기의 배열인 lottoNumbers

        for (int i = 0; i < 6; i++) {
            int num;
            do {
                num = ra.nextInt(45) + 1;
            } while (contains(lottoNumbers, num));
            lottoNumbers[i] = num;
        }   // 1 부터 45까지의 랜덤한 6개의 숫자 추출 

        Arrays.sort(lottoNumbers); // 추출한 숫자를 크기 순서대로 정렬

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            result.append(lottoNumbers[i]);
            if (i < 5) {
                result.append(", ");
            } // 결과창에 쉼표를 표시
        }

        return result.toString();
    }

    private boolean contains(int[] array, int num) {
        for (int value : array) {
            if (value == num) {
                return true; // 6개의 숫자를 추출하면 멈춤
            }
        }
        return false; // 6개가 아니면 계속 추출함
    } 
}