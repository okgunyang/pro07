package kr.go.molab.chat;

public class MessageVO {
	private String ms_title;
	private String receiver_name;
	private int gubun;
	private String creat_dt;
	private String ms_content;
	private String sender_name;
	private String user_id;
	private int read_yn;
	public String getMs_title() {
		return ms_title;
	}
	public void setMs_title(String ms_title) {
		this.ms_title = ms_title;
	}
	public String getReceiver_name() {
		return receiver_name;
	}
	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}
	public int getGubun() {
		return gubun;
	}
	public void setGubun(int gubun) {
		this.gubun = gubun;
	}
	public String getCreat_dt() {
		return creat_dt;
	}
	public void setCreat_dt(String creat_dt) {
		this.creat_dt = creat_dt;
	}
	public String getMs_content() {
		return ms_content;
	}
	public void setMs_content(String ms_content) {
		this.ms_content = ms_content;
	}
	public String getSender_name() {
		return sender_name;
	}
	public void setSender_name(String sender_name) {
		this.sender_name = sender_name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getRead_yn() {
		return read_yn;
	}
	public void setRead_yn(int read_yn) {
		this.read_yn = read_yn;
	}
	@Override
	public String toString() {
		return "MessageVO [ms_title=" + ms_title + ", receiver_name=" + receiver_name + ", gubun=" + gubun
				+ ", creat_dt=" + creat_dt + ", ms_content=" + ms_content + ", sender_name=" + sender_name
				+ ", user_id=" + user_id + ", read_yn=" + read_yn + "]";
	}
	
}
