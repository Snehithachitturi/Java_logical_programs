 class ArrayCopy 
{
    public static void main(String[] args) {
 
        int[] sourceArray = {10, 20, 30, 40, 50};
        int[] destinationArray = new int[sourceArray.length];

        // Method 1: Using a loop to copy each element
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }
        System.out.println("Destination array (after copying using loop): ");
        for (int element : destinationArray) {
            System.out.print(element + " ");
        }

        // Method 2: Using System.arraycopy()
        int[] destinationArray2 = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, destinationArray2, 0, sourceArray.length);

        // Printing the destination array after copying using System.arraycopy()
        System.out.println("\nDestination array (after copying using System.arraycopy): ");
        for (int element : destinationArray2) {
            System.out.print(element + " ");
        }

        // Method 3: Using Arrays.copyOf()
        int[] destinationArray3 = java.util.Arrays.copyOf(sourceArray, sourceArray.length);

        System.out.println("\nDestination array (after copying using Arrays.copyOf): ");
        for (int element : destinationArray3) {
            System.out.print(element + " ");
        }
    }
}