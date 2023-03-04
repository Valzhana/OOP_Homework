package seminar4;

public class Main {
    public static void main(String[] args) {
        Team<FootMan> squadF = new Team<>();
        squadF.add(new FootMan(55, "Joe", new Melee("spear", 15), new BucklerShield("IronBuckler", 45)));
        squadF.add(new FootMan(55, "Artur", new Melee("sword", 10), new BucklerShield("BandedBuckler", 55)));
        squadF.add(new FootMan(55, "Richard", new Melee("axe", 20), new BucklerShield("SilverBuckler", 35)));

        for (FootMan item: squadF) {
            System.out.println(item);
        }
        System.out.println("\n" + "SQUAD F");
        System.out.println("\n" + "TEAM HEALTH = " + squadF.getTeamHealth());
        System.out.println("MAX RANGE = " + squadF.getMaxRange());
        System.out.println("TOTAL DAMAGE = " + squadF.getSumDamage());
        System.out.println("MIN SHIELD = " + squadF.getMinShield());
        System.out.println("THE WEAKEST SCORE = " + squadF.getTheWeakest());
        System.out.println("THE WEAKEST WARRIOR -- " + squadF.getTheNameOfTheWeakest() + "\n" + "");

        Team<BaseHero> squadA = new Team<>();
        squadA.add(new Archer(15, "Fox", new Ranged("bow", 5, 50), new TowerShield("WoodTower", 15)));
        squadA.add(new Archer(15, "Glen", new Ranged("crossbow", 15, 25), new TowerShield("IronTower", 25)));
        squadA.add(new FootMan(55, "Alex", new Melee("sword", 10), new BucklerShield("CarapaceBuckler", 15)));
        squadA.add(new FootMan(55, "Tom", new Melee("axe", 20), new BucklerShield("BronzeBuckler", 20)));

        for (BaseHero item: squadA) {
            System.out.println(item);
        }
        System.out.println("\n" + "SQUAD A");
        System.out.println("\n" + "TEAM HEALTH = " + squadA.getTeamHealth());
        System.out.println("MAX RANGE = " + squadA.getMaxRange());
        System.out.println("TOTAL DAMAGE = " + squadA.getSumDamage());
        System.out.println("MIN SHIELD = " + squadA.getMinShield());
        System.out.println("THE WEAKEST SCORE = " + squadA.getTheWeakest());
        System.out.println("THE WEAKEST WARRIOR -- " + squadA.getTheNameOfTheWeakest() + "\n" + "");

        FootMan footMan1 = new FootMan(77, "Rob", new Melee("blade", 30), new BucklerShield("SerpentScale", 20));
        FootMan footMan2 = new FootMan(66, "Nik", new Melee("poleaxe", 45), new BucklerShield("BoneBuckler", 15));

        while (footMan1.getHealth() > 0 && footMan2.getHealth() > 0) {
            footMan1.hit(footMan2);
            System.out.println("____________________________________________________________________________________");
            System.out.println(footMan2);
            footMan2.hit(footMan1);
            System.out.println(footMan1);
        }
        System.out.println("________________________________________________________________________________________");
        if (footMan1.getHealth() > 0) {
            System.out.println(footMan1 + "\n" + footMan1.getName() + " is the winner!");
        } else {
            System.out.println(footMan2 + "\n" + footMan2.getName() + " is the winner!");
        }
    }
}
