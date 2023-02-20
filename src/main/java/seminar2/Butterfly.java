package seminar2;

public class Butterfly extends Herbivores implements Flyable {
    public Butterfly(String nickname) {
        super(nickname);
    }

    @Override
    public int speedOfFly() {
        return 8;
    }
    @Override
    public String toString() {
        return "I'm Butterfly. " + super.toString() + " My speed is " + speedOfFly();
    }
}
