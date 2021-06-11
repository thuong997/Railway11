package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Ex1_Ass5.News;
import com.vti.entity.Ex1_Ass5.ThiSinh;
import com.vti.entity.Ex1_Ass5.TuyenSinh;

public class Ex1_Ass5 {
	public void question1() {
		menu();
	}

	private void menu() {

		List<News> listNews = new ArrayList<News>();
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("nhập vào chức năng sử dụng");
			System.out.println("1: Insert news");
			System.out.println("2: View list news");
			System.out.println("3: Average rate");
			System.out.println("4: Exit");
			int input = scan.nextInt();
			switch (input) {
			case 1:// Insert news
				scan.nextLine();
				System.out.println("nhập vào Title");
				String title = scan.nextLine();
				System.out.println("nhập vào PublishDate");
				String publishDate = scan.nextLine();
				System.out.println("nhập vào Author");
				String author = scan.nextLine();
				System.out.println("nhập vào Content");
				String content = scan.nextLine();

				System.out.println("nhập vào đánh giá 1: ");
				int rate1 = scan.nextInt();
				System.out.println("nhập vào đánh giá 2: ");
				int rate2 = scan.nextInt();
				System.out.println("nhập vào đánh giá 3: ");
				int rate3 = scan.nextInt();
				int[] rates = { rate1, rate2, rate3 };
				News news1 = new News(title, publishDate, author, content, rates);
				listNews.add(news1);
				break;
			case 2:// xem ds tin tức
				for (News news : listNews) {
					news.Display();
				}
				break;
			case 3:// Average rate
				System.out.println("đánh giá trung bình rate");
				for (News news : listNews) {
					System.out.println("Title: " + news.getTitle() + " Rate: " + news.Calculate());
				}

				break;
			case 4:

				return;

			default:
				break;
			}
		}

	}

	public void question2() {
		QLTS();
	}

	public void QLTS() {
		TuyenSinh tuyenSinh = new TuyenSinh();
		List<ThiSinh> dsThiSinh = new ArrayList<ThiSinh>();
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("nhập vào chức năng muốn sử dụng");
			System.out.println("1: thêm mới thí sinh");
			System.out.println("2: Show Info thí sinh");
			System.out.println("3: tìm kiếm theo số báo danh");
			System.out.println("4: exit");
			int input = scan.nextInt();
			switch (input) {
			case 1:
				tuyenSinh.addThiSinh();
				break;
			case 2:
				tuyenSinh.showInfoThiSinh();
				break;
			case 3:
				System.out.println("nhập vào id thí sinh cần tìm: ");
				int id = scan.nextInt();
				tuyenSinh.searchThiSinh(id);
				break;
			case 4:
				return;

			default:
				break;
			}
		}

	}
}
