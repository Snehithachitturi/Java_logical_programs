import java.util.Scanner;

public class Character {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
     
        System.out.print("Enter a character to count: ");
        char charToCount = scanner.next().charAt(0);
       
        int count = 0;
      
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == charToCount) {
                count++;
            }
        }
        
      
        System.out.println("The character '" + charToCount + "' occurs " + count + " times in the string.");
  
        scanner.close();
    }
}