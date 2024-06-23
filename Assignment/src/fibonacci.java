
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int a=0,b=1,c=0;
		System.out.print("0 1 ");
		for(int i=3; i<=n; i++) {
			c = a+b;
			a = b;
			b = c;
			System.out.print(c+" ");
		}
	}

}
