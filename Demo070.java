public class Demo070 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 9, 20, 15, 6, 8, 3, 10, 5, 11}; // Sample array

        System.out.println("Prime numbers in the array:");
        for (int num : numbers) {
            if (isPrime(num)) { // Check if the number is prime
                System.out.print(num + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) { // Check divisibility up to sqrt(n)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}