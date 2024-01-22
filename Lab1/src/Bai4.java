import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so a: ");
		int a = scanner.nextInt();
		System.out.printf("Nhap vao so b: ");
		int b = scanner.nextInt();
		System.out.printf("Nhap vao so c: ");
		int c = scanner.nextInt();
		Double detal = Math.pow(b, 2) - 4*a*c;
		System.out.printf("Delta = %.2f, Can Delta = %.2f", detal, Math.sqrt(detal));
	}

}
