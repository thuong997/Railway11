import java.util.Date;

public class Exam {
	int examId;
	int code;
	String title;
	CategoryQuestion category;
	int duration;
	Account account;
	Date createDate;
	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", code=" + code + ", title=" + title + ", category=" + category
				+ ", duration=" + duration + ", account=" + account + ", createDate=" + createDate + "]";
	}
	
}
