package seminar2;

public class Cat extends Predator implements Runable, Sayable {
    public Cat(String nickname) {
        super(nickname);
    }
    public String toString() {
        return "I'm Cat. " + super.toString() + " My speed is " + speedOfRun();
    }
    @Override
    public String say() {
        return "Meow!";
    }

    @Override
    public int speedOfRun() {
        return 15;
    }
}
