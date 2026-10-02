import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        
        double median = findMedian(numbers);

        
        System.out.println("\nCalculated Median: " + median);

        scanner.close();
    }

    
    public static double findMedian(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0.0;
        }

        
        int[] sorted = numbers.clone();
        Arrays.sort(sorted);

        int length = sorted.length;

        
        if (length % 2 != 0) {
            return sorted[length / 2];
        } 
        
        else {
            int mid1 = sorted[(length / 2) - 1];
            int mid2 = sorted[length / 2];
            return (mid1 + mid2) / 2.0;
        }
    }
}