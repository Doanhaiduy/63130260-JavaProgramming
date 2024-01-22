import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
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

}
