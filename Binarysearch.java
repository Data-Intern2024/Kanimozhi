import java.util.Arrays;
import java.util.Scanner;

class BinarySearchExample {
    public static void main(String[] args) {
        // unsorted array declaration and initialization
        int[] arr = {9, 2, 7, 1, 5, 3, 8, 4, 6, 10};

        // printing unsorted array elements
        System.out.println("Unsorted array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // sort the array
        Arrays.sort(arr);

        // printing sorted array elements
        System.out.println("Sorted array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // get the element to search
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // perform binary search
        int index = binarySearch(arr, target);

        // print the result
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        // close the scanner
        scanner.close();
    }

    // Binary search function
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Target was not found
        return -1;
    }
}
