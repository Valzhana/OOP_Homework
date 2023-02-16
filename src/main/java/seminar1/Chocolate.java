package seminar1;

public class Chocolate extends Product {
    private Integer weight = 0;
    public Chocolate(String name, Double price) {
        super(name, price);
    }
    public Chocolate(String name, Double price, Integer weight) {
        this(name, price);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%s; weight = %d", super.toString(), weight);
    }
}
