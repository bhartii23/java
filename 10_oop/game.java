class tommyvercitte
{
    public void hit()
    {
        System.out.println("hitting the enemy");
    }

    public void run()
    {
        System.out.println("running");
    }

    public void fire()
    {
        System.out.println("firing");
    }
}

public class game
{
    public static void main(String[] args) {
        tommyvercitte player1 = new tommyvercitte();

        player1.fire();
        player1.run();
        player1.hit();
    }
}