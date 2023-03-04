package seminar4;

public class TowerShield implements Shield {
    String shieldName;
    private int damageResistance;

    public String getShieldName() {
        return shieldName;
    }

    public void setShieldName(String shieldName) {
        this.shieldName = shieldName;
    }

    public int getDamageResistance() {
        return damageResistance;
    }

    public void setDamageResistance(int damageResistance) {
        this.damageResistance = damageResistance;
    }

    public TowerShield(String shieldName, int damageResistance) {
        this.shieldName = shieldName;
        this.damageResistance = damageResistance;
    }
    public int protection() {
        return damageResistance;
    }

    @Override
    public String toString() {
        return "TowerShield: " + shieldName + ", damageResistance = " + damageResistance + ".";
    }
}
