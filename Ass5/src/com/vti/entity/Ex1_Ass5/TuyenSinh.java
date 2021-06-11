package com.vti.entity.Ex1_Ass5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyemSinh {

	List<ThiSinh> dsThiSinh = new ArrayList<ThiSinh>();

	@Override
	public void addThiSinh() {
		Scanner scan = new Scanner(System.in);

		System.out.println("nhập vào ID thí sinh: ");
		int id = scan.nextInt();
		scan.nextLine();
		System.out.println("nhập vào tên thí sinh: ");
		String name = scan.nextLine();
		System.out.println("nhập vào địa chỉ thí sinh: ");
		String diaChi = scan.nextLine();
		System.out.println("nhập vào mức ưu tiên của thí sinh: ");
		int mucUuTien = scan.nextInt();
		scan.nextLine();
		System.out.println("nhập vào khối của thí sinh: A, B, C ");
		String khoi = scan.nextLine();
		ThiSinh thiSinh1 = new ThiSinh(id, name, diaChi, mucUuTien, new Khoi(khoi));
		dsThiSinh.add(thiSinh1);

	}

	@Override
	public void showInfoThiSinh() {
		for (ThiSinh thiSinh : dsThiSinh) {
			System.out.println(thiSinh);
		}

	}

	@Override
	public void searchThiSinh(int id) {
		for (ThiSinh thiSinh : dsThiSinh) {
			if (thiSinh.getId() == id) {
				System.out.println(thiSinh);
			}
		}

	}

}
