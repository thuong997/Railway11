package com.vti.entity.Ex6_Ass4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VietnamesePhone extends Phone {
	List<Contacts> contacts = new ArrayList<Contacts>();

	@Override
	public void insertContact(String name, String phone) {
		Contacts cont1 = new Contacts(name, phone);
		contacts.add(cont1);

	}

	@Override
	public void removeContact(String name) {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhập vào tên bạn muốn xóa: ");
		String names = scan.nextLine();
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getName().toLowerCase().indexOf(names.toLowerCase()) >= 0) {
				contacts.remove(i);
				i = i - 1;
			}

		}

	}

	@Override
	public void updateContact(String name, String newPhone) {
		for (Contacts contacts2 : contacts) {
			if(contacts2.getName().equals(name)) {
				contacts2.setPhone(newPhone);
			}
		}

	}

	@Override
	public void searchContact(String name) {
		for (Contacts contacts2 : contacts) {
			if(contacts2.getName().equals(name)) {
				System.out.println(contacts2);
			}
			
		}

	}
	public void showInfoContact() {
		for (Contacts contacts2 : contacts) {
			System.out.println(contacts2);
		}
	}

}
