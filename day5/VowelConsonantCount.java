import java.util.Scanner;

public class VowelConsonantCount {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Call the method to count vowels and consonants
        countVowelsAndConsonants(input);
    }
    
    public static void countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        
        // Convert the string to lowercase to make the comparison case-insensitive
        str = str.toLowerCase();
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    // If it's a letter but not a vowel, it's a consonant
                    consonantCount++;
                }
            }
        }
        
        // Output the results
        System.out.println("Total vowels: " + vowelCount);
        System.out.println("Total consonants: " + consonantCount);
    }
}