package seminar1;

public class Main {
    public static void main(String[] args) {
        WendingMachine store = new WendingMachine();
        store.addProduct(new Product("Lays", 124.25))
                .addProduct(new Product("Fanta", 150.00))
                .addProduct(new Product("Orbit", 95.70))
                .addProduct(new Product("Cola", 120.45))
                .addProduct(new Dairy("Milk", 105.68, 70))
                .addProduct(new Beer("Nonalcoholic Bud", 85.69))
                .addProduct(new Beer("Bud", 80.69, 4))
                .addProduct(new Sandwich("Cheese sandwich", 230.55, "cheese"))
                .addProduct(new Sandwich("Salmon sandwich", 370.28, "salmon"))
                .addProduct(new Chocolate("Alpen Gold", 110.00, 80));
        for (Product prod: store.getProducts()) {
            System.out.println(prod);
        }

        System.out.println("Searching for product");
        Product result = store.findProduct("Lays");
        System.out.println(result);

        System.out.println("buying Lays");
        store.buy("Lays", 124.25);
        System.out.println(store);

        System.out.println("buying Orbit");
        store.buy("Orbit", 95.70);
        System.out.println(store);

        System.out.println("buying Fanta");
        store.buy("Fanta", 150.00);
        System.out.println(store);

        System.out.println("buying 'Alpen Gold'");
        store.buy("Alpen Gold", 110.00);
        System.out.println(store);
    }
}
