package seminar4;

public class Ranged implements Weapon{
    private String weaponName;
    private int damagePoint;
    private int range;

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getDamagePoint() {
        return damagePoint;
    }

    public void setDamagePoint(int damagePoint) {
        this.damagePoint = damagePoint;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public Ranged(String weaponName, int damagePoint, int range) {
        this.weaponName = weaponName;
        this.damagePoint = damagePoint;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Ranged weapon: " + weaponName + ", damagePoint = " + damagePoint + ". ";
    }

    @Override
    public int damage() {
        return damagePoint;
    }
}
