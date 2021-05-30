import java.util.Date;

public class GroupAccount {
	Group group;
	Account account;
	Date joinDate;
	@Override
	public String toString() {
		return "GroupAccount [group=" + group + ", account=" + account + ", joinDate=" + joinDate + "]";
	}
	
}
