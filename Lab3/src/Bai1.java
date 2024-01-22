import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so nguyen: ");
		int n = scanner.nextInt();
		boolean check = true;
		for(int i=2; i < n-1; i++){ 
			if(n % i == 0){
				check = false;
				break;
			}
			i++;
		}
		if(check == true && n !=1) {
			System.out.println(n + " la so nguyen to");
		}
		else {
			System.out.println(n + " khong phai la nguyen to");
		}
	}

}
