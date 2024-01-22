import java.util.Scanner;

public class Bai4 {
	
	public static void giaiPTB1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao he so a: ");
		int a = scanner.nextInt();
		System.out.print("Nhap vao he so b: ");
		int b = scanner.nextInt();
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phuong trinh co vo so nghiem");
			}
			else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}
		else {
			System.out.printf("Nghiem cua phuong trinh x = %.2f", -b/(float)a);
		}
	}
	public static void giaiPTB2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao he so a: ");
		int a = scanner.nextInt();
		System.out.print("Nhap vao he so b: ");
		int b = scanner.nextInt();
		System.out.print("Nhap vao he so c: ");
		int c = scanner.nextInt();
		if(a == 0) {
			if(b == 0) {
				if(c== 0) {
					System.out.println("Phuong trinh co vo so nghiem");
				}
				else {
					System.out.println("Phuong trinh vo nghiem");
				}
			}
			else {
				System.out.printf("Nghiem cua phuong trinh x = %.2f", -c/(float)b);
			}
		}
		else {
			Double detal = Math.pow(b, 2) - 4*a*c;
			if(detal < 0) {
				System.out.println("Phuong trinh vo nghiem");
			}
			else {
				if(detal == 0) {
					System.out.printf("Phuong trinh co nghiem kep x = %f\n",-b/(float)(2*a));
				}
				else {
					System.out.print("Phuong trinh co 2 nghiem phan biet: \n");
					System.out.printf("x1 = %f\n",(-b + Math.sqrt(detal))/(float)(2*a));
					System.out.printf("x2 = %f\n",(-b - Math.sqrt(detal))/(float)(2*a));
				}
			}
		}
	}
	public static void tinhTienDien() {
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
	
	public static void menu() {
		System.out.println("+---------------------------------------------------+");
		System.out.println("1. Giai phuong trinh bac nhat");
		System.out.println("2. Giai phuong trinh bac 2");
		System.out.println("3. Tinh tien dien");
		System.out.println("4. Ket thuc");
		System.out.println("+---------------------------------------------------+");
		System.out.print("Chon chuc nang: ");
		Scanner scanner = new Scanner(System.in);
		int luaChon = scanner.nextInt();
		switch (luaChon) {
		case 1: {
			giaiPTB1();
			break;
		}
		case 2: {
			giaiPTB2();
			break;
		}
		case 3: {
			tinhTienDien();
			break;
		}
		case 4: {
			return;
		}
		default:
			System.out.println("Vui long nhap lua chon phu hop");
		}
	}
	public static void main(String[] args) {
		menu();
	}
}
