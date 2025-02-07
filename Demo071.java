public class Demo071 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 9, 20, 15, 6, 8, 3, 10}; // Sample array
        
        System.out.println("Original array:");
        printArray(numbers);

        // Reverse the array
        reverseArray(numbers);

        System.out.println("Reversed array:");
        printArray(numbers);
    }

    // Method to reverse the array
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }

    // Method to print array elements
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}