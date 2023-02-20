package seminar2;

public class Dolphin extends Predator implements Waterfowl, Sayable {
    public Dolphin(String nickname) {
        super(nickname);
    }

    @Override
    public String toString() {
        return String.format("I'm Dolphin. %s My swimming speed is %d", super.toString(), swimmingSpeed() );
    }

    @Override
    public String say() {
        return "screech-screech!";
    }

    @Override
    public int swimmingSpeed() {
        return 40;
    }
}
