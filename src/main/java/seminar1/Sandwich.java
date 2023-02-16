package seminar1;

public class Sandwich extends Product {
    private String filling;
    public Sandwich(String name, Double price) {
        super(name,price);
    }

    public Sandwich(String name, Double price, String filling) {
        this(name, price);
        this.filling = filling;
    }

    @Override
    public String toString() {
        return String.format("%s; filling = %s", super.toString(), filling);
    }
}
