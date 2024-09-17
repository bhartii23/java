
import java.util.Scanner;

public class compound_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the principle amount : ");
        int principle = input.nextInt();
        System.out.println("enter the rate : ");
        float rate = input.nextFloat();
        System.out.println("enter the number of years : ");
        float year = input.nextFloat();

        double compoundInt= principle*Math.pow((1+rate/100),year);
        System.out.println("compound interest is : "+ compoundInt);

    }
}
