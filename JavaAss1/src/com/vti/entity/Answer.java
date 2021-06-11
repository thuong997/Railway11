package com.vti.entity;

public class Answer {
	private int answerId;
	private String content;
	private Question question;
	private boolean isccorect;
	


	public int getAnswerId() {
		return answerId;
	}



	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public Question getQuestion() {
		return question;
	}



	public void setQuestion(Question question) {
		this.question = question;
	}



	public boolean isIsccorect() {
		return isccorect;
	}



	public void setIsccorect(boolean isccorect) {
		this.isccorect = isccorect;
	}



	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", content=" + content + ", question=" + question + ", isccorect="
				+ isccorect + "]";
	}
	
}
