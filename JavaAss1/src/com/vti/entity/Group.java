package com.vti.entity;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Group {
	private int groupId;
	private String groupName;
	private Account account;
	private LocalDate createDate;
	private Account[] accounts;
	
	
	
	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Group() {
		
	}
	
	public Group(String groupName, Account account, Account[] accounts,LocalDate createDate) {
		super();
		
		this.groupName = groupName;
		this.account = account;
		this.accounts = accounts;
		this.createDate = createDate;		
	}
	public Group(String groupName, Account account, String[] userName,LocalDate createDate) {
		super();
		
		this.groupName = groupName;
		this.account = account;	
		this.createDate = createDate;		
		if(userName != null && userName.length > 0) {
			Account[] accs = new Account[userName.length];
			for (int i = 0 ; i < userName.length ; i++) {
				accs[i] = new Account(0,"",userName[i],"");
			}
			this.accounts = accs;
		}
	}

	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", groupName=" + groupName + ", account=" + account + ", createDate="
				+ createDate + ", accounts=" + Arrays.toString(accounts) + "]";
	}

	
	
	
}
