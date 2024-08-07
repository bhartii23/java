// package 5_conditional_stat;

public class ternary {
    public static void main(String[] args) {
        int n=4;
        int result;

        // if(n%2==0)
        //     result=10;
        // else
        //     result=20;

        // to use ternary operator we use ?:
        result = n%2==0 ? 10 :20;

        System.out.println(result);
    }
}
