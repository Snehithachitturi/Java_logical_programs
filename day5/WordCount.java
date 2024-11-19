public class WordCount {
    public static void main(String[] args) {
       
        String input = "This is a simple example to count words.";
        
        int wordCount = countWords(input);
        
        
        System.out.println("Total number of words: " + wordCount);
    }

    // Function to count words in a string
    public static int countWords(String str) {
        // Split the string by spaces and filter out empty strings
        String[] words = str.trim().split("\\s+");
        
        return words.length;
    }
}