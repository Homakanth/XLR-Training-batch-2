public class Demo068 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 9, 20, 15, 6, 8, 3, 10}; // Sample array
        int count = 0; // Variable to count even numbers

        for (int num : numbers) {
            if (num % 2 == 0) { // Check if the number is even
                count++;
            }
        }

        System.out.println("Count of even numbers in the array: " + count);
    }
}