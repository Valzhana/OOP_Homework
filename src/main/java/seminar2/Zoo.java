package seminar2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Radio radio = new Radio();
    private List <Animal> animals = new ArrayList<>();
    public List<Animal> addAnimals(List<Animal> animals) {
        this.animals.addAll(animals);
        return this.animals;
    }
    public List<Animal> getAnimals() {
        return animals;
    }
    public List<Sayable> getSayable() {
        List<Sayable> result = new ArrayList<>();
        for(Animal item: animals) {
            if (item instanceof Sayable) {
                result.add((Sayable) item);
            }
        }
        return result;
    }
    public List<Runable> getRunable() {
        List<Runable> result = new ArrayList<>();
        for(Animal item: animals) {
            if (item instanceof Runable) {
                result.add((Runable) item);
            }
        }
        return result;
    }
    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for(Animal item: animals) {
            if (item instanceof Flyable) {
                result.add((Flyable) item);
            }
        }
        return result;
    }
    public List<Waterfowl> getWaterfowl() {
        List<Waterfowl> result = new ArrayList<>();
        for (Animal item: animals) {
            if (item instanceof Waterfowl) {
                result.add((Waterfowl) item);
            }
        }
        return result;
    }
    public Runable getWinner() {
        List<Runable> runningAnimals = getRunable();
        Runable winner = runningAnimals.get(0);
        for (Runable item: runningAnimals) {
            if (winner.speedOfRun() < item.speedOfRun()) {
                winner = item;
            }
        }
        return winner;
    }
    public Flyable getFlyWinner() {
        List<Flyable> flyingAnimals = getFlyable();
        Flyable winner = flyingAnimals.get(0);
        for (Flyable item: flyingAnimals) {
            if (winner.speedOfFly() < item.speedOfFly()) {
                winner = item;
            }
        }
        return winner;
    }
    public Waterfowl getSwimmingWinner() {
        List<Waterfowl> swimmingAnimals = getWaterfowl();
        Waterfowl winner = swimmingAnimals.get(0);
        for (Waterfowl item: swimmingAnimals) {
            if (winner.swimmingSpeed() < item.swimmingSpeed()) {
                winner = item;
            }
        }
        return winner;
    }
}
