package em.ac.kr.main;

import em.ac.kr.ui.EmailUI;

public class EmailMain {
	public static void main(String[] args) {
		EmailUI ui = new EmailUI();
		try {
		ui.execute();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}