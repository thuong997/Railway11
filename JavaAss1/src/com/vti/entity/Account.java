package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Account {
	private int accountId;
	private String email;
	private String userName;
	private String fullName;
	private Department department;
	private Position position;
	private LocalDate createDate;
	private Group[] groups;

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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
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

	}

	public Account(int accountId, String email, String userName, String fullName, Position position) {
		super();// giúp chúng ta nhảy tới hàm khởi tạo đối tượng cha nếu có
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.position = position;
		this.createDate = LocalDate.now();
	}

	public Account(int accountId, String email, String userName, String fullName) {
		super();// giúp chúng ta nhảy tới hàm khởi tạo đối tượng cha nếu có
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;

	}

	public Account(int accountId, String email, String userName, String fullName, Position position,
			LocalDate createDate) {
		super();// giúp chúng ta nhảy tới hàm khởi tạo đối tượng cha nếu có
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.position = position;
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", department=" + department + ", position=" + position + ", createDate=" + createDate
				+ ", groups=" + Arrays.toString(groups) + "]";
	}

}
