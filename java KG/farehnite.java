
import java.util.Scanner;

public class farehnite {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter your temp in F: ");
        float fah = input.nextFloat();
        float cel = (fah - 32 )* 5/9;
        System.out.println("temperature in celcius : "+ cel);

    }
}
