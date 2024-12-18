// Flyable interface
interface Flyable {
    void fly_obj(); // Method to be implemented
}

// Spacecraft class
class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft is flying in space.");
    }
}

// Airplane class
class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane is flying in the sky.");
    }
}

// Helicopter class
class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Helicopter is hovering in the air.");
    }
}

// Main class
public class FlyableDemo {
    public static void main(String[] args) {
        Spacecraft spacecraft = new Spacecraft();
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();

        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}

