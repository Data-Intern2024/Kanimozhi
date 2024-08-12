import java.util.Scanner;

class Searching {
    public static void main(String[] args) {
        // array declaration
        int[] arr = new int[10];

        // inserting values to the array
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 7;
        arr[3] = 2;
        arr[4] = 8;
        arr[5] = 1;
        arr[6] = 3;
        arr[7] = 6;
        arr[8] = 12;
        arr[9] = 9;

        // printing original array elements
        System.out.println("Original array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // get the element to search
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // search for the element
        boolean found = false;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                index = i;
                break;
            }
        }

        // print the result
        if (found) {
            System.out.println("Element " + target + " found at index " + index + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        // close the scanner
        scanner.close();
    }
}
