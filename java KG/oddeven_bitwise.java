
import java.util.Scanner;

public class oddeven_bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = input.nextInt();

        if((num & 1)==1)
        {
            System.out.println("number is odd");
        }
        else{
            System.out.println("number is  even");
        }
    }
}
