package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Ex6_Ass4.Contacts;
import com.vti.entity.Ex6_Ass4.VietnamesePhone;

public class Ex6_Ass4 {
	public void question1() {
		menu();
	}
		private void menu() {
			VietnamesePhone vnPhone = new VietnamesePhone();
		while (true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhập vào chức năng bạn muốn sử dụng");
		System.out.println("1 là InsertContact");
		System.out.println("2 là RemoveContact");
		System.out.println("3 là UpdateContact");
		System.out.println("4 là SearchContact");
		System.out.println("5 là ShowInfoContact");
		System.out.println("6 là thoát chương trình");
		int input = scan.nextInt();
		List<Contacts> contacts = new ArrayList<Contacts>();
		
			switch (input) {
			case 1:
				scan.nextLine();
				System.out.println("mời bạn nhập tên: ");
				String name = scan.nextLine();
				System.out.println("mời bạn nhập phone");
				String phone = scan.nextLine();
				vnPhone.insertContact(name, phone);
				break;
			case 2:
				System.out.println("nhập vào tên bạn muốn xóa: ");
				String names = scan.nextLine();
				vnPhone.removeContact(names);

				break;
			case 3:
				
				System.out.println("mời bạn nhập tên cần update: ");
				String name1 = scan.nextLine();
				System.out.println("mời bạn nhập số phone mới: ");
				String newPhone = scan.nextLine();
				vnPhone.updateContact(name1, newPhone);
				break;
			case 4:
				System.out.println("mời bạn nhập tên cần tìm: ");
				String namer = scan.nextLine();
				vnPhone.searchContact(namer);

				break;
			case 5:
				vnPhone.showInfoContact();
				break;	
			case 6:
				return;
			default:
				break;
			}
		}
	}

	
		
	
}
