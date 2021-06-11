package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.Ex2_Ass5_Q2.Person;
import com.vti.entity.Ex2_Ass5_Q2.Student;

public class Ex2_Ass5_Q2 {
	public void question2() {

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("nhập chức năng sử dụng");
			System.out.println("1: demo person");
			System.out.println("2: demo student");
			System.out.println("3: exit");
			int input = scan.nextInt();
			switch (input) {
			case 1:
				demoPerson();
				break;
			case 2:
				demoStudent();
				break;
			case 3:

				return;

			default:
				break;
			}
		}

	}

	private void demoStudent() {
		Student student = new Student();
		student.inputInfo();
		System.out.println("thông tin bạn vừa nhập");
		System.out.println(student.showInfo());
		if (student.nhanHocBong()) {
			System.out.println("Amazing gút chóp em đã được học bổng");
		} else {
			System.out.println("không được học bổng");
		}

	}

	private void demoPerson() {
		Person person = new Person();
		person.inputInfo();
		System.out.println("thông tin bạn vừa nhập là");
		System.out.println(person.showInfo());

	}
}
