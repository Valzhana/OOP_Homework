package seminar1;

public class Dairy extends Product {
    private Integer term;
    public Dairy(String name, Double price, Integer term) {
        super(name, price);
        this.term = term;
    }

    @Override
    public String toString() {
        return String.format("%s; term = %d", super.toString(), term);
    }
}
