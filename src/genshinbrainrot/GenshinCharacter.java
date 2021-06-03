package genshinbrainrot;

public class GenshinCharacter {
    private String name;
    private int baseAttack = 0;
    private int baseHP = 0;
    private int elementalMastery = 0;
    private int baseDef = 0;
    private double attributeDmg = 0;
    private double attackPercent = 0;
    private double critRate = 5;
    private double critDamage = 50;
    private double energyRecharge = 0;
    private double damageMod = 0;
    private double defPercent = 0;

    public GenshinCharacter(String name) {
        this.name = name;
        determineStats(name);
        System.out.println(name + "\nBase attack is " + baseAttack + "\nBase HP is " + baseHP + "\nCrit rate is " + critRate + "\nCrit damage is " + critDamage + "\nAttribute damage is " + attributeDmg + "\nAttack percent is " + attackPercent + "\nEnergy recharge is " + energyRecharge + "\nElemental mastery is " + elementalMastery + "\n" + damageMod + "\n" + baseDef + "\n" + defPercent);
    }

    private void determineStats(String name) {
        String changeName = name.toLowerCase();
        switch (changeName) {
            case "amber":
                baseAttack = 223;
                critRate = 5;
                critDamage = 50;
                attackPercent = 39;
                break;
            case "barbara":
                baseAttack = 159;
                critRate = 5;
                critDamage = 50;
                attributeDmg = 15;
                break;
            case "beidou":
                baseAttack = 225;
                critRate = 5;
                critDamage = 50;
                attributeDmg = 24;
                break;
            case "bennett":
                baseAttack = 191;
                critRate = 5;
                critDamage = 50;
                break;
            case "chongyun":
                baseAttack = 223;
                critRate = 5;
                critDamage = 50;
                attackPercent = 24;
                break;
            case "diluc":
                baseAttack = 335;
                critRate = 24.2;
                critDamage = 50;
                attributeDmg = 20;
                break;
            case "fischl":
                baseAttack = 244;
                critRate = 5;
                critDamage = 50;
                attackPercent = 24;
                break;
            case "jean":
                baseAttack = 239;
                critRate = 5;
                critDamage = 50;
                break;
            case "kaeya":
                baseAttack = 223;
                critRate = 5;
                critDamage = 50;
                energyRecharge = 26.7;
                break;
            case "keqing":
                baseAttack = 323;
                critRate = 2;
                critDamage = 88.4;
                break;
            case "klee":
                baseAttack = 311;
                critRate = 5;
                critDamage = 50;
                attributeDmg = 28.8;
                break;
            case "lisa":
                baseAttack = 232;
                critRate = 5;
                critDamage = 50;
                elementalMastery = 96;
                break;
            case "mona":
                baseAttack = 287;
                critRate = 5;
                critDamage = 50;
                energyRecharge = 32;
                break;
            case "ningguang":
                baseAttack = 212;
                critRate = 5;
                critDamage = 50;
                attributeDmg = 36;
                break;
            case "noelle":
                baseAttack = 191;
                critRate = 5;
                critDamage = 50;
                defPercent = 30;
                baseDef = 799;
                break;
            case "qiqi":
                baseAttack = 287;
                critRate = 5;
                critDamage = 50;
                break;
            case "razor":
                baseAttack = 234;
                critRate = 5;
                critDamage = 50;
                attributeDmg = 30;
                break;
            case "sucrose":
                baseAttack = 170;
                critRate = 5;
                critDamage = 50;
                attributeDmg = 24;
                break;
            case "traveler":
                baseAttack = 212;
                critRate = 5;
                critDamage = 50;
                attackPercent = 24;
                break;
            case "venti":
                baseAttack = 263;
                critRate = 5;
                critDamage = 50;
                energyRecharge = 32;
                break;
            case "xiangling":
                baseAttack = 225;
                critRate = 5;
                critDamage = 50;
                elementalMastery = 96;
                break;
            case "hutao":
                baseAttack = 106;
                baseHP = 15552;
                critDamage = 88.4;
                attributeDmg = 33;
                break;
            case "xiao":
                baseAttack = 349;
                critDamage = 50;
                critRate = 24.2;
                attributeDmg = 110.2;
        }
    }

    public double getAttributeDmg() {
        return damageMod;
    }

    public double getAttackPercent() {
        return attackPercent;
    }

    public String getName() {
        return name;
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

    public int getBaseHP() {
        return baseHP;
    }
}