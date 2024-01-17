package tung1;

import java.util.Scanner;

public class cau1phan2 {
public static void main(String[] args) {
	int a;
	System.out.println("Nhập số để tính giai thừa");
	Scanner scanner = new Scanner(System.in);
	a = scanner.nextInt();
	int giaithua = 0;
			for (int i = 1; i <= a; i++) {
				giaithua=i*giaithua;
				
			}
		System.out.println("Giai thừa là :" +giaithua);
}
}
// a=3
//1x2x3=6