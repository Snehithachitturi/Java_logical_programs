import java.util.Scanner;

 class ReverseString {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

     
        StringBuilder reversedString = new StringBuilder(inputString);
        reversedString.reverse();

    
        System.out.println("Reversed string: " + reversedString.toString());

        // Close the scanner
        scanner.close();
    }
}