package seminar4;

public class FootMan extends BaseHero<Melee, BucklerShield>{
    public FootMan(int health, String name, Melee weapon, BucklerShield shield) {
        super(health, name, weapon, shield);
    }

    @Override
    public String toString() {
        return "FootMan, " + super.toString();
    }
}
