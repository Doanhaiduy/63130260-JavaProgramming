import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao chieu dai: ");
		double chieuDai = scanner.nextDouble();
		System.out.print("Nhap vao chieu rong: ");
		double chieuRong = scanner.nextDouble();
		System.out.printf("Chu vi cua hinh chu nhat la: %.2f\n", (chieuDai+ chieuRong)*2);
		System.out.printf("Dien Tich cua hinh chu nhat la: %.2f\n", (chieuDai* chieuRong));
		System.out.printf("Canh nho nhat la: %.2f\n", Math.min(chieuDai, chieuRong));
	}

}
