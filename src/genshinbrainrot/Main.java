package genshinbrainrot;

import java.util.Scanner;
import java.util.ArrayList;

class Main {
    static ArrayList<Hat> hats = new ArrayList<Hat>();
    static ArrayList<Cup> cups = new ArrayList<Cup>();
    static ArrayList<Sand> sands = new ArrayList<Sand>();
    static ArrayList<Plume> plumes = new ArrayList<Plume>();
    static ArrayList<Flower> flowers = new ArrayList<Flower>();
    static double attributeDmg;
    static double attackPercent;
    static double HPPercent;
    static double critRate;
    static double critDamage;
    static double energyRecharge;
    static double defPercent;
    static int flatAttack;
    static int flatDef;
    static int flatHP;
    static int elementalMastery;
    static int baseAttack;
    static double ampValue;
    static double totalOvrAtk;
    static int bestHatIndex, bestCupIndex, bestSandIndex, bestPlumeIndex, bestFlowerIndex = 0;
    static Scanner keyboard = new Scanner(System.in);

    public static void sumStats(GenshinCharacter Charac, Weapon W, Hat H, Cup C, Sand S, Plume P, Flower F) {
        double totalAttack;
        int totalBaseAttack = Charac.getBaseAttack() + W.getBaseAttack();
        double totalHP = Charac.getBaseHP() * (1 + 0.01 * (H.getHPPercent() + W.getHPPercent() + C.getHPPercent() + S.getHPPercent() + P.getHPPercent() + F.getHPPercent())) + (H.getFlatHP() + C.getFlatHP() + S.getFlatHP() + P.getFlatHP() + F.getFlatHP());
        double totalDef = Charac.getBaseHP() * (1 + 0.01 * (H.getDefPercent() + W.getDefPercent() + C.getDefPercent() + S.getDefPercent() + P.getDefPercent() + F.getDefPercent())) + (H.getFlatDef() + C.getFlatDef() + S.getFlatDef() + P.getFlatDef() + F.getFlatDef());
        if (Charac.getName().equals("hutao")) {
            totalAttack = totalBaseAttack * (1 + 0.01 * (H.getAttackPercent() + W.getAttackPercent() + C.getAttackPercent() + S.getAttackPercent() + P.getAttackPercent() + F.getAttackPercent())) + (H.getFlatAttack() + C.getFlatAttack() + S.getFlatAttack() + P.getFlatAttack() + F.getFlatAttack() + totalHP * 0.0626);
        } else {
            totalAttack = totalBaseAttack * (1 + 0.01 * (H.getAttackPercent() + W.getAttackPercent() + C.getAttackPercent() + S.getAttackPercent() + P.getAttackPercent() + F.getAttackPercent())) + (H.getFlatAttack() + C.getFlatAttack() + S.getFlatAttack() + P.getFlatAttack() + F.getFlatAttack());
        }
        int totalEM = Charac.getElementalMastery() + H.getElementalMastery() + W.getElementalMastery() + C.getElementalMastery() + P.getElementalMastery() + F.getElementalMastery() + P.getElementalMastery();
        double totalER = 1 + 0.01 * (Charac.getEnergyRecharge() + H.getEnergyRecharge() + W.getEnergyRecharge() + C.getEnergyRecharge() + P.getEnergyRecharge() + S.getEnergyRecharge() + F.getEnergyRecharge());
        double totalCR = 0.01 * (Charac.getCritRate() + H.getCritRate() + W.getCritRate() + C.getCritRate() + P.getCritRate() + S.getCritRate() + F.getCritRate());
        double totalCD = 0.01 * (Charac.getCritDamage() + H.getCritDamage() + W.getCritDamage() + C.getCritDamage() + P.getCritDamage() + S.getCritDamage() + F.getCritDamage());
        double totalAttDmg = 0.01 * (Charac.getAttributeDmg() + H.getAttributeDmg() + W.getAttributeDmg() + C.getAttributeDmg() + P.getAttributeDmg() + S.getAttributeDmg() + F.getAttributeDmg());
        if (ampValue == 1) {
            totalOvrAtk = totalAttack * (totalCR * (1 + totalCD) + (1 - totalCR)) * (1 + totalAttDmg);
        } else {
            totalOvrAtk = totalAttack * (totalCR * (1 + totalCD) + (1 - totalCR)) * (1 + totalAttDmg) * (1 + (2.78 * totalEM) / (totalEM + 1400));
        }
    }

    public static void enterStats(String artifactName) {
        System.out.println("Enter the stats of your " + artifactName);
        System.out.println("Enter attribute damage as a decimal");
        attributeDmg = keyboard.nextDouble();
        System.out.println("Enter attack percent as a decimal");
        attackPercent = keyboard.nextDouble();
        System.out.println("Enter HP percent as a decimal");
        HPPercent = keyboard.nextDouble();
        System.out.println("Enter crit rate as a decimal");
        critRate = keyboard.nextDouble();
        System.out.println("Enter crit damage as a decimal");
        critDamage = keyboard.nextDouble();
        System.out.println("Enter energy recharge as a decimal");
        energyRecharge = keyboard.nextDouble();
        System.out.println("Enter defense percent as a decimal");
        defPercent = keyboard.nextDouble();
        if (!artifactName.equals("weapon")) {
            System.out.println("Enter flat attack");
            flatAttack = keyboard.nextInt();
            System.out.println("Enter flat def");
            flatDef = keyboard.nextInt();
            System.out.println("Enter flat hp");
            flatHP = keyboard.nextInt();
        } else {
            System.out.println("Enter base attack");
            baseAttack = keyboard.nextInt();
        }
        System.out.println("Enter elemental mastery");
        elementalMastery = keyboard.nextInt();
    }

    public static void main(String[] args) {
        int enterMore = 0;


        System.out.println("What character are you looking to build");
        String name = keyboard.nextLine();

        System.out.println("Will they be utilizing amplifying reactions? Respond with 1 for no, 1.5 for reverse melt or reverse vape, or 2 for melt or vape");
        double ampValue = keyboard.nextDouble();

        GenshinCharacter Charac = new GenshinCharacter(name);

        enterStats("weapon");
        Weapon W = new Weapon(attributeDmg, attackPercent, HPPercent, critRate, critDamage, energyRecharge, defPercent, baseAttack, elementalMastery);

        while (enterMore == 0) {
            System.out.println("Enter the type of artifact you're entering (cup,plume,flower,hat,sand). If you're done, enter done");
            String userInput = keyboard.nextLine();
            switch (userInput) {
                case "flower":
                    enterStats("flower");
                    flowers.add(new Flower(attributeDmg, attackPercent, HPPercent, critRate, critDamage, energyRecharge, defPercent, flatAttack, flatHP, elementalMastery, flatDef));
                    break;
                case "plume":
                    enterStats("plume");
                    plumes.add(new Plume(attributeDmg, attackPercent, HPPercent, critRate, critDamage, energyRecharge, defPercent, flatAttack, flatHP, elementalMastery, flatDef));
                    break;
                case "sand":
                    enterStats("sand");
                    sands.add(new Sand(attributeDmg, attackPercent, HPPercent, critRate, critDamage, energyRecharge, defPercent, flatAttack, flatHP, elementalMastery, flatDef));
                    break;
                case "cup":
                    enterStats("cup");
                    cups.add(new Cup(attributeDmg, attackPercent, HPPercent, critRate, critDamage, energyRecharge, defPercent, flatAttack, flatHP, elementalMastery, flatDef));
                    break;
                case "hat":
                    enterStats("hat");
                    hats.add(new Hat(attributeDmg, attackPercent, HPPercent, critRate, critDamage, energyRecharge, defPercent, flatAttack, flatHP, elementalMastery, flatDef));
                    break;
                case "done":
                    enterMore = 1;
                    break;
            }
        }
//        sumStats(Charac, W, hats.get(0), cups.get(0), sands.get(0), plumes.get(0), flowers.get(0));
//        System.out.print("sum of stats is " + totalOvrAtk);
        double totalOvrAtkPlaceholder = 0;
        for (int hatIndex = 0; hatIndex < hats.size(); hatIndex++) {
            for (int cupIndex = 0; cupIndex < cups.size(); cupIndex++) {
                for (int sandIndex = 0; sandIndex < sands.size(); sandIndex++) {
                    for (int plumeIndex = 0; plumeIndex < plumes.size(); plumeIndex++) {
                        for (int flowerIndex = 0; flowerIndex < flowers.size(); flowerIndex++) {
                            sumStats(Charac, W, hats.get(hatIndex), cups.get(cupIndex), sands.get(sandIndex), plumes.get(plumeIndex), flowers.get(flowerIndex));
                            if(totalOvrAtk > totalOvrAtkPlaceholder){
                                totalOvrAtkPlaceholder = totalOvrAtk;
                                bestCupIndex = cupIndex;
                                bestHatIndex = hatIndex;
                                bestFlowerIndex = flowerIndex;
                                bestPlumeIndex = plumeIndex;
                                bestSandIndex = sandIndex;
                            }
                        }
                    }
                }
            }
        }
        System.out.print("The sum of your stats is: " + totalOvrAtk +"Best set of artifacts is: ");
        System.out.println();
        hats.get(bestHatIndex).printHatInfo();
        System.out.println();
        cups.get(bestCupIndex).printCupInfo();
        System.out.println();
        flowers.get(bestFlowerIndex).printFlowerInfo();
        System.out.println();
        plumes.get(bestPlumeIndex).printPlumeInfo();
        System.out.println();
        sands.get(bestSandIndex).printSandInfo();
    }
}

