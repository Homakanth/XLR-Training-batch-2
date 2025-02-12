import java.util.HashSet;

public class Demo073 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1};
        
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        
        System.out.println("Duplicate elements in the array:");
        for (int num : arr) {
            if (!seen.add(num)) { // If add() returns false, it means num is a duplicate
                duplicates.add(num);
            }
        }
        
        for (int dup : duplicates) {
            System.out.println(dup);
        }
    }
}