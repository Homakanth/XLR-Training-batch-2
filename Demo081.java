import java.util.*;

public class Demo081 {
    public static void findLeaders(int[] arr) {
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        
        // List to store leader elements
        List<Integer> leaders = new ArrayList<>();
        leaders.add(maxFromRight);
        
        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }
        
        // Print leaders in order
        Collections.reverse(leaders);
        System.out.println("Leader elements: " + leaders);
    }
    
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        findLeaders(arr);
    }
}