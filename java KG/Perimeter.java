
import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the 4 sides : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double Perimeter = a+b+c+d;
        System.out.println("perimeter of rectangle is : "+ Perimeter + "cm");
    }
}
