
public class Answer {
	int answerId;
	String content;
	Question question;
	boolean isccorect;
	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", content=" + content + ", question=" + question + ", isccorect="
				+ isccorect + "]";
	}
	
}
