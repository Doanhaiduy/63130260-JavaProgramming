import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

	public  static void Nhap(int[] arr,int n) {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<n;i++) {
			System.out.printf("Nhap vao phan tu thu %d: ",i);
			arr[i] = scanner.nextInt();
			}
	}
	public  static void Xuat(int[] arr,int n) {
		for(int i = 0; i<n;i++) {
			System.out.printf(" %d ",arr[i]);
		}
	}
	public static int TimMin(int[] arr,int n) {
		int min = arr[0];
		for(int i = 0; i<n;i++) {
			min = Math.min(min, arr[i]);
		}
		return min;
	}
	
	public static double TrungBinhCong(int[] arr,int n) {
		double tong = 0;
		int count = 0;
		for(int i = 0; i<n;i++) {
			if(arr[i] % 3 ==0) {
				tong += arr[i];
				count++;
			}
		}
		return tong/count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so luong phan tu: ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		Nhap(arr,n);
		Arrays.sort(arr);
		System.out.print("Mang sau khi da sap xep: ");
		Xuat(arr, n);
		System.out.printf("\nGia tri nho nhat trong mang: %d", TimMin(arr, n));
		System.out.printf("\nTrung binh cong cac phan tu chia het cho 3: %.2f", TrungBinhCong(arr, n));
	}

}
