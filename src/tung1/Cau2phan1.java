/**
 * 
 */
package tung1;
import java.util.Scanner;
/**
 * 
 */
public class Cau2phan1 {
	public static void main(String[] args) {
	double diem = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap diem so hoc sinh");
		diem = scanner.nextDouble();
		if (diem > 8) {
			System.out.println("xếp loại giỏi ");
			
		}
		else if (diem > 6.5) {
			System.out.println("xếp loại kha ");
			
		}
		else if (diem > 4) {
			System.out.println("xếp loại trung binh ");
			
		}
		else {
             System.out.println("xếp loại yeu");;
        }
			
		}
		
		
	}
	


