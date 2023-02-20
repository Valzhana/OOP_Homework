package seminar2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo ourZoo = new Zoo();
        ourZoo.addAnimals(List.of(new Cat("Barsik"), new Dog("Sharik"), new Rabbit("Belyak"), new Cow("Romashka"), new Duck("Marusya"), new Butterfly("Lily"), new Dolphin("Flipper"), new Crayfish("Sebastian")));

        for (Sayable item : ourZoo.getSayable()) {
            System.out.println(item.say());
        }
        System.out.println("__________________________________________");
        for (Runable item : ourZoo.getRunable()) {
            System.out.println(item);
        }
        System.out.println("__________________________________________");
        for (Flyable item : ourZoo.getFlyable()) {
            System.out.println(item);
        }
        System.out.println("__________________________________________");
        for (Waterfowl item : ourZoo.getWaterfowl()) {
            System.out.println(item);
        }
        System.out.println("Running champion!_________________________");
        System.out.println(ourZoo.getWinner());
        System.out.println("Flying champion!__________________________");
        System.out.println(ourZoo.getFlyWinner());
        System.out.println("Swimming champion!________________________");
        System.out.println(ourZoo.getSwimmingWinner());
    }
}
