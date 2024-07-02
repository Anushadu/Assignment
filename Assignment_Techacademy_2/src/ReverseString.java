/*1.Write a method to reverse a given string without using the built-in reverse method. The method
should take a string as input and return the reversed string.*/

public class ReverseString {
	

	    public static String reverseString(String input) {
	        StringBuilder reversed = new StringBuilder();

	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed.append(input.charAt(i));
	        }

	       return reversed.toString();
	    }

	    public static void main(String[] args) {
	        String input = "Techacemy Assignment!";
	        String reversed = reverseString(input);
	        System.out.println("Original: " + input);
	        System.out.println("Reversed: " + reversed);
	    }
	}



