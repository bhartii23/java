// Playable interface
interface Playable {
    void play(); // Method to be implemented by the classes
}

// Football class
class Football implements Playable {
    public void play() {
        System.out.println("Playing Football.");
    }
}

// Volleyball class
class Volleyball implements Playable {
    public void play() {
        System.out.println("Playing Volleyball.");
    }
}

// Basketball class
class Basketball implements Playable {
    public void play() {
        System.out.println("Playing Basketball.");
    }
}

// Main class
public class PlayableDemo {
    public static void main(String[] args) {
        // Creating objects of each class
        Football football = new Football();
        Volleyball volleyball = new Volleyball();
        Basketball basketball = new Basketball();

        // Calling the play method on each object
        football.play();
        volleyball.play();
        basketball.play();
    }
}
