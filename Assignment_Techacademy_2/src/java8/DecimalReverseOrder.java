package java8;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DecimalReverseOrder {
	
	    public static void main(String[] args) {
	        List<Double> decimals = Arrays.asList(3.2, 2.71, 1.618, 4.669, 1.718);

	        // Sort decimals in reverse order using streams
	        List<Double> sortedDecimals = decimals.stream()
	                                             .sorted(Comparator.reverseOrder())
	                                             .collect(Collectors.toList());

	        // Print sorted list in reverse order
	        System.out.println("Original List: " + decimals);
	        System.out.println("Sorted List in Reverse Order: " + sortedDecimals);
	    }
	}

