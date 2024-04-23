package em.ac.kr.vo;

public class UserVO {
	private String user_id;
	private String user_pw;
	private String user_tel;
	
	public UserVO(String user_id, String user_pw, String user_tel) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_tel = user_tel;
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
	public String getUser_tel() {
		return user_tel;
	}
	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}
	@Override
	public String toString() {
		return "UserVO [user_id=" + user_id + ", user_pw=" + user_pw + ", user_tel=" + user_tel + "]";
	}
}
