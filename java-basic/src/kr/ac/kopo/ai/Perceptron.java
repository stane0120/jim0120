package kr.ac.kopo.ai;

public class Perceptron {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		double[] y = { 3, 4, 5, 6, 7 };
		double[] x = { 7, 8, 11, 13, 15 };
		double[] yHat = new double[5];

		double w = 0.01;
		double b = 0.5;
		double lr = 0.01;

		double currentW = 0.05;
		double currentB = 0.01;
		double prevLoss = 1;

		
		double lossMin = Double.MAX_VALUE;
		double fitW;
		double fitB;
		
		
		for (int j = 0; j < 1000; j++) {
			double lossSum = 0;
			
			// yHat 예측값 계산
			for (int i = 0; i < y.length; i++) {
				yHat[i] = currentW * x[i] + currentB;
				
				// loss의 제곱합 구하기
				lossSum += Math.pow(yHat[i] - y[i], 2);
			}

			// 현재 로스 변화량
			double loss = lossSum / y.length;


			// 현재 로스가 가장 작으면 저장
			if (loss < lossMin) {
				lossMin = loss;
				fitW = currentW;
				fitB = currentB;
			}

			// 기울기 계산?
			// 기울기 = 이전 로스값과 현재 로스값의 차 / 이전 가중치와 현재 가중치의 차
			double inclinationW = (prevLoss - loss) / (w - currentW);
			double inclinationB = (prevLoss - loss) / (b - currentB);
			prevLoss = loss;
			
			// 가중치 최적화 후 업데이트
			double tmp = currentW;
			currentW = w - (lr * inclinationW);
			w = tmp;
			tmp = currentB;
			currentB = b - (lr * inclinationB);
			b = tmp;
			System.out.println(j + "번째 가중치: " + w + " 편향: " + b + " 로스: " + loss);
		}
	}
}
