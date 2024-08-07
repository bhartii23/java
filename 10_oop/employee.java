 class employee1 {
    int salary;
    String name;

    public int getSalary()
    {
        return salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name=n;
    }
}

public class employee{
    public static void main(String[] args) {
        
        employee1 e1 =new employee1();
        e1.setName("bharati");
        e1.salary = 123908;
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}
