 class LastOccurrence {
    public static void main(String[] args) {
    
        String str = "This is a test string. Test this code!";
        String substring = "test";
        int lastIndex = str.toLowerCase().lastIndexOf(substring.toLowerCase());

        if (lastIndex != -1) {
            System.out.println("The last occurrence of \"" + substring + "\" is at index: " + lastIndex);
        } else {
            System.out.println("\"" + substring + "\" not found in the string.");
        }
    }
}