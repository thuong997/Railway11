package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.MyMath;
import com.vti.entity.PrimaryStudent;
import com.vti.entity.SecondaryStudent;
import com.vti.entity.Student;

public class Ex1 {
	public static void question1() {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		System.out.println("Số lượng học sinh là: " + Student.count);
		Student[] dsStudents = new Student[] { student1, student2, student3 };
		System.out.println("danh sách học sinh đại học bách khoa");
		for (Student student : dsStudents) {
			System.out.println(student);
		}
		System.out.println("danh sách học sinh đại học công nghệ");
		Student.college = "Đại học công nghệ";
		for (Student student : dsStudents) {
			System.out.println(student);
		}
	}

	public static void question2() {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student[] dsStudents = new Student[] { student1, student2, student3 };
		System.out.println("mỗi học sinh đóng 100k tiền quỹ");
		System.out.println("Tổng quỹ: " + (Student.moneyGroup = Student.moneyGroup + 100 * dsStudents.length));
		System.out.println("student1 lấy tiền 50k đi mua bim bim,kẹo để liên hoan");
		System.out.println("tổng quỹ: " + (Student.moneyGroup = Student.moneyGroup - 50));
		System.out.println("student2 lấy 20k đi mua bánh mì");
		System.out.println("tổng quỹ: " + (Student.moneyGroup = Student.moneyGroup - 20));
		System.out.println("student3 lấy 150k đi mua đồ dùng học tập cho nhóm");
		System.out.println("tổng quỹ: " + (Student.moneyGroup = Student.moneyGroup - 150));
		System.out.println("cả nhóm mỗi người lại đóng quỹ mỗi người 50k");
		System.out.println("tổng quỹ: " + (Student.moneyGroup = Student.moneyGroup + (50 * dsStudents.length)));
	}

	public static void question3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào số thứ nhất");
		int a = sc.nextInt();
		System.out.println("nhập vào số thứ hai");
		int b = sc.nextInt();

		int max = MyMath.max(a, b);
		System.out.println("số lớn nhất là: " + max);

		int min = MyMath.min(a, b);
		System.out.println("Số nhỏ nhất là: " + min);

		int sum = MyMath.sum(a, b);
		System.out.println("tổng của 2 số là: " + sum);

	}

	public static void question4() {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student[] dsStudents = new Student[] { student1, student2, student3 };

		System.out.println("đổi tên trường học cho student");
		Student.college = "Đại học quốc gia";

		for (Student student : dsStudents) {
			System.out.println(student);
		}

	}

	public static void question5() {

		for (int i = 0; i < 3; i++) {
			System.out.println("học sinh " + (i + 1) + ": " + "nguyễn văn a" + (i + 1));
			Student[] student = new Student[i];
			Student.count++;
		}

		System.out.println("Số lượng học sinh là: " + Student.count);
	}

	public static void question6() {
		System.out.println("demo PrimaryStudent");
		PrimaryStudent[] dsPrimaryStudent = new PrimaryStudent[2];
		for (int i = 0; i < dsPrimaryStudent.length; i++) {
			System.out.println("học sinh " + (i + 1) + ": " + "nguyễn văn a" + (i + 1));
			dsPrimaryStudent[i] = new PrimaryStudent();
		}
		System.out.println("Số lượng học sinh PrimaryStudent là: " + PrimaryStudent.countPri);

		System.out.println("demo SecondaryStudent");
		
		SecondaryStudent[] dsSecondaryStudent = new SecondaryStudent[4];
		for (int i = 0; i < dsSecondaryStudent.length; i++) {
			System.out.println("học sinh " + (i + 1) + ": " + "nguyễn văn a" + (i + 1));
			dsSecondaryStudent[i]= new SecondaryStudent();
		}
		System.out.println("Số lượng học sinh SecondaryStudent là: " + SecondaryStudent.countSe);
		System.out.println("Số lượng học sinh là: " + Student.count);
	}

	public static void question7() {
		System.out.println("demo tạo tối đa 7 Student");
		
		for (int i = 0; i < 6; i++) {
			Student student = new Student();
		}
		System.out.println("tạo Primary Student");
		PrimaryStudent pSt = new PrimaryStudent();
		System.out.println("sinh viên Primary Student: " + pSt);
		
		System.out.println("tạo Secondary Student");
		SecondaryStudent sSt = new SecondaryStudent();
		System.out.println("sinh viên Secondary Student: " + sSt);
	}	
	public static void question8() {
		
	}

}
