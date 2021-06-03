package genshinbrainrot;

public class Flower {
    private double attributeDmg = 0;
    private double attackPercent = 0;
    private double HPPercent = 0;
    private double critRate = 0;
    private double critDamage = 0;
    private double energyRecharge = 0;
    private double defPercent = 0;
    private int flatAttack = 0;
    private int flatHP = 0;
    private int elementalMastery = 0;
    private int flatDef = 0;

    public Flower(double attributeDmg, double attackPercent, double HPPercent, double critRate, double critDamage, double energyRecharge, double defPercent, int flatAttack, int flatHP, int elementalMastery, int flatDef) {
        this.attributeDmg = attributeDmg;
        this.attackPercent = attackPercent;
        this.HPPercent = HPPercent;
        this.critRate = critRate;
        this.critDamage = critDamage;
        this.energyRecharge = energyRecharge;
        this.defPercent = defPercent;
        this.flatAttack = flatAttack;
        this.flatHP = flatHP;
        this.elementalMastery = elementalMastery;
        this.flatDef = flatDef;
        printFlowerInfo();
    }

    public double getAttributeDmg() {
        return attributeDmg;
    }

    public double getAttackPercent() {
        return attackPercent;
    }

    public double getHPPercent() {
        return HPPercent;
    }

    public double getCritRate() {
        return critRate;
    }

    public double getCritDamage() {
        return critDamage;
    }

    public double getEnergyRecharge() {
        return energyRecharge;
    }

    public double getDefPercent() {
        return defPercent;
    }

    public int getFlatAttack() {
        return flatAttack;
    }

    public int getFlatHP() {
        return flatHP;
    }

    public int getElementalMastery() {
        return elementalMastery;
    }

    public int getFlatDef() {
        return flatDef;
    }

    public void printFlowerInfo() {
        System.out.println("Your flower's stats are as follows: ");
        System.out.println("Attribute dmg is " + getAttributeDmg());
        System.out.println("Attack percent is " + getAttackPercent());
        System.out.println("HP percent is " + getHPPercent());
        System.out.println("Crit rate is " + getCritRate());
        System.out.println("Crit damage is " + getCritDamage());
        System.out.println("Energy recharge is " + getEnergyRecharge());
        System.out.println("Defense percent is " + getDefPercent());
        System.out.println("Flat attack is " + getFlatAttack());
        System.out.println("Flat HP is " + getFlatHP());
        System.out.println("Flat defense is " + getFlatDef());
        System.out.println("Elemental mastery is " + getElementalMastery());
    }
}
