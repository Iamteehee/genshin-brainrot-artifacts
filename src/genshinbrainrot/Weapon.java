package genshinbrainrot;

public class Weapon {
    private double attributeDmg = 0;
    private double attackPercent = 0;
    private double HPPercent = 0;
    private double critRate = 0;
    private double critDamage = 0;
    private double energyRecharge = 0;
    private double defPercent = 0;
    private int baseAttack = 0;
    private int elementalMastery = 0;

    public Weapon(double attributeDmg, double attackPercent, double HPPercent, double critRate, double critDamage, double energyRecharge, double defPercent, int baseAttack, int elementalMastery) {
        this.attributeDmg = attributeDmg;
        this.attackPercent = attackPercent;
        this.HPPercent = HPPercent;
        this.critRate = critRate;
        this.critDamage = critDamage;
        this.energyRecharge = energyRecharge;
        this.defPercent = defPercent;
        this.baseAttack = baseAttack;
        this.elementalMastery = elementalMastery;
        printWeaponInfo();
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

    public int getBaseAttack() {
        return baseAttack;
    }

    public int getElementalMastery() {
        return elementalMastery;
    }

    public void printWeaponInfo() {
        System.out.println("Your weapon's stats are as follows: ");
        System.out.println("Attribute dmg is " + getAttributeDmg());
        System.out.println("Attack percent is " + getAttackPercent());
        System.out.println("HP percent is " + getHPPercent());
        System.out.println("Crit rate is " + getCritRate());
        System.out.println("Crit damage is " + getCritDamage());
        System.out.println("Energy recharge is " + getEnergyRecharge());
        System.out.println("Defense percent is " + getDefPercent());
        System.out.println("Flat attack is " + getBaseAttack());
        System.out.println("Elemental mastery is " + getElementalMastery());
    }
}
