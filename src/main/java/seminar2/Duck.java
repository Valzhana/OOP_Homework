package seminar2;

public class Duck extends Herbivores implements Runable, Flyable, Waterfowl, Sayable {
    public Duck(String nickname) {
        super(nickname);
    }

    @Override
    public String toString() {
        return "I'm Duck. " + super.toString() + " My speed is " + speedOfRun() + ", speed of flying is  " + speedOfFly() + ", swimming speed is " + swimmingSpeed();
    }

    @Override
    public int speedOfFly() {
        return 90;
    }

    @Override
    public int speedOfRun() {
        return 50;
    }

    @Override
    public String say() {
        return "Quack-quack!";
    }

    @Override
    public int swimmingSpeed() {
        return 95;
    }
}
