package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Ex5_Ass4.CanBo;

public class QLCB {

	List<CanBo> dsCanBo = new ArrayList<CanBo>();

	public void addNewCanBo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào tên cán bộ: ");
		String name = scan.nextLine();
		CanBo canbo1 = new CanBo(name, 0, "", "");
		dsCanBo.add(canbo1);
		// hàm add của arraylist dùng để thêm mới phần tử
	}

	public void showInfoDsCanBo() {
		for (CanBo canBo : dsCanBo) {
			System.out.println(canBo);
		}
	}

	public void searchByName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào tên cán bộ cần tìm: ");
		String name = scan.nextLine();
		for (CanBo canBo : dsCanBo) {
			// indexOf: so sánh chuỗi nếu chuỗi 1 chứa chuỗi con thì trả về 1 giá trị >= 0
			// nếu k chứa trả về -1
			if (canBo.getHoTen().toLowerCase().indexOf(name.toLowerCase()) >= 0) {
				System.out.println(canBo);
			}
		}
	}

	public void deleteByName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào tên cán bộ muốn xóa: ");
		String name = scan.nextLine();
		for (int i = 0; i < dsCanBo.size(); i++) {
			if (dsCanBo.get(i).getHoTen().toLowerCase().indexOf(name.toLowerCase()) >= 0) {
				dsCanBo.remove(i);
				i = i - 1;
			}
		}
	}
}