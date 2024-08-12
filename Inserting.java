import java.util.Scanner;

class Inserting {
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
        
        // get the element to insert
        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();

        // get the index to insert the element at
        System.out.print("Enter the index to insert the element at (0 to " + (arr.length - 1) + "): ");
        int index = scanner.nextInt();

        // check for valid index
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid index. Please enter a value between 0 and " + (arr.length - 1));
        } else {
            // create a new array with size larger by one element
            int[] newArr = new int[arr.length + 1];

            // copy elements before the insertion point
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }

            // insert the new element
            newArr[index] = element;

            // copy the remaining elements
            for (int i = index; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }

            // printing new array elements
            System.out.println("New array elements:");
            for (int i = 0; i < newArr.length; i++) {
                System.out.println(newArr[i]);
            }
        }

        // close the scanner
        scanner.close();
    }
}
