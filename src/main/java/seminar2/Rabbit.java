package seminar2;

public class Rabbit extends Herbivores implements Runable, Sayable {
    public Rabbit(String nickname) {
        super(nickname);
    }
    public String toString() {
        return "I'm Rabbit. " + super.toString() + " My speed is " + speedOfRun();
    }

    @Override
    public String say() {
        return "Pff!";
    }

    @Override
    public int speedOfRun() {
        return 45;
    }
}
