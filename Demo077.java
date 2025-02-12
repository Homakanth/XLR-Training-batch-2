import java.util.Arrays;

public class Demo077 {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = {1, 2, 3, 4, 5};
        
        // Creating a new array of the same length
        int[] copiedArray = new int[originalArray.length];
        
        // Copying elements from originalArray to copiedArray
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }
        
        // Displaying the original and copied arrays
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }
}
