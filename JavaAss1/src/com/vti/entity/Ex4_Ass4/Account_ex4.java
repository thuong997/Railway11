package com.vti.entity.Ex4_Ass4;

public class Account_ex4 {

	String id;
	String name;
	int balance;
	//hàm khởi tạo
	public Account_ex4(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public Account_ex4() {
		
	}
	
	@Override
	public String toString() {
		return "Account_ex4 [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	//get/set
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int credit(int amount) {
		return this.balance = this.balance + amount;
	}
	public int debit (int amount) {
		return this.balance = this.balance - amount;
	}
	public void trander(Account_ex4 acc, int amount) {
		this.balance = this.balance - amount;
		acc.balance = acc.balance + amount;
	}
	
}
