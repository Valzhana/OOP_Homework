package seminar4;

import java.util.Random;

public abstract class BaseHero<W extends Weapon, S extends Shield> {
    private int health;
    private String name;
    protected W weapon;
    protected S shield;

    protected BaseHero(int health, String name, W weapon, S shield) {
        this.health = health;
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
    }
    public int damageFork() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

    public boolean hit(BaseHero recipient) {
        int damage = damageFork();
        return !recipient.reduceHealth(damage);

    }
    public boolean reduceHealth(int damages) {
        health -= (damages);
        return health + shield.protection() > 0;
    }

    public S getShield() {
        return shield;
    }

    public void setShield(S shield) {
        this.shield = shield;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return  "name is " + name + ", health = " +  health + ". " + weapon + shield;
    }
}
