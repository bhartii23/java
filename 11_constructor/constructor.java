// package 11_constructor;

class mainemployee
{
    private int id;
    private String name;

    public mainemployee()
    {
        id = 45;
        name = "your-name-here";
    }

    public String getname()
    {
        return name;
    }

    public void setname(String n)
    {
        name = n;
    }
    public void setid(int i)
    {
        id = i;
    }
    public int getid()
    {
        return id;
    }
}
public class constructor {
    public static void main(String[] args) {
        
        mainemployee e = new mainemployee();
        System.out.println(e.getid());
        System.out.println(e.getname());
    }
}
