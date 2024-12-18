import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] arr = new int[n];

        // Take user input for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Take user input for the element to remove
        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        // Display the original array
        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Count the size of the new array
        int newSize = 0;
        for (int num : arr) {
            if (num != elementToRemove) {
                newSize++;
            }
        }

        // // Create a new array without the element to remove
        int[] newArr = new int[newSize];
        int index = 0;
        for (int num : arr) {
            if (num != elementToRemove) {
                newArr[index++] = num;
            }
        }

        // Display the updated array
        System.out.print("Array after removing element " + elementToRemove + ": ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        
    }
}
