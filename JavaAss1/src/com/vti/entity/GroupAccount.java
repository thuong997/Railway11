package com.vti.entity;
import java.util.Date;

public class GroupAccount {
	private Group group;
	private Account account;
	private Date joinDate;
	
	
	
	public Group getGroup() {
		return group;
	}



	public void setGroup(Group group) {
		this.group = group;
	}



	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}



	public Date getJoinDate() {
		return joinDate;
	}



	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}



	@Override
	public String toString() {
		return "GroupAccount [group=" + group + ", account=" + account + ", joinDate=" + joinDate + "]";
	}
	
}
