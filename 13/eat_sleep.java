// Abstract class Person
abstract class Person {
    public abstract void eat();
    public abstract void sleep();
    public abstract void exercise();
}

// Athlete class
class Athlete extends Person {
    public void eat() {
        System.out.println("Athlete eats healthy food.");
    }
    public void sleep() {
        System.out.println("Athlete sleeps 8 hours.");
    }
    public void exercise() {
        System.out.println("Athlete exercises daily.");
    }
}

// LazyPerson class
class LazyPerson extends Person {
    public void eat() {
        System.out.println("Lazy person eats junk food.");
    }
    public void sleep() {
        System.out.println("Lazy person sleeps 12 hours.");
    }
    public void exercise() {
        System.out.println("Lazy person does no exercise.");
    }
}

// Main class
public class eat_sleep {
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazyPerson = new LazyPerson();

        // Calling methods for Athlete
        System.out.println("Athlete:");
        athlete.eat();
        athlete.sleep();
        athlete.exercise();

        // Calling methods for LazyPerson
        System.out.println("\nLazyPerson:");
        lazyPerson.eat();
        lazyPerson.sleep();
        lazyPerson.exercise();
    }
}
