import java.util.Scanner;

public class Count{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        int negativeCount = countNegativeElements(array);
        System.out.println("Total number of negative elements in the array: " + negativeCount);
    }

    public static int countNegativeElements(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }
}