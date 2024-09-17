
import java.util.Scanner;



public class array_is_sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the elements : ");
        int size = input.nextInt();
                
        int [] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter element number " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        boolean increasing = inincreasing(arr);
        boolean decreasing = indecreasing(arr); 

        if(increasing || decreasing)
        {
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }


    public static boolean inincreasing(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
        if(arr[i]<arr[i-1])
        {
            return false;
        }     
        }
        return true;
    }



    public static boolean indecreasing(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
        if(arr[i]>arr[i-1])
        {
            return false;
        }     
        }
        return true;
    }
}
