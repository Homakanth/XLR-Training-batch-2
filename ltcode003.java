import java.util.Scanner;

public class StringToIntExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //String str = "123";
        System.out.println("Enter a string: ");
        String str=scanner.next();

        // Convert string to int
        int number = Integer.parseInt(str);

        System.out.println("Converted integer: " + number);
    }
}