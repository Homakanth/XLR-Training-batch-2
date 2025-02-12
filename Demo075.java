public class Demo075 {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 68, 4, 99, 45, 32};
        
        int max = findMax(numbers);
        
        System.out.println("The maximum number in the array is: " + max);
    }
    
    public static int findMax(int[] arr) {
        int max = arr[0]; // Assume first element is the max
        
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        
        return max;
    }
}
