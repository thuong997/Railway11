package com.vti.frontend;
import java.time.LocalDate;
import java.util.Random;

public class Random_number {

	public static void main(String[] args) {
		// ------Exercise 4 (Optional): Random Number>>>>>>>>>>
				// Question 1: In ngẫu nhiên ra 1 số nguyên
				Random random = new Random();
				int x = random.nextInt();
				System.out.println("int: " + x);

				// Question 2: In ngẫu nhiên ra 1 số thực
				Random randoms = new Random();
				float y = randoms.nextFloat();
				System.out.println("Float: " + y);

				// Question 3:Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in
				// ngẫu nhiên
				// ra tên của 1 bạn
				Random randomr = new Random();
				String[] bro = { "Tiến bịp", "Thưởng Bro", "Độ mixi" };
				int br = randomr.nextInt(bro.length);
				System.out.println("tên 1 bạn trong lớp: " + bro[br]);

				// Question 4:Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày
				// 20-12-1995
				Random ran = new Random();
				int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
				int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
				long ranInt = minDay + ran.nextInt(maxDay - minDay);
				LocalDate ranDay = LocalDate.ofEpochDay(ranInt);
				System.out.println("Ngày ngẫu nhiên: " + ranDay);

				// Question 5:Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
				Random randomy = new Random();
				int nowDay = (int) LocalDate.now().toEpochDay();
				int oldDay = nowDay - randomy.nextInt(365);
				LocalDate randomDay = LocalDate.ofEpochDay(oldDay);
				System.out.println("1 ngày ngẫu nhiên 1Y trước: " + randomDay);

				// Question 6:Lấy ngẫu nhiên 1 ngày trong quá khứ
				Random quaKhu = new Random();
				int nowDay1 = (int) LocalDate.now().toEpochDay();
				long ranDay1 = quaKhu.nextInt(nowDay1);
				LocalDate randomDay1 = LocalDate.ofEpochDay(ranDay1);
				System.out.println("ngày trong quá khứ: " + randomDay1);
				
				//Question 7:Lấy ngẫu nhiên 1 số có 3 chữ số
				Random random3Int = new Random();
				int z = random3Int.nextInt(999 - 100 + 1) + 100;
				System.out.println("số có 3 chữ số ngẫu nhiên: " + z);

	}

}
