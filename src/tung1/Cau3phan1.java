package tung1;

import java.util.Scanner;

public class Cau3phan1 {
	public static void main(String[] args) {
		double a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap Số 0");
				a = scanner.nextDouble();
				
if (a>0) {
	System.out.println("Positive");
}
	 else if(a<0) {
	System.out.println("Negative");

	 }	else {
	System.out.println("0");
}
	}

}
