package seminar2;

public class Dog extends Predator implements Runable, Sayable {
    public Dog(String nickname) {
        super(nickname);
    }
    public String toString() {
        return "I'm Dog. " + super.toString() + " My speed is " + speedOfRun();
    }
    public String say() {
        return "Bowwow!";
    }
    public int speedOfRun() {
        return 20;
    }
}
