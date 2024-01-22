import java.util.Scanner;

public class Bai4 {
	public static String GetHocLuc(float diem) {
		if(diem >=0 && diem <=10) {
			if(diem < 5) {
				return "Yeu";
			}
			if(diem >=5 && diem < 6.5) {
				return "Trung binh";
			}
			if(diem >=6.5 && diem < 7.5) {
				return "Kha";
			}
			if(diem >=7.5 && diem < 9) {
				return "Gioi";
			}
			if(diem >=9) {
				return "Xuat sac";
			}
		}
			return "Diem khong hop le";

		
	}
	
	public  static void Nhap(String[] arr1,float[] arr2, int n ) {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i< n; i++) {
			System.out.printf("Nhap ten sinh vien thu %d: ",i+1);
			arr1[i] = scanner.nextLine();
			System.out.printf("Nhap diem sinh vien thu %d: ",i+1);
			arr2[i] = scanner.nextFloat();
			scanner.nextLine();
			
		}
	}
	public  static void Xuat(String[] arr1,float[] arr2, int n ) {
		for(int i = 0; i< n; i++) {
			System.out.printf("\nSinh vien thu %d:\n", i+1);
			System.out.printf("Ho ten: %s\n",arr1[i]);
			System.out.printf("Diem: %.2f\n",arr2[i]);
			System.out.printf("Hoc luc: %s\n",GetHocLuc(arr2[i]));
		}
	}
	public static void SapXep(String[] arr1,float[] arr2, int n) {
		for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr2[i] > arr2[j]) {
             
                    String tempName = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = tempName;

                    float tempScore = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = tempScore;
                }
            }
        }
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhap vao so luong sinh vien: ");
		int n = scanner.nextInt();
		String arr1[] = new String[n];
		float arr2[] = new float[n];
		Nhap(arr1,arr2,n);
		Xuat(arr1, arr2, n);
		SapXep(arr1, arr2, n);
		System.out.println("\nSinh vien sau khi sap xep tang dan theo diem: \n");
		Xuat(arr1, arr2, n);
	}

}
