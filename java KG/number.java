
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number:");
        int num = input.nextInt();

        if(num>0)
        {
            System.out.println("your number is positive !");
        }
        else if(num == 0)
        {
            System.out.println("your number is equal to zero");
        }
        else
        {
            System.out.println("your number is negative.");
        }
    }
}
