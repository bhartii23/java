
import java.util.Scanner;

 class userinput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name :  ");
        String name = sc.nextLine();
        System.out.println("welcome " + name);

    }
}