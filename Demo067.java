public class Demo067 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 9, 20, 15, 6, 8, 3, 10}; // Sample array

        System.out.println("Even elements in the array:");
        for (int num : numbers) {
            if (num % 2 == 0) { // Check if the number is even
                System.out.print(num + " ");
            }
        }
    }
}