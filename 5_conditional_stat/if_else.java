// package conditional_stat;
public class if_else {
    public static void main(String[] args)
    {
        int x=10;
        int y=2;
        int z=4;
        if( x>y && x>z)
            System.out.println(x);
        else if(y>x && y>z)
            System.out.println(y);
        else
            System.out.println(z);
    }
}
