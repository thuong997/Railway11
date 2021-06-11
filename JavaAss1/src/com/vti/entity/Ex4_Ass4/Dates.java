package com.vti.entity.Ex4_Ass4;

public class Dates {
	int day;
	int month;
	int year;
	public Dates(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isLeapYear() {
		this.year = year;
		boolean isLeap = false;
		if( year % 4 ==0 ){
			
		}if(year % 100 == 0) {
			
		}if(year % 400 ==0) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}
