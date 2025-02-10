import java.util.Scanner;
class ltcode001 {
    boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        String original = String.valueOf(num);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int num = scanner.nextInt();

        ltcode001 demo = new ltcode001();
        if (demo.isPalindrome(num)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }
}