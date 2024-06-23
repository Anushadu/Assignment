import java.util.Scanner;
public class ticketprice {

	public static void moviePrice(int type, int age) {
		switch(type) {
		case 1: if(age<18 && age>=0) System.out.println("Your regular Movie Price: 100");
				else if(age>=18) System.out.println("Your regular Movie Price: 200");
				else System.out.println("Invalid age");
				break;
		case 2: if(age<18 && age >= 0) System.out.println("Your 3D Movie Price: 500");
				else if(age>=18) System.out.println("Your 3D Movie Price: 1000");
				else System.out.println("Invalid age");
				break;
		default: System.out.println("Invalid Movie type!!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type of movie Available: 1.Regural 2.3D");
		System.out.print("Choose Your Movie Type: ");
		int movieType = sc.nextInt();
		System.out.print("Enter Your age: ");
		int  age= sc.nextInt();
		
		moviePrice(movieType,age);

	}

	}


