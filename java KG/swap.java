import java.util.Scanner;

class swap {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("enter the value of b : ");
        int b = sc.nextInt();

        int temp = a;
        a=b;
        b= temp;

        System.out.println("value of a is :"+ a+" and value of b is "+ b);
    }
}
