	package com.vti.backend;

import java.util.Date;

import com.vti.entity.Student;
import com.vti.entity.Ex4_Ass4.Account_ex4;
import com.vti.entity.Ex4_Ass4.Circle;
import com.vti.entity.Ex4_Ass4.Dates;


public class Ex4_Ass4	 {

	// Question 1:
	public void question1() {
		System.out.println("q1-ex4");
		Student student1 = new Student("Thưởng", "Đông Anh");
		System.out.println(student1.getDiemHocLuc());
		
		student1.setDiemHocLuc(8.5f);
		System.out.println(student1);		
	}

	public void quetion2() {
		System.out.println("ex4_q2 Circle");
		Circle cir1 = new Circle (1.0 , "red");
		System.out.println(cir1);
		
		System.out.println("ex4_q2 Account");
		Account_ex4 acc1 = new Account_ex4("1", "meow", 30);
		Account_ex4 acc2= new Account_ex4("2", "meow2", 30);
		System.out.println("Số tiền ban đầu của acc1: " + acc1.getBalance() + ";" +
							" acc2: " + acc2.getBalance() );
		acc1.credit(20);
		System.out.println("Số tiền sau khi credit(20) cho acc1: " + acc1.getBalance());
		acc2.debit(50);
		System.out.println("Số tiền sau khi debit(50) cho acc2: " + acc2.getBalance());
		
		System.out.println("ex4_q2 Date");
		Dates date1 = new Dates (21, 11, 1984);
		System.out.println("Ngày bạn vừa tạo là: " + date1 );
		
		System.out.println("Kiểm tra năm nhuận");
		if(date1.isLeapYear()) {
			System.out.println("Đây không phải năm nhuận");
		}else {
			System.out.println("Đây là năm nhuận");
		}
	}
}
