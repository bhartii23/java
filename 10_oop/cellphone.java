
// import java.nio.file.OpenOption;

class info
{
    public void ringing()
    {
        System.out.println("ringing...");

    }
    public void vibrate()
    {
        System.out.println("vibrating...");
    }
    public void callfriend()
    {
        System.out.println("calling sakshi...");
    }
}

public class cellphone {
    public static void main(String[] args) {

        info oppo = new info();

        oppo.ringing();
        oppo.vibrate();
        oppo.callfriend(); 
    }

}
