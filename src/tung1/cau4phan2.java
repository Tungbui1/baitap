package tung1;

import java.util.Scanner;

public class cau4phan2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("sotiengui");
		int sotiengui = scanner.nextInt();
        System.out.println("laisuat");
		int laisuat = scanner.nextInt();
		System.out.println("sothanggui");
		int sothanggui = scanner.nextInt();	
		double tongtien=sotiengui;
		for (int i = 1; i < sothanggui; i++) {
			double laikep=tongtien*laisuat/100;
			tongtien+= laikep;		
		 
			
		}
	
	System.out.println("Lai kep la"+tongtien );			
	}

}
