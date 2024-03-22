package kr.ac.kopo.day12.abs01;

public class LGPrinter extends Printer{

	@SuppressWarnings("unused")
	private String model;
	
	public LGPrinter() {
		model = "LG프린터";
	}
	
	public void lgPrint() {
		System.out.println("LG프린터에서 출력됨...");
	}
}
