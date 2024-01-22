import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao canh cua khoi lap phuong: ");
		double canh = scanner.nextDouble();
		System.out.printf("The tich khoi lap phuong: %.2f\n", Math.pow(canh, 3));
	}

}