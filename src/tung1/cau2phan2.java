package tung1;
public class cau2phan2 {
public static void main(String[] args) {
	int a=2;
	while (a<70) {
              a++;
			
			boolean flag=true;
			for (int i = 2; i < a; i++) {
			if (a % i ==0) {
				flag= false;
				break;
				
				
			}
			
			
		}if(flag) {
			System.out.println(+a);
			
			
			}
		
	}	
	
	}
}