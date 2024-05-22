package kr.ac.kopo.ai;

public class Perceptron2 {
	public static void main(String[] args) {

		// 학습 데이터
		double[] y = { 3, 4, 5, 6, 7, 8, 9 };
		double[] x = { 7, 8, 11, 13, 15, 17, 19 };

		// 추정값
		double[] yHat = new double[7];

		// 현재 변수들
		double w = 0.1;
		double b = 0.;
		double Loss = 100.;
		double lr = 0.001;
	
		// 이전 변수들
		double prvW = 0.;
		double prvB = 0.;
		double prevLoss = 0.;
		
		int epochs = 100;
		
		for (int epoch = 0; epoch < epochs; epoch++)

		{// yHat 예측값 계산
			double lossSum = 0;
			for (int i = 0; i < x.length; i++) {
				yHat[i] = w * x[i] + b;
				// loss의 제곱합 구하기
				lossSum += Math.pow(yHat[i] - y[i], 2);
			}
			// 현재 로스
			Loss = lossSum / x.length;

			// 기울기 = 이전 로스값과 현재 로스값의 차 / 이전 가중치와 현재 가중치의 차
			double inclinationW = (Loss - prevLoss) / (w - prvW);
			double inclinationB = (Loss - prevLoss) / (b - prvB);
			prevLoss = Loss;

			// 가중치 최적화 후 업데이트
			prvW = w;
			prvB = b;
			if (inclinationW < 0) {
				w = w - (lr * inclinationW);
				b = b - (lr * inclinationB);
			} else {
				w = w + (lr * inclinationW);
				b = b + (lr * inclinationB);
			}

			System.out.println("epoch : " + epoch + " Loss : " + Loss + " W : " + w + " B : " + b);
		}
	}
}
