public class Demo065 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Example array

        int sum = addFirstLast(arr);
        System.out.println("Sum of first and last elements: " + sum);
    }

    public static int addFirstLast(int[] arr) {
        if (arr.length == 0) return 0; // Handle empty array case
        return arr[0] + arr[arr.length - 1]; // Add first and last elements
    }
}