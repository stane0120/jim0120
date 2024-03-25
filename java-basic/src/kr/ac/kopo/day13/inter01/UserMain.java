package kr.ac.kopo.day13.inter01;

public class UserMain {

		public static void main(String[] args) {
			
			LGTV lg = new LGTV();
			lg.powerOn();
			lg.channelDown();
			lg.volumeUp();
			lg.volumeUp();
			lg.volumeDown();
			lg.channelUp();
			lg.powerOff();
			
			SamsungTV sam = new SamsungTV();
			sam.turnOn();
			sam.soundDown();
			sam.soundUp();
			sam.mute();
			sam.channelUp();
			sam.channelDown();
			sam.turnOff();
		}
	}
