import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {
//		BT 2:
//		SanPham sp1= new SanPham();
//		SanPham sp2= new SanPham();
//		sp1.nhap();
//		sp2.nhap();
//		sp1.xuat();
//		sp2.xuat();		
		
		
//		BT3
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao ten san pham: ");
		String tensp1  = scanner.nextLine();
		System.out.print("Nhap vao don gia: ");
		double donGia1 = scanner.nextDouble();
		System.out.print("Nhap vao giam gia: ");
		double giamGia1 = scanner.nextDouble();
		
		SanPham sp1= new SanPham(tensp1,donGia1,giamGia1);
		scanner.nextLine();
		
		System.out.print("Nhap vao ten san pham: ");
		String tensp2  = scanner.nextLine();
		System.out.print("Nhap vao don gia: ");
		double donGia2 = scanner.nextDouble();
		
		SanPham sp2= new SanPham(tensp2,donGia2);
		
		sp1.xuat();
		sp2.xuat();
	}

}
