package java8;
import java.util.Arrays;
public class sumaveragearray{
    public static void main(String[] args) {
        int[] array = { 10, 5, 8, 20, 2, 15 };

        // Calculate sum of all elements
        int sum = Arrays.stream(array).sum();

        // Calculate average of all elements
        double average = Arrays.stream(array).average().orElse(0);

        // Print results
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + average);
    }
}

