
import java.util.Scanner;

// create a program to find number of occurence of an element in an arrayp


public class number_occurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to array occurence");
        System.out.println("enter the number of elements:");
        int size = input.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.print("enter element number: " + (i+1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.println("enter the number you want to find :");
        int num = input.nextInt();

        int occurences = no_of_occurence(arr, num);

        System.out.println("your number was found "+occurences+" times in the array");
    }

    public static int no_of_occurence(int[] arr,int num )
    {
        int i=0;
        int occ=0;
        while(i<arr.length){
            if(arr[i]==num)
            {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
