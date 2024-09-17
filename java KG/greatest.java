
import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the 1st number:");
        int a = input.nextInt();
        System.out.print("enter the 2nd number:");
        int b = input.nextInt();
        System.out.print("enter the 3rd number:");
        int c = input.nextInt();


        if(a>=b && a >= c)
        {
            System.out.println(a+" number is greater");
        }
        else if(b >= c)
        {
            System.out.println(b+" number is gretest");
        }
        else
        {
            System.out.println(c + "  number is gretest");
        }
    }
}
