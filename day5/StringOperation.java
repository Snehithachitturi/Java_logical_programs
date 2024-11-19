 class StringOperations {

    public static void main(String[] args) {
        // Initialize two strings
        String str1 = "Hello, ";
        String str2 = "World!";

        // 1. Find the length of a string
        int length1 = str1.length();
        int length2 = str2.length();

        // Print the lengths
        System.out.println("Length of str1: " + length1);
        System.out.println("Length of str2: " + length2);

        // 2. Compare two strings
        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult == 0) {
            System.out.println("The strings are equal.");
        } else if (comparisonResult < 0) {
            System.out.println("str1 is lexicographically smaller than str2.");
        } else {
            System.out.println("str1 is lexicographically greater than str2.");
        }

        // 3. Concatenate two strings
        String concatenatedString = str1 + str2;
        System.out.println("Concatenated string: " + concatenatedString);
    }
}