package com.vti.backend;

import com.vti.entity.Ex2_Ass5.Student;


public class Ex2_Ass5 {
	public void question1() {
//		a) Tạo 10 học sinh, chia thành 3 nhóm
//		b) Kêu gọi cả lớp điểm danh.
//		c) Gọi nhóm 1 đi học bài
//		d) Gọi nhóm 2 đi dọn vệ sinh
		Student[] dsStudent = new Student[10];
		for (int i = 0; i < dsStudent.length; i++) {
			dsStudent[i] = new Student(i + 1, "Nguyễn Văn A" + (i + 1), i % 3);
			System.out.println(dsStudent[i]);
		}
		for (int i = 0; i < dsStudent.length; i++) {
			dsStudent[i].diemDanh();
		}
		for (int i = 0; i < dsStudent.length; i++) {
			if (dsStudent[i].group == 1)
				dsStudent[i].hocBai();
		}
		for (int i = 0; i < dsStudent.length; i++) {
			if (dsStudent[i].group == 2)
				dsStudent[i].donVeSinh();
		}
	}
	
	
}
