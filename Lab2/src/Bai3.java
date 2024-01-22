import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so dien su dung cua thang: ");
		double soDien = scanner.nextDouble();
		if(soDien >= 0 && soDien <= 50) {
			System.out.printf("Tien dien cua thang: %.2f",soDien*1000);
		}
		if(soDien > 50) {
			System.out.printf("Tien dien cua thang: %.2f",soDien*1200);
		}
	}

}
