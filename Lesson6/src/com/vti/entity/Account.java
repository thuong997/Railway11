package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

import com.vti.Utils.ScannerUltils;

public class Account {
	int accountId;
	String email;
	String userName;
	String fullName;
	int birth;
	LocalDate createDate;
	Group[] groups;
	

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Group[] getGroups() {
		return groups;
	}

	public void setGroups(Group[] groups) {
		this.groups = groups;
	}

	public Account() {
		super();
		System.out.println("nhập thông tin Account");
		System.out.println("nhập ID: ");
		this.setAccountId(ScannerUltils.inputInt());
		System.out.println("nhập email: ");
		this.setEmail(ScannerUltils.inputString());
		System.out.println("nhập user name: ");
		this.setUserName(ScannerUltils.inputString());
		System.out.println("nhập full name: ");
		this.setFullName(ScannerUltils.inputString());
		System.out.println("nhập tuổi");
		this.setBirth(ScannerUltils.inputAge());

	}
	

	public Account(int accountId, String email, String userName, String fullName, int age) {
		super();// giúp chúng ta nhảy tới hàm khởi tạo đối tượng cha nếu có
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.birth = age;
		this.createDate = LocalDate.now();
	}

	public Account(int accountId, String email, String userName, String fullName) {
		super();// giúp chúng ta nhảy tới hàm khởi tạo đối tượng cha nếu có
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;

	}

	public Account(int accountId, String email, String userName, String fullName, int age,
			LocalDate createDate) {
		super();// giúp chúng ta nhảy tới hàm khởi tạo đối tượng cha nếu có
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.birth = age;
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Account [accountId: " + accountId + ", email: " + email + ", userName: " + userName + ", fullName: "
				+ fullName +", Tuổi: " + birth + ", createDate: " + LocalDate.now() + "]";
	}

}
