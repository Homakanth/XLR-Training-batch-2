import java.util.Scanner;

public class Demo083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().trim();
        
        if (input.isEmpty()) {
            System.out.println("String is empty. Please enter a valid string.");
        } else {
            char firstChar = Character.toLowerCase(input.charAt(0));
            
            if (isVowel(firstChar)) {
                System.out.println("The first character '" + firstChar + "' is a vowel.");
            } else if (Character.isLetter(firstChar)) {
                System.out.println("The first character '" + firstChar + "' is a consonant.");
            } else {
                System.out.println("The first character '" + firstChar + "' is not a letter.");
            }
        }
        scanner.close();
    }
    
    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
