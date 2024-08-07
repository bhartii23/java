// package 9_recursion;

public class factoraial {
  
    static int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }

    public static void main(String[] args) {
        int x=4;
        System.out.println("the value of n is "+ fact(x));
    }
}
