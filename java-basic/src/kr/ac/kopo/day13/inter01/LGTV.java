package kr.ac.kopo.day13.inter01;

public class LGTV {

	private boolean power;
	private int channelNo;
	private int volumeUp;
	
	public LGTV() {
		power = false;
		channelNo = 3;
		volumeUp = 7;
		System.out.println("LGTV 구매완료...");
	}

	void powerOn() {
		System.out.println("powerUp...");
	}
	
	void powerOff() {
		System.out.println("powerOff...");
	}
	
	public void channelUp() {
		System.out.println("channelUp...");
	}

	public void channelDown() {
		System.out.println("channelDown...");
	}

	public void volumeUp() {
		System.out.println("volumeUp...");
	}

	public void volumeDown() {
		System.out.println("volumeDown...");
	}

	public void mute() {
		System.out.println("mute...");
	}
}
