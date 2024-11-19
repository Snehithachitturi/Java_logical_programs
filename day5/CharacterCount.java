import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for input string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        // Initialize counters for alphabets, digits, and special characters
        int alphabetCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;
        
        // Loop through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Check if the character is an alphabet
            if (Character.isAlphabet(ch)) {
                alphabetCount++;
            }
            // Check if the character is a digit
            else if (Character.isDigit(ch)) {
                digitCount++;
            }
            // If it is neither an alphabet nor a digit, it's a special character
            else {
                specialCharCount++;
            }
        }
        
        // Display the results
        System.out.println("Total Alphabets: " + alphabetCount);
        System.out.println("Total Digits: " + digitCount);
        System.out.println("Total Special Characters: " + specialCharCount);
        
        // Close the scanner
        scanner.close();
    }
}