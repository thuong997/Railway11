package com.vti.entity;
import java.util.Date;

public class Question {
	private int questionId;
	private String content;
	private CategoryQuestion category;
	private TypeQuestion type;
	private Account account;
	private Date createDate;
	
	
	
	public int getQuestionId() {
		return questionId;
	}



	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public CategoryQuestion getCategory() {
		return category;
	}



	public void setCategory(CategoryQuestion category) {
		this.category = category;
	}



	public TypeQuestion getType() {
		return type;
	}



	public void setType(TypeQuestion type) {
		this.type = type;
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
		return "Question [questionId=" + questionId + ", content=" + content + ", category=" + category + ", type="
				+ type + ", account=" + account + ", createDate=" + createDate + "]";
	}
	
}
