package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

import com.vti.Utils.ScannerUltils;

public class Group {
	private int groupId;
	private String groupName;
	private Account[] account;
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
		super();
		System.out.println("tạo mới Group");
		System.out.println("nhập Id");
		this.setGroupId(ScannerUltils.inputInt());
		System.out.println("nhập tên Group: ");
		this.setGroupName(ScannerUltils.inputString());
		System.out.println("bạn có muốn thêm Account? \n 1: yes \n 2: no ");
		while (true) {
			int in = ScannerUltils.inputInt();
			switch (in) {
			case 1:
				System.out.println("nhập số lượng acc muốn thêm: ");
				int accInt = ScannerUltils.inputInt();
				Account[] accs = new Account[accInt];
				for (int i = 0; i < accInt; i++) {
					System.out.println("nhập Account thứ " + (i + 1) + "là: ");
					Account acc = new Account();
					accs[i] = acc;
				}
				this.accounts = accs;
				break;
			case 2:

				return;

			default:
				break;
			}
		}

	}

	public void showInfoGroup() {
		System.out.println("ID: " + groupId + "Name: " + groupName + "create: " + LocalDate.now());
		if (accounts != null) {
			System.out.println("số account trong group này là: " + accounts.length);
			
			for (Account account : accounts) {
				System.out.println("Ds Account: "+ account.toString());
			}

		}
	}

	public Group(String groupName, Account account, Account[] accounts, LocalDate createDate) {
		super();

		this.groupName = groupName;
		this.account = accounts;
		this.accounts = accounts;
		this.createDate = createDate;
	}

	public Group(String groupName, Account account, String[] userName, LocalDate createDate) {
		super();

		this.groupName = groupName;
		this.account = accounts;
		this.createDate = createDate;
		if (userName != null && userName.length > 0) {
			Account[] accs = new Account[userName.length];
			for (int i = 0; i < userName.length; i++) {
				accs[i] = new Account(0, "", userName[i], "");
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
