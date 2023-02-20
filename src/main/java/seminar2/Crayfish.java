package seminar2;

public class Crayfish extends Predator implements Runable, Waterfowl{
    public Crayfish(String nickname) {
        super(nickname);
    }

    @Override
    public String toString() {
        return String.format("I'm Crayfish. %s My swimming speed is %d", super.toString(), swimmingSpeed());
    }

    @Override
    public int speedOfRun() {
        return 3;
    }

    @Override
    public int swimmingSpeed() {
        return 2;
    }
}
