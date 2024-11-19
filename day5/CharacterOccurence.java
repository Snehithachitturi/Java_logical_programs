import java.util.Scanner;
 class CharacterOccurrence{
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        System.out.print("Enter the character to search for: ");
        char searchChar = scanner.next().charAt(0);
       
        findOccurrences(inputString, searchChar);
        
     
        scanner.close();
}
    public static void findOccurrences(String inputString, char searchChar) {
        boolean found = false;
   
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                System.out.println("Character '" + searchChar + "' found at index: " + i);
                found = true;
            }
        }
              if (!found) {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        }
    }
}