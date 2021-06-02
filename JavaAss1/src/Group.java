import java.util.Date;

public class Group {
	int groupId;
	String groupName;
	Account account;
	Date createDate;
	Account[] accounts;
	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", groupName=" + groupName + ", account=" + account + ", createDate="
				+ createDate + "]";
	}
	
}
