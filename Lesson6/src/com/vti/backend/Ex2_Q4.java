package com.vti.backend;

import com.vti.entity.Department;

public class Ex2_Q4 {
	public void question4() {
		Department[] dep = new Department[3];
		getIndex(1,dep);
	}
	void getIndex(int index, Department[] dep) {
		try {
			System.out.println(dep[index].toString());
		}catch(Exception e) {
			System.out.println("cannot find department.");
		}
	}
}
