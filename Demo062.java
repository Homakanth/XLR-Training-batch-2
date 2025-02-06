public class Demo062 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Example array
        
        if (arr.length >= 1) {
            System.out.println("First Element: " + arr[0]);
        }
        if (arr.length >= 2) {
            System.out.println("Second Element: " + arr[1]);
        }
        if (arr.length >= 1) {
            System.out.println("Last Element: " + arr[arr.length - 1]);
        }
    }
}
