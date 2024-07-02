package java8;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMin {



    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 7, 25, 4, 30, 15, 8, 35);

        // Find maximum value
        Optional<Integer> max = numbers.stream()
                                       .max(Integer::compareTo);

        // Find minimum value
        Optional<Integer> min = numbers.stream()
                                       .min(Integer::compareTo);

        // Print results
        if (max.isPresent()) {
            System.out.println("Maximum value: " + max.get());
        } else {
            System.out.println("No maximum value found. List might be empty.");
        }

        if (min.isPresent()) {
            System.out.println("Minimum value: " + min.get());
        } else {
            System.out.println("No minimum value found. List might be empty.");
        }
    }
}

