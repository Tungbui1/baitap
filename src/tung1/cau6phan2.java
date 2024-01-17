package tung1;

import java.util.Scanner;
import java.util.Random;
public class cau6phan2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lớn:");
		int a =scanner.nextInt();
		System.out.println("Nhập số bé:");
		int b =scanner.nextInt();
		if(a>b) {
		Random random = new Random();
		System.out.println("số sẽ được chọn ngẫu nhiên giữa 2 số");
		System.out.println(" bạn có 3 cơ hội chương trình sẽ gợi ý ");
        
		int sotrung = random.nextInt(a - b +1) + b;
        
        int luotchoi=0;
	   while(luotchoi<3) {
		   System.out.println("Số bạn chọn là  ");
		   int sochoi = scanner.nextInt();
		   if (sochoi>sotrung) {
			   System.out.println("Giảm xuống");
			   
			} else if(sochoi<sotrung) {
				System.out.println("Tăng lên ");
				

		}
		   else {
			System.out.println("Bạn đã thắng");
			break;
		}
		   luotchoi++;  
	   }
        if (luotchoi==3) {
        	System.out.println("Bạn đã thua");
        		
	}
		}
		else {
			System.out.println("số dầu phải lớn hơn số sau; xin mời chạy lại chương trình");
	
		}
		}
		}


