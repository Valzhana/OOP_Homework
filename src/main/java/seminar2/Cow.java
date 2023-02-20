package seminar2;

public class Cow extends Herbivores implements Runable, Sayable {
    public Cow(String nickname) {
        super(nickname);
    }
    public String toString() {
        return "I'm Cow. " + super.toString() + " My speed is " + speedOfRun();
    }

    @Override
    public String say() {
        return "Mu-mu!";
    }

    @Override
    public int speedOfRun() {
        return 75;
    }
}
