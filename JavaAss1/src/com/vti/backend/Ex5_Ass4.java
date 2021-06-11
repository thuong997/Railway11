package com.vti.backend;

import java.rmi.Remote;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import com.vti.entity.Ex5_Ass4.Bao;
import com.vti.entity.Ex5_Ass4.CanBo;
import com.vti.entity.Ex5_Ass4.HighSchoolStudent;
import com.vti.entity.Ex5_Ass4.Sach;
import com.vti.entity.Ex5_Ass4.TaiLieu;
import com.vti.entity.Ex5_Ass4.TapChi;

public class Ex5_Ass4 {

	public void question1() {
//		Question 1: inheritance
//		Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
//		Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(name, nữ,
//		khác), địa chỉ.
//		Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
//		Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
//		Các nhân viên có thuộc tính riêng: công việc.
//		Hãy xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp
//		CanBo.			
	}

	public void question2() {
		while (true) {
			System.out.println("mời bạn nhập vào chức năng muốn sử dụng: ");
			System.out.println("1 là thêm mới cán bộ");
			System.out.println("2 là tìm kiếm cán bộ");
			System.out.println("3 là thông tin danh sách cán bộ");
			System.out.println("4 là xóa cán bộ theo tên");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			switch (input) {
			case 1:
				addNewCanBo();
				break;
			case 2:
				searchByName();
				break;
			case 3:
				showInfoDsCanBo();
				break;
			case 4:
				deleteByName();
				break;
			case 5:
				return;
			default:
				System.out.println("Lựa chọn lại tính năng cần dùng");
				break;
			}
		}

	}

	List<CanBo> dsCanBo = new ArrayList<CanBo>();

	private void deleteByName() {
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

	private void showInfoDsCanBo() {
		for (CanBo canBo : dsCanBo) {
			System.out.println(canBo);
		}

	}

	private void searchByName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào tên cán bộ cần tìm: ");
		String name = scan.nextLine();
		for (CanBo canBo : dsCanBo) {
			if (canBo.getHoTen().toLowerCase().indexOf(name.toLowerCase()) >= 0) {
				System.out.println(canBo);
			}
		}

	}

	private void addNewCanBo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào tên cán bộ: ");
		String name = scan.nextLine();
		System.out.println("Mời bạn nhập vào tuổi: ");
		int tuoi = scan.nextInt();
		scan.nextLine();
		System.out.println("Mời bạn nhập vào giới tính: ");
		String gioiTinh = scan.nextLine();
		System.out.println("Mời bạn nhập vào địa chỉ: ");
		String diaChi = scan.nextLine();
		CanBo canbo1 = new CanBo(name, tuoi, gioiTinh, diaChi);
		dsCanBo.add(canbo1);
	}

	public void question3() {
//		Question 3 (Optional): constructor inheritance
//		Tạo class abstract Person gồm các property name và tạo constructor có
//		1 parameter name
//		Tạo class abstract Student kế thừa Person gồm các property id, name
//		và tạo constructor có 2 parameter id, name
//		Tạo class HighSchoolStudent kế thừa Student bao gồm các property id,
//		name, clazz (Lớp đang học), desiredUniversity (trường đại học mong
//		muốn vào) và tạo constructor có 4 parameter id, name, clazz,
//		desiredUniversity.
//		Hãy khởi tạo Object HighSchoolStudent với các giá trị: id = 1, name = "Nam",
//		 clazz = "Chuyên Văn",
		// desiredUniversity = "Đại học công nghệ"

		HighSchoolStudent hss1 = new HighSchoolStudent(1, " Nam", " chuyên văn", " Đại học công nghệ");
		System.out.println("ex5 Q3");
		System.out.println(hss1);
	}

	public void question4() {
//		Một thư viện cần quản lý các tài liệu bao gồm Sách, Tạp chí, Báo. Mỗi
//		tài liệu gồm có các thuộc tính sau: Mã tài liệu(Mã tài liệu là duy nhất),
//		Tên nhà xuất bản, số bản phát hành.
//		Các loại sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
//		Các tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
//		Các báo cần quản lý thêm: Ngày phát hành.
//		Xây dựng chương trình để quản lý tài liệu (QLTV) cho thư viện một
//		cách hiệu quả.
//		Xây dựng lớp QuanLySach có các chức năng sau
//		a) Thêm mới tài liêu: Sách, tạp chí, báo.
//		b) Xoá tài liệu theo mã tài liệu.
//		c) Hiện thị thông tin về tài liệu.
//		d) Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.
//		e) Thoát khỏi chương trình.
		while (true) {
			System.out.println("mời bạn nhập vào chức năng muốn sử dụng: ");
			System.out.println("1 là thêm mới tài liệu: Sách, tạp chí, báo");
			System.out.println("2 là xóa tài liệu theo mã tài liệu");
			System.out.println("3 là thông tin danh sách tài liệu");
			System.out.println("4 là tìm kiếm tài liệu theo loại: sách, tạp chí, báo");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			switch (input) {
			case 1:
				addNewTaiLieu();
				break;
			case 2:
				deleteTaiLieu();
				break;
			case 3:
				showInfoDsTaiLieu();
				break;
			case 4:
				searchTaiLieu();
				break;
			case 5:
				return;
			default:
				System.out.println("Lựa chọn lại tính năng bạn muốn sử dụng");
				break;
			}
		}
	}

	List<TaiLieu> listTaiLieu = new ArrayList<TaiLieu>();
	

	private void searchTaiLieu() {
		Scanner scan = new Scanner(System.in);
		int timTaiLieu = scan.nextInt();
		switch (timTaiLieu) {
		case 1:
			for (TaiLieu taiLieu : listTaiLieu) {
				if (taiLieu instanceof Sach) {
					System.out.println(taiLieu);
				}
			}
			break;
		case 2:
			for (TaiLieu taiLieu : listTaiLieu) {
				if (taiLieu instanceof TapChi) {
					System.out.println(taiLieu);
				}
			}
			break;
		case 3:
			for (TaiLieu taiLieu : listTaiLieu) {
				if (taiLieu instanceof Bao) {
					System.out.println(taiLieu);
				}
			}
			break;

		default:
			System.out.println("Nhập k đúng...");
			break;
		}

	}

	private void showInfoDsTaiLieu() {
		for (TaiLieu taiLieu : listTaiLieu) {
			System.out.println(taiLieu);
		}

	}

	private void deleteTaiLieu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("mời bạn nhập vào mã tài liệu cần xóa");
		int maTaiLieu = scan.nextInt();
		for (int i = 0; i < listTaiLieu.size(); i++) {
			listTaiLieu.remove(i);
		}

	}

	private void addNewTaiLieu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời bạn nhập mã tài liệu");
		int maTaiLieu = scan.nextInt();
		scan.nextLine();
		System.out.println("mời bạn nhập tên nhà suất bản");
		String tenNhaSuatBan = scan.nextLine();
		System.out.println("mời bạn nhập số bản phát hành");
		String soBanPhatHanh = scan.nextLine();
		TaiLieu taiLieu = new TaiLieu(maTaiLieu, tenNhaSuatBan, soBanPhatHanh);
		listTaiLieu.add(taiLieu);
		
		}

}
