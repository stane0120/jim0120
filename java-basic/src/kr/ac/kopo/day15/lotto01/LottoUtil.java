package kr.ac.kopo.day15.lotto01;

import java.util.Random;

public class LottoUtil {

    public String getLotto() {
        Random ra = new Random();
        StringBuilder result = new StringBuilder();
        boolean[] used = new boolean[46];

        for (int i = 0; i < 6; i++) {
            int num;
            do {
                num = ra.nextInt(45) + 1;
            } while (used[num]);
            result.append(num);
            if (i < 5) {
                result.append(", ");
            }
            used[num] = true;
        }

        return result.toString();
    }
}