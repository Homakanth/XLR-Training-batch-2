import java.util.Arrays;

public class Demo082 {
    public static void main(String[] args) {
        // Define two arrays
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        // Calculate the size of the merged array
        int mergedLength = array1.length + array2.length;
        int[] mergedArray = new int[mergedLength];

        // Copy elements from first array
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        
        // Copy elements from second array
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        
        // Print merged array before sorting
        System.out.println("Merged array before sorting: " + Arrays.toString(mergedArray));
        
        // Sort the merged array (optional, depending on requirement)
        Arrays.sort(mergedArray);
        
        // Print the final merged and sorted array
        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));
    }
}
