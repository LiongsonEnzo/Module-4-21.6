import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner input = new Scanner(System.in);

        // Create a HashMap to store numbers and their counts
        HashMap<Integer, Integer> numberCounts = new HashMap<>();

        System.out.println("Enter integers (input ends with 0):");
        
        // Read the input numbers
        int number;
        while ((number = input.nextInt()) != 0) {
            // If the number is already in the map, increment its count
            if (numberCounts.containsKey(number)) {
                numberCounts.put(number, numberCounts.get(number) + 1);
            } else {
                // Otherwise, add the number with count 1
                numberCounts.put(number, 1);
            }
        }

        // Find the maximum occurrence count
        int maxCount = 0;
        for (int count : numberCounts.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // Find all numbers with the maximum occurrence
        System.out.print("The numbers with the most occurrences are: ");
        for (Map.Entry<Integer, Integer> entry : numberCounts.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.print(entry.getKey() + " ");
            }
        }

        // Close the scanner
        input.close();
    }
}
