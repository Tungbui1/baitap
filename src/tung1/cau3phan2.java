package tung1;

public class cau3phan2 {
	public static void main(String[] args) {
		int Fn=0;
		int Fa=0;
		int Fb=1;
		System.out.println(Fa);
		System.out.println(Fb);
		for (int i = 0; i < 18; i++) {
			Fn=Fa+Fb;
			System.out.println(+Fn);
			Fa=Fb;
			Fb=Fn;
			
			
		}
	}
}
//f1=0=0
//f2=0=1
//f3=2=1