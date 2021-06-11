package com.vti.backend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.PositionName;

public class Ex1_Ass4 {

	public void question1() {
//		Tạo constructor cho department:
//			a) không có parameters
//			b) Có 1 parameter là nameDepartment và default id của
//			Department = 0
//			Khởi tạo 1 Object với mỗi constructor ở trên
		System.out.println("q1");
		Department dep = new Department();
		System.out.println(dep);
		
		Department dep1 = new Department("fresher");
		System.out.println(dep1);
	}	
	public void question2() {
//		Tạo constructor cho Account:
//			a) Không có parameters
//			b) Có các parameter là id, Email, Username, FirstName,
//			LastName (với FullName = FirstName + LastName)
//			c) Có các parameter là id, Email, Username, FirstName,
//			LastName (với FullName = FirstName + LastName) và
//			Position của User, default createDate = now
//			d) Có các parameter là id, Email, Username, FirstName,
//			LastName (với FullName = FirstName + LastName) và
//			Position của User, createDate
//			Khởi tạo 1 Object với mỗi constructor ở trên
		System.out.println("q2");
		//a)
		Account acc1 = new Account();
		System.out.println(acc1);
		//b)
		Account acc2 = new Account(1, "thuong@gmail.com", "Thưởng", "Nguyễn Văn Thưởng");
		System.out.println(acc2);
		//c)
		Position pos1 = new Position(PositionName.PM);
		Account acc3 = new Account(2, "thuong@gmail.com", "Thưởng", "Nguyễn Văn Thưởng",
				pos1, LocalDate.now());
		System.out.println(acc3);
		//d)
		Position pos2 = new Position(PositionName.SCRUM_MASTER);
		Account acc4 = new Account(3, "thuong@gmail.com", "Thưởng", "Nguyễn Văn Thưởng",
				pos2, LocalDate.of(1997, 11, 21));
		System.out.println(acc4);		
	}
	public void question3() {
//		Tạo constructor cho Group:
//			a) không có parameters
//			b) Có các parameter là GroupName, Creator, array Account[]
//			accounts, CreateDate
//			c) Có các parameter là GroupName, Creator, array String[]
//			usernames , CreateDate
//			Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin
//			username, các thông tin còn lại = null).
//			Khởi tạo 1 Object với mỗi constructor ở trên
		System.out.println("q3");
		//a
		Group gr = new Group();
		System.out.println(gr);
		//b 
		Group gr1 = new Group("#C",new Account(),new Account[] {},LocalDate.now());
		System.out.println(gr1);
		//c		
		String[] strAcc = new String[]{"Thưởng", "Dracula"};
		Group gr2 = new Group("#C2", new Account() , strAcc, LocalDate.of(1997, 11, 21) );
		System.out.println(gr2);	
	}
	public void question4() {
		
	}
}
