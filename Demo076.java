
public class Demo076 {
    public static int findSecondMax(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }
        
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        
        if (secondMax == Integer.MIN_VALUE) {
            throw new RuntimeException("No second maximum found, all elements might be the same");
        }
        
        return secondMax;
    }
    
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        System.out.println("Second Maximum Number: " + findSecondMax(numbers));
    }
}
