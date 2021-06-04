package lesson3;

import java.util.Arrays;

public class Ex5_ass3 {
	public static void main(String[] args) {
		
		//Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau
		//không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
		Dep dep1 = new Dep();
		dep1.depId = 1;
		dep1.depName = "Sale";
		
		Dep dep2 = new Dep();
		dep2.depId = 2;
		dep2.depName = "Sale";
		System.out.println(dep1.equals(dep2));
		
		//Question 1:In ra thông tin của phòng ban thứ 1 (sử dụng toString())
		System.out.println("Thông tìn phòng ban 1:");		
		System.out.println(dep1.toString());
				
		//Question 2: In ra thông tin của tất cả phòng ban (sử dụng toString())
		Dep[] deps = {dep1,dep2};
		for (Dep dep : deps) {
			System.out.println(dep.toString());
		}
						
		//Question 3: In ra địa chỉ của phòng ban thứ 1
		System.out.println("Địa chỉ phòng ban là:");		
		System.out.println(dep1.hashCode());
				
		//Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
		Dep[] depr = {dep1,dep2};
			for (Dep dep : depr) {
				if(dep.equals("phòng A") == true) {
					System.out.println("có tên là phòng A");
				}else if (dep.equals("phòng A") == false) {
					System.out.println("không có tên phòng A");
			}		
		}
		//Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh
//		sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
//		VD:
//		Accounting
//		Boss of director
//		Marketing
//		Sale
//		Waiting room
		
		String[] depList = new String[] {"Marketing","Waiting room","Sale",
										"Accounting","Boss of director"};
		Arrays.sort(depList);
		System.out.println(depList[0]);
		System.out.println(depList[1]);
		System.out.println(depList[2]);
		System.out.println(depList[3]);
		System.out.println(depList[4]);
		
		//Question 7: Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra danh
//		sách phòng ban được sắp xếp theo tên
//		VD:
//		Accounting
//		Boss of director
//		Marketing
//		waiting room
//		Sale
		String[] aray = {"Marketing","Waiting room","Sale","Accounting","Boss of director"};
								
		
	
	}
	
}
