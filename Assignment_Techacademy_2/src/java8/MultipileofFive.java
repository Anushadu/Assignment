package java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipileofFive {
	

	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(10, 7, 25, 4, 30, 15, 8, 35);

	        // Filter numbers which are multiples of 5
	        List<Integer> multiplesOfFive = numbers.stream()
	                                               .filter(n -> n % 5 == 0)
	                                               .collect(Collectors.toList());

	        // Print multiples of 5
	        System.out.println("Numbers which are multiples of 5: " + multiplesOfFive);
	    }
	}


