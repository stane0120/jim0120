package kr.ac.kopo.practice03;

public class R4 {
	public static void main(String[] args) {
		int depth = 100; 
		int position = 0;
		int speed = 5; 
		int up = 1;
		int down = 2; 
		int hours = 1;


		for (; position < depth; hours++) {
			position += speed;

			if (position < 50) {
				position -= up;
			} else {
				position -= down;
			}

			if (position < 0) {
				position = 0;
			}
			System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dm\n", hours, position);
		}
	}
}
