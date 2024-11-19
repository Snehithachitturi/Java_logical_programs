public class MaxMin {

    public static void main(String[] args)
       {
        int[] numbers = {12, 34, 5, 8, 19, 2, 50, 21, 77, 4};
        int[] result = findMaxMin(numbers);
        System.out.println("Maximum value: " + result[0]);
        System.out.println("Minimum value: " + result[1]);
    }
     public static int[] findMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
          return new int[] {max, min};
    }
}
        
    