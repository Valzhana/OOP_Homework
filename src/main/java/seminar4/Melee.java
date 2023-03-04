package seminar4;

public class Melee implements Weapon {
    private String weaponName;
    private int damagePoint;

    public Melee(String weaponName, int damagePoint) {
        this.weaponName = weaponName;
        this.damagePoint = damagePoint;
    }

    @Override
    public String toString() {
        return "Melee weapon: " + weaponName + ", damagePoint = " + damagePoint + ". ";
    }
    @Override
    public int damage() {
        return damagePoint;
    }
}
