package em.ac.kr.vo;

public class UserVO {
	private int user_no;
	private String user_id;
	private String user_pw;
	private String user_date;
	private String user_tel;
	
	public UserVO() {
		super();
	}
	
	public UserVO(String user_id, String user_pw, String user_tel) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_tel = user_tel;
	}
	
	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public String getUser_id() {
		return user_id;
	}
	
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	
	public String getUser_date() {
		return user_date;
	}

	public void setUser_date(String user_date) {
		this.user_date = user_date;
	}

	public String getUser_tel() {
		return user_tel;
	}
	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}
	@Override
	public String toString() {
		return "UserVO [user_no=" + user_no + ", user_id=" + user_id + ", user_pw=" + user_pw + ", user_date="
				+ user_date + ", user_tel=" + user_tel + "]";
	}
}
