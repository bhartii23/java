import java.util.Scanner;

public class max_min_array {
    public static void main(String[] args) {
        System.out.println("Welcome to Max and Min: ");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int size = input.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element number " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        int max = max(arr);
        int min = min(arr);

        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) { 
                min = arr[i];
            }
        }
        return min;
    }
}
