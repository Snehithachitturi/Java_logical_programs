import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 7, 8, 5, 6, 7, 7};
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
       
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element Frequency:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " | Frequency: " + entry.getValue());
        }
    }
}