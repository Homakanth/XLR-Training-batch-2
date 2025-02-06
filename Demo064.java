public class Demo064 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array

        System.out.println("Original Array:");
        printArray(arr);

        // Rotate array right by one position
        rotateRight(arr);

        System.out.println("Array after rotating right:");
        printArray(arr);
    }

    public static void rotateRight(int[] arr) {
        if (arr.length <= 1) return; // No rotation needed for empty or single-element array

        int lastElement = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; // Shift elements to the right
        }

        arr[0] = lastElement; // Place last element at the first position
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}