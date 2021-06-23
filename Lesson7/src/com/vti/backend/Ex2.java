package com.vti.backend;

import com.vti.entity.Ex2.PrimaryStudent;
import com.vti.entity.Ex2.SecondaryStudent;
import com.vti.entity.Ex2.Student;

public class Ex2 {
	public static void question3() {
		Student st = new Student();
		System.out.println(st);
		SecondaryStudent sS = new SecondaryStudent();
		System.out.println("Secondary Student: " + sS);
		PrimaryStudent pS = new PrimaryStudent();
		System.out.println("Primary Student: " + pS);
		
	}
}
