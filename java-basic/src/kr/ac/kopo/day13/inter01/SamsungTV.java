package kr.ac.kopo.day13.inter01;

public class SamsungTV {

	private boolean power;
	
	public SamsungTV() {
		System.out.println("삼성TV 구매완료...");
	}
	
	public void turnOn() {
		System.out.println("전원 ON");
	}
	
	public void turnOff() {
		System.out.println("전원 OFF");
	}
	
	public void channelUp() {
		System.out.println("채널 UP");
	}
	
	public void channelDown() {
		System.out.println("채널 DOWN");
	}
	
	public void soundUp() {
		System.out.println("음량 UP...");
	}
	
	public void mute() {
		System.out.println("음소거중...");
	}
	
	public void soundDown() {
		System.out.println("음량 DOWN");
	}
}
