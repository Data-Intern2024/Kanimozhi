public class LinearSearch {

    public static void main(String[] args) {
        int[] array = {2, 4, 0, 1, 9};
        int target = 1;
        
        int result = linearSearch(array, target);
        
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Method to perform Linear Search
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;  // Return the index where the target is found
            }
        }
        return -1;  // Return -1 if the target is not found
    }
}
