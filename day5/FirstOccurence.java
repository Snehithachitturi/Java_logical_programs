import java.util.Scanner;

 class FirstOccurrence {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        System.out.print("Enter the character to find: ");
        char searchChar = scanner.next().charAt(0);
       
        int index = inputString.indexOf(searchChar);
       
        if (index != -1) {
            System.out.println("The first occurrence of '" + searchChar + "' is at index: " + index);
        } else {
            System.out.println("The character '" + searchChar + "' is not found in the string.");
        }

        scanner.close();
    }
}