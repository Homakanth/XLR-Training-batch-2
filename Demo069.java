public class Demo069 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 9, 20, 15, 6, 8, 3, 10}; // Sample array
        int sum = 0; // Variable to store sum

        for (int num : numbers) {
            sum += num; // Add each element to sum
        }

        System.out.println("Sum of all elements in the array: " + sum);
    }
}