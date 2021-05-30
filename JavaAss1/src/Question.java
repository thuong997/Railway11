import java.util.Date;

public class Question {
	int questionId;
	String content;
	CategoryQuestion category;
	TypeQuestion type;
	Account account;
	Date createDate;
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", content=" + content + ", category=" + category + ", type="
				+ type + ", account=" + account + ", createDate=" + createDate + "]";
	}
	
}
