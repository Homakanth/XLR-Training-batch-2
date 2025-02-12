import java.util.Arrays;

public class Demo078 {
    public static void main(String[] args) {
        int[] numbers = {3, 8, 1, 6, 7, 2, 9, 4, 5, 10};
        rearrangeEvenOdd(numbers);
        System.out.println("Rearranged array: " + Arrays.toString(numbers));
    }

    public static void rearrangeEvenOdd(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}