package tung1;

import java.util.Scanner;

public class cau1phan1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
          System.out.println("Nhap So a");
         int a = scanner.nextInt();
          System.out.println("Nhap So b");
         int b = scanner.nextInt();
          System.out.println("Nhap So c");
         int c = scanner.nextInt();
          int max =c;
        		  if (max<a) {
        			  max = a;
					}
          if (max<b) {
        	  max=b;
			
		}
          System.out.println("So lon nhat la : "+ max);
	}
		
	} 
