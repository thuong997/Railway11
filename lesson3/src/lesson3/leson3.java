package lesson3;

import java.util.Arrays;

public class leson3 {
	public static void main(String args[]) {
		acc1 account1 = new acc1();
		account1.accountId = 1;
		account1.email = "nguyenthuong@gmail.com";
		account1.userName = "Thuong";
		account1.fullName = "Nguyễn Văn Thưởng";
		
		acc1 account2 = new acc1();
		account2.accountId = 1;
		account2.email = "thuha@gmail.com";
		account2.userName = "Ha";
		account2.fullName = "Bạch Thu Hà";
		
		System.out.println(account1.equals(account2));
		
		Dep dep1 = new Dep();
		dep1.depId = 1;
		dep1.depName = "Sale";
		
		Dep dep2 = new Dep();
		dep2.depId = 2;
		dep2.depName = "Sale";
		System.out.println(dep1.equals(dep2));
		
//		System.out.println("a".compareTo("b"));
//		System.out.println("acc".compareTo("acc"));
//		System.out.println("b".compareTo("a"));
		//so sánh ký tự
		
//		Arrays.sort(depList); //-> hàm này để sắp xếp ký tự đầu tiên của chuỗi.
//		System.out.println(depList[0]);
//		System.out.println(depList[1]);
		
	}
	
	
}
