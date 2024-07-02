package java8;

public class SumofallDigits {

	    public static void main(String[] args) {
	        int number = 12345;
	        
	        // Calculate sum of digits
	        int sum = calculateSumOfDigits(number);
	        
	        // Print the result
	        System.out.println("Sum of digits of " + number + " is: " + sum);
	    }
	    
	    public static int calculateSumOfDigits(int number) {
	        int sum = 0;
	      
	        while (number != 0) {
	            int digit = number % 10; // Get the last digit
	            sum += digit; // Add the digit to sum
	            number /= 10; // Remove the last digit from number
	        }
	        
	        return sum;
	    }
	}


