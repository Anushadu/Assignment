/*4. Write a method that takes a date in the format yyyy-MM-dd and returns the day of the week for
that date.*/
	import java.time.DayOfWeek;
	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	import java.util.Scanner;
	public class DayofWeek {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a date in yyyy-MM-dd format: ");
	        String dateStr = scanner.nextLine();
	        
	        DayOfWeek dayOfWeek = findDayOfWeek(dateStr);
	        
	        // Print the day of the week
	        System.out.println("Day of the week for " + dateStr + " is " + dayOfWeek);
	        
	        scanner.close();
	    }

	    // Method to find the day of the week for a given date string
	    public static DayOfWeek findDayOfWeek(String dateStr) {
	        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ISO_DATE);
	        return date.getDayOfWeek();
	    }
	}



