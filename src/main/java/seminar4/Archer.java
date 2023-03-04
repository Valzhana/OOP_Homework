package seminar4;

public class Archer extends BaseHero<Ranged, TowerShield>{
    public Archer(int health, String name, Ranged ranged, TowerShield shield) {
        super(health, name, ranged, shield);
    }
    public int range() {
        return weapon.getRange();
    }

    @Override
    public String toString() {
        return "Archer, " + super.toString();
    }
}
