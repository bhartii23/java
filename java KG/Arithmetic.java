
import java.util.Scanner;

 class Arithmetic {
    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       System.out.println("enter the 1st number:");
       int a = input.nextInt();
       System.out.println("enter the 2nd number:");
       int b = input.nextInt();
       System.out.println(a+b);
       System.out.println(a-b); 
       System.out.println(a*b);
       System.out.println(a/b);
       System.out.println(a%b);
    }
}
