import java.util.Scanner;

public class SanPham {
	private String tenSp;
	private double donGia;
	private double giamGia;
	
	public String getTenSp(){
		return this.tenSp;
	}
	public void setTenSp(String tenSp){
		this.tenSp = tenSp;
	}
	
	public double getDonGia(){
		return this.donGia;
	}
	public void setDonGia(Double donGia){
		this.donGia = donGia;
	}
	
	public double getGiamGia(){
		return this.giamGia;
	}
	public void setGiamGia(Double giamGia){
		this.giamGia = giamGia;
	}
	
	public SanPham(String tenSp, double donGia, double giamGia){
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	public SanPham(String tenSp, double donGia){
		this(tenSp, donGia, 0);
	}
	
	private double getThueNhapKhau() {
		return (donGia/100) * 10;
	}
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao ten san pham: ");
		tenSp = scanner.nextLine();
		System.out.print("Nhap vao don gia: ");
		donGia = scanner.nextDouble();
		System.out.print("Nhap vao giam gia: ");
		giamGia = scanner.nextDouble();
	}
	
	public void xuat() {
		System.out.printf("\nThong tin san pham: \n");
		System.out.printf("Ten san pham: %s\n", tenSp);
		System.out.printf("Don gia: %.2f\n", donGia);
		System.out.printf("Giam gia: %.2f\n", giamGia);
		System.out.printf("Thue nhap khau: %.2f\n", getThueNhapKhau());
	}

}
