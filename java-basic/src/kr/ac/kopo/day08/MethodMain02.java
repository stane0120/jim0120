package kr.ac.kopo.day08;

public class MethodMain02 {
	
	// 호출자 : main(),  피호출자 : getSum()
	static int getSum(int a, int b) {
		int sum = 0;
		while( a <= b) {
			sum = sum + a++;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int a = 1, b = 5;
		int total = getSum(a, b);
		System.out.printf("%d ~ %d사이의 총합 : %d\n", a, b, total);

	}
}
