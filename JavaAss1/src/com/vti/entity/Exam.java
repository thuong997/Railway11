package com.vti.entity;
import java.util.Date;

public class Exam {
	private int examId;
	private int code;
	private String title;
	private CategoryQuestion category;
	private int duration;
	private Account account;
	private Date createDate;
	
	
	
	public int getExamId() {
		return examId;
	}



	public void setExamId(int examId) {
		this.examId = examId;
	}



	public int getCode() {
		return code;
	}



	public void setCode(int code) {
		this.code = code;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public CategoryQuestion getCategory() {
		return category;
	}



	public void setCategory(CategoryQuestion category) {
		this.category = category;
	}



	public int getDuration() {
		return duration;
	}



	public void setDuration(int duration) {
		this.duration = duration;
	}



	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}



	public Date getCreateDate() {
		return createDate;
	}



	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}



	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", code=" + code + ", title=" + title + ", category=" + category
				+ ", duration=" + duration + ", account=" + account + ", createDate=" + createDate + "]";
	}
	
}
