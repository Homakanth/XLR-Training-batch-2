import java.util.Arrays;

public class Demo080 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        shiftLeft(arr);
        
        System.out.println("Shifted array: " + Arrays.toString(arr));
    }
    
    public static void shiftLeft(int[] arr) {
        if (arr.length == 0) return;
        
        int firstElement = arr[0]; // Store first element
        
        // Shift elements to the left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
        // Move first element to last position
        arr[arr.length - 1] = firstElement;
    }
}
