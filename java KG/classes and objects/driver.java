
class car {
    int noOfWheels;
    String color;
    float maxspeed;
    float currentfuel;
    int noofSeats;

    public void drive()
    {
        if(currentfuel == 0)
        {
            System.out.println("car is out of fuel");
        }else if(currentfuel < 5)
        {
            System.out.println("car is in reserved mode,please refuel");
            currentfuel--;
        }
        else 
       {
        System.out.println("car is driving");
        currentfuel--;
       }
    }
    public void addfuel(float fuel)
    {
        currentfuel+=fuel;
    }

    public float getcurrentfuellevel()
    {
        return currentfuel;
    }
}
public class driver
{
    public static void main(String[] args) {
        car c = new car();
        c.addfuel(6);
        c.drive();
        System.out.println(c.getcurrentfuellevel());

    }
}
