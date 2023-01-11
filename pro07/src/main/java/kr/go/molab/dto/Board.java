package kr.go.molab.dto;

import java.util.Date;

public class Board {
	private int bNo;
	private String bWriter;
	private String bPassword;
	private String bPasswordEnc;
	private String bSubject;
	private String bContent;
	private Date bRegDate;
	private Date bModDate;
	private int bCount;
	public int getbNo() {
		return bNo;
	}
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	public String getbWriter() {
		return bWriter;
	}
	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}
	public String getbPassword() {
		return bPassword;
	}
	public void setbPassword(String bPassword) {
		this.bPassword = bPassword;
	}
	public String getbPasswordEnc() {
		return bPasswordEnc;
	}
	public void setbPasswordEnc(String bPasswordEnc) {
		this.bPasswordEnc = bPasswordEnc;
	}
	public String getbSubject() {
		return bSubject;
	}
	public void setbSubject(String bSubject) {
		this.bSubject = bSubject;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public Date getbRegDate() {
		return bRegDate;
	}
	public void setbRegDate(Date bRegDate) {
		this.bRegDate = bRegDate;
	}
	public Date getbModDate() {
		return bModDate;
	}
	public void setbModDate(Date bModDate) {
		this.bModDate = bModDate;
	}
	public int getbCount() {
		return bCount;
	}
	public void setbCount(int bCount) {
		this.bCount = bCount;
	}
	@Override
	public String toString() {
		return "Board [bNo=" + bNo + ", bWriter=" + bWriter + ", bPassword=" + bPassword + ", bPasswordEnc="
				+ bPasswordEnc + ", bSubject=" + bSubject + ", bContent=" + bContent + ", bRegDate=" + bRegDate
				+ ", bModDate=" + bModDate + ", bCount=" + bCount + "]";
	}
	
	
}
