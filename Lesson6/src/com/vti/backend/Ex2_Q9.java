package com.vti.backend;

import com.vti.Utils.ScannerUltils;
import com.vti.entity.Department;
import com.vti.entity.Position;

public class Ex2_Q9 {
	public static void main(String[] args) {
		
		question9();
		}
	public static void question9() {
		Department dep = new Department();
		System.out.println("Tạo mới department");
		dep.setDepartmentId(ScannerUltils.inputInt());
		dep.setDepartmentName(ScannerUltils.inputString());
		System.out.println(dep);
		
		Position pos = new Position();
		System.out.println("tạo mới Position");
		pos.setPositionId(ScannerUltils.inputInt());
		System.out.println("chọn tên Position: DEV; TEST;  SCRUM MASTER;  PM");
		pos.setPositionName(ScannerUltils.inputString());
		System.out.println(pos);
	}
	

}
