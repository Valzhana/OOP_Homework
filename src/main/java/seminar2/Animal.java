package seminar2;

public abstract class Animal {
    public String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }
    public abstract String feed();
    @Override
    public String toString() {
        return String.format("My nickname is %s.", nickname);
    }
}
