package java8;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
	
	    public static void main(String[] args) {
	        String input = "Hello World Java Programs";

	        String reversed = reverseWords(input);

	        System.out.println("Original string: " + input);
	        System.out.println("String with reversed words: " + reversed);
	    }

	    public static String reverseWords(String str) {
	        // Split the string into words, reverse each word, and collect back into a string
	        return Arrays.stream(str.split("\\s+"))        // Split by whitespace
	                     .map(word -> new StringBuilder(word).reverse())  // Reverse each word
	                     .collect(Collectors.joining(" "));  // Join words back into a single string
	    }
	}

