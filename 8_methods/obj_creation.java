// package 8_methods;

public class obj_creation {
    
     int logic(int x,int y)
    {
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        obj_creation obj = new obj_creation();
        c =obj.logic(a,b);
        System.out.println(c);
    }
}
