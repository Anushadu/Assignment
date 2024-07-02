/*3. Write a method that takes a person's birthdate in the format yyyy-MM-dd and calculates their
age in years, months, and days. Use the java.time package to perform the calculations*/
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

	public class Birthdate {

		private static void calculateAge(int year, int month, int day, LocalDate ld) {
				
				LocalDate birthDay = LocalDate.of(year, month, day);
				int y = Period.between(birthDay, ld).getYears();
				int m = Period.between(birthDay, ld).getMonths();
				int d = Period.between(birthDay, ld).getDays();
				
				System.out.println("Current Age: "+y+" years "+m+" months "+d+" days");
			}

			public static void main(String[] args) {
				LocalDate ld = LocalDate.now();
				
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter Year: "); 
				int year = sc.nextInt();
				System.out.print("Enter month: "); 
				int month = sc.nextInt();
				System.out.print("Enter day: "); 
				int day = sc.nextInt();
				
				try {
					if(year>ld.getYear())
						System.out.println("Invalid!!");
					else
						calculateAge(year,month,day,ld);
				}
				catch(Exception e) {
					System.out.println("Error: "+ e.getMessage());
				}
				//System.out.println(ld);
				sc.close();

			}

			
		}


