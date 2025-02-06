public class Demo063 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Example array

        System.out.println("Original Array:");
        printArray(arr);

        // Swap first and last elements
        swapFirstLast(arr);

        System.out.println("Array after swapping first and last elements:");
        printArray(arr);
    }

    public static void swapFirstLast(int[] arr) {
        if (arr.length > 1) { // Ensure array has at least two elements
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}