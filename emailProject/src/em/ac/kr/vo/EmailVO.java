package em.ac.kr.vo;

public class EmailVO {
	
	private int    user_no;
	private String user_id;
	private String user_pw;
	private String user_date;
	private int write_no;
	private String write_title;
	private String write_content;
	private String write_date;
	
	public EmailVO() {
		super();
	}

	public EmailVO(int user_no, String user_id, String user_pw, String user_date, int write_no, String write_title,
			String write_content, String write_date) {
		super();
		this.user_no = user_no;
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_date = user_date;
		this.write_no = write_no;
		this.write_title = write_title;
		this.write_content = write_content;
		this.write_date = write_date;
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

	public int getWrite_no() {
		return write_no;
	}

	public void setWrite_no(int write_no) {
		this.write_no = write_no;
	}

	public String getWrite_title() {
		return write_title;
	}

	public void setWrite_title(String write_title) {
		this.write_title = write_title;
	}

	public String getWrite_content() {
		return write_content;
	}

	public void setWrite_content(String write_content) {
		this.write_content = write_content;
	}

	public String getWrite_date() {
		return write_date;
	}

	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}
	@Override
	public String toString() {
		return "EmailVO [user_no=" + user_no + ", user_id=" + user_id + ", user_pw=" + user_pw + ", user_date="
				+ user_date + ", write_no=" + write_no + ", write_title=" + write_title + ", write_content="
				+ write_content + ", write_date=" + write_date + "]";
	}
	
}