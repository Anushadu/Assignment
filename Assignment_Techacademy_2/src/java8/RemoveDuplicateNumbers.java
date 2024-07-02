package java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateNumbers {

	
	    public static void main(String[] args) {
	        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 4, 2, 3, 4, 5);

	        // Remove duplicates using distinct() method
	        List<Integer> uniqueNumbers = numbersWithDuplicates.stream()
	                                                           .distinct()
	                                                           .collect(Collectors.toList());

	        // Print the list without duplicates
	        System.out.println("Original List: " + numbersWithDuplicates);
	        System.out.println("List without duplicates: " + uniqueNumbers);
	    }
	}


