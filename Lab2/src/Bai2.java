import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
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

}
