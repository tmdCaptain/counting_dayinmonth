package Java_02;

import java.util.Scanner;

public class CountingDays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int month, year;
		do {
			System.out.println(" Nhập năm:");
			year = sc.nextInt();
			if(year<0)
				System.out.println(" Năm " + year + " không tồn tại, mời bạn chạy lại");
			else
				System.out.println("Nhập tháng:");
				month = sc.nextInt();
				switch (month) {
				case 1: 
				case 3: 
				case 5: 
				case 7: 
				case 8: 
				case 10: 
				case 12:
					System.out.println(" Có tất cả 31 Ngày");
					break;
				case 4: 
				case 6: 
				case 9: 
				case 11: 
					System.out.println(" Có tất cả 30 Ngày");
					break;
				case 2:
					if(year %4 ==0 && year%100!=0 || year%400 ==0) 
						System.out.println(" Có tất cả 29 ngày");
					else
						System.out.println(" Có tất cả 28 ngày");
					break;
				default:
					System.out.println("Nhập sai tháng mời bạn nhập lại");
				}
			
		}while(month<1||month >12);
	}

}
