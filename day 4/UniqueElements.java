import java.util.HashSet;

public class UniqueElements {

    public static void main(String[] args) {
        
        int[] arr = {4, 5, 6, 7, 4, 6, 8, 9, 7, 10};

      
        printUniqueElements(arr);
    }

    public static void printUniqueElements(int[] arr) {
 
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        
        for (int num : arr) {
            if (seen.contains(num)) {
                
                duplicates.add(num);
            } else {
                // Otherwise, add it to 'seen'
                seen.add(num);
            }
        }

        
        System.out.println("Unique elements in the array:");
        for (int num : seen) {
            
            if (!duplicates.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }
}