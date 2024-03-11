package kr.ac.kopo.practice3;

public class R4 {
	public static void main(String[] args) {
		int Depth = 100; // 우물의 깊이
		int Position = 0; // 달팽이의 현재 위치
		int Speed = 5; // 달팽이의 기어오르는 속도
		int Up = 1; // 50m 미만에서 미끌어지는 속도
		int Down = 2; // 50m 이상에서 미끌어지는 속도
		int hours = 1; // 경과한 시간

		// 달팽이가 우물을 탈출하는 동안
		for (; Position < Depth; hours++) {
			Position += Speed;

			if (Position < 50) {
				Position -= Up;
			} else {
				Position -= Down;
			}

			if (Position < 0) {
				Position = 0;
			}
			System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dm\n", hours, Position);
		}
	}
}
