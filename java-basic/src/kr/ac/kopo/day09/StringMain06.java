package kr.ac.kopo.day09;

public class StringMain06 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		@SuppressWarnings("unused")
		String str = "";
		for (int i = 1; i < 300000; i++) {
			str += 1;
		}
		long end = System.currentTimeMillis();

		System.out.println("소요시간 : " + (end - start) / 1000. + "초");

		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < 300000; i++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start) / 1000. + "초");
	}
}
