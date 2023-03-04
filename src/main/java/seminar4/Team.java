package seminar4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <T extends BaseHero> implements Iterable<T> {
    List<T> dreamTeam = new ArrayList<>();
    public void add(T t) {
        dreamTeam.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return dreamTeam.iterator();
    }
    public int getTeamHealth() {
        int teamHealth = 0;
        for (T hero: dreamTeam) {
            teamHealth += hero.getHealth();
        }
        return teamHealth;
    }
    public int getMaxRange() {
        int maxRange = 0;
        for (T hero: dreamTeam) {
            if (hero instanceof Archer) {
                Archer archer = (Archer) hero;
                if (maxRange < archer.range()) {
                    maxRange = archer.range();
                }
            }
        }
        return maxRange;
    }
    public int getSumDamage() {
        int sumDamage = 0;
        for (T hero: dreamTeam) {
            sumDamage += hero.getWeapon().damage();
        }
        return sumDamage;
    }
    public int getMinShield() {
        int minShield = dreamTeam.get(0).getShield().protection();
        for (T hero: dreamTeam) {
            if (hero.getShield().protection() < minShield) {
                minShield = hero.getShield().protection();
            }
        }
        return minShield;
    }
    public int getTheWeakest() {
        int theWeakest = dreamTeam.get(0).getShield().protection() + dreamTeam.get(0).getWeapon().damage();
        for (T hero: dreamTeam) {
            if (hero.getShield().protection() + hero.getWeapon().damage() < theWeakest) {
                theWeakest = hero.getShield().protection() + hero.getWeapon().damage();
            }
        }
        return theWeakest;
    }
    public String getTheNameOfTheWeakest() {
        String result = "";
        for (T hero: dreamTeam) {
            if (hero.getShield().protection() + hero.getWeapon().damage() == getTheWeakest()) {
                result = hero.toString();
            }
        }
        return result;
    }
}
