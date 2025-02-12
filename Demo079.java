import java.util.Scanner;

public class Demo079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Get input from user
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        // Search for the element
        boolean found = false;
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }

        // Print result
        if (found) {
            System.out.println(target + " is found in the array.");
        } else {
            System.out.println(target + " is not found in the array.");
        }

        scanner.close();
    }
}
