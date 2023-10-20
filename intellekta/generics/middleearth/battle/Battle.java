package com.intellekta.generics.middleearth.battle;
import com.intellekta.generics.middleearth.race.*;


import java.util.Random;
public class Battle {
    private int round;

    public void fight() {
        Army<MiddleEarthUnit> middleEarthUnitArmy = null;
        Army<MordorUnit> mordorUnitArmy = null;
        Random random = new Random();
        int randomArmy = random.nextInt(10, 20);

        for (int i = 0; i < randomArmy; i++) {
            int randomUnit = random.nextInt(0, 2);
            if (randomUnit == 0) {
                middleEarthUnitArmy.recruit(new Elf(""));
                mordorUnitArmy.recruit(new Goblin(""));
            } else if (randomUnit == 1) {
                middleEarthUnitArmy.recruit(new WoodenElf(""));
                mordorUnitArmy.recruit(new UrukHai(""));
            } else {
                middleEarthUnitArmy.recruit(new Rohhirim(""));
                mordorUnitArmy.recruit(new Troll(""));
            }
        }
        int randomWizard = random.nextInt(0, 1);
        if (randomWizard == 0) {
            middleEarthUnitArmy.recruit(new Wizard(""));
        }
        System.out.println("Army of:" + middleEarthUnitArmy.getClass() + " consists of: ");
        for (Unit unit : middleEarthUnitArmy.getArmy()) {
            AbstractUnit abstractUnit = (AbstractUnit) unit;
            System.out.println(abstractUnit.toString() + " has power " + abstractUnit.getPower());
        }

        System.out.println("Army of:" + mordorUnitArmy.getClass() + " consists of: ");
        for (Unit unit : mordorUnitArmy.getArmy()) {
            AbstractUnit abstractUnit = (AbstractUnit) unit;
            System.out.println(abstractUnit.toString() + " has power " + abstractUnit.getPower());
        }

        figth(mordorUnitArmy, middleEarthUnitArmy);
    }

    public void figth(Army<MordorUnit> mordorUnitArmy, Army<MiddleEarthUnit> middleEarthUnit) {
        while (mordorUnitArmy.getArmy().size() > 0 || middleEarthUnit.getArmy().size() > 0) {
            System.out.println("Phase: " + round);
            round++;
            lastFigth(mordorUnitArmy, middleEarthUnit);
            if (true) {
                System.out.println("Army of:" + mordorUnitArmy.getClass() + "has wan the" + round + " the winner list ");
                for (Unit unit : mordorUnitArmy.getArmy()) {
                    AbstractUnit abstractUnit = (AbstractUnit) unit;
                    System.out.println(abstractUnit.toString() + " has power " + abstractUnit.getPower());
                }
            } else {
                System.out.println("Army of:" + middleEarthUnit.getClass() + "has wan the" + round + " the winner list ");
                for (Unit unit : middleEarthUnit.getArmy()) {
                    AbstractUnit abstractUnit = (AbstractUnit) unit;
                    System.out.println(abstractUnit.toString() + " has power " + abstractUnit.getPower());
                }
            }
        }
    }

    public Army<? extends Unit> lastFigth(Army<MordorUnit> mordorUnitArmy, Army<MiddleEarthUnit> middleEarthUnit) {
        Random random = new Random();
        // Первая фаза
        AbstractCavalryUnit mOC = (AbstractCavalryUnit) mordorUnitArmy.getCavalry()
                .get(random.nextInt(mordorUnitArmy.getCavalry().size()));

        AbstractUnit mIC = (AbstractUnit) middleEarthUnit.getCavalry()
                .get(random.nextInt(mordorUnitArmy.getCavalry().size()));

        int randomStrike = random.nextInt(0, 1);
        if (randomStrike == 0) {
            mOC.strike(mIC);
            if (mOC.isAlive()) {
                System.out.println(mordorUnitArmy.getClass() + "has power " + mOC.getPower() + "strike" +
                        middleEarthUnit.getClass() + " has power" + mIC.getPower() + " and kill him");
                mordorUnitArmy.release((MordorUnit) mOC);
            } else {
                System.out.println(mordorUnitArmy.getClass() + "has power " + mOC.getPower() + "strike" +
                        middleEarthUnit.getClass() + " has power" + mIC.getPower() + " and does not kill him");
                middleEarthUnit.release((MiddleEarthUnit) mIC);
            }
            if (!mOC.isAlive()) {
                System.out.println("Army of:" + middleEarthUnit.getClass() + "has wan the" + round + " the winner list ");
                for (Unit unit : middleEarthUnit.getArmy()) {
                    AbstractUnit abstractUnit = (AbstractUnit) unit;
                    System.out.println(abstractUnit.toString() + " has power " + abstractUnit.getPower());
                }
            } else {
                System.out.println("Army of:" + mordorUnitArmy.getClass() + "has wan the" + round + " the winner list ");
                for (Unit unit : mordorUnitArmy.getArmy()) {
                    AbstractUnit abstractUnit = (AbstractUnit) unit;
                    System.out.println(abstractUnit.toString() + " has power " + abstractUnit.getPower());
                }
            }
        }
        // Вторая фаза
        AbstractUnit mordorInf = (AbstractUnit) mordorUnitArmy.getInfantry()
                .get(random.nextInt(mordorUnitArmy.getInfantry().size()));

        AbstractUnit midlInf = (AbstractUnit) middleEarthUnit.getInfantry()
                .get(random.nextInt(middleEarthUnit.getInfantry().size()));

        if (randomStrike == 0) {
            mordorInf.strike(midlInf);
            if (mordorInf.isAlive()) {
                System.out.println(mordorUnitArmy.getClass() + "has power " + mordorInf.getPower() + "strike" +
                        middleEarthUnit.getClass() + " has power" + midlInf.getPower() + " and kill him");
                mordorUnitArmy.release((MordorUnit) mOC);
            } else {
                System.out.println(midlInf.getClass() + "has power " + midlInf.getPower() + "strike" +
                        mordorInf.getClass() + " has power" + mordorInf.getPower() + " and does not kill him");
                middleEarthUnit.release((MiddleEarthUnit) mIC);
            }
            if (midlInf.isAlive()) {
                System.out.println("Army of:" + middleEarthUnit.getClass() + "has wan the" + round + " the winner list ");
                for (Unit unit : middleEarthUnit.getArmy()) {
                    AbstractUnit abstractUnit = (AbstractUnit) unit;
                    System.out.println(abstractUnit.toString() + " has power " + abstractUnit.getPower());
                }
            } else {
                System.out.println("Army of:" + mordorUnitArmy.getClass() + "has wan the" + round + " the winner list ");
                for (Unit unit : mordorUnitArmy.getArmy()) {
                    AbstractUnit abstractUnit = (AbstractUnit) unit;
                    System.out.println(abstractUnit.toString() + " has power " + abstractUnit.getPower());
                }
            }
        }
        //завершить метод
        if (!mordorInf.isAlive() || midlInf.isAlive()) {
            return new Army<>();
        }

        // Третья фаза
        AbstractUnit midllArmy = (AbstractUnit) middleEarthUnit.getArmy()
                .get(random.nextInt(middleEarthUnit.getArmy().size()));

        AbstractUnit mordrArmy = (AbstractUnit) mordorUnitArmy.getArmy()
                .get(random.nextInt(mordorUnitArmy.getArmy().size()));

        if (randomStrike == 0) {
            midllArmy.strike(mordrArmy);
            if (midllArmy.isAlive()) {
                System.out.println("Army of:" + middleEarthUnit.getClass() + "has wan the" + round + " the winner list ");
                for (Unit unit : middleEarthUnit.getArmy()) {
                    AbstractUnit abstractUnit = (AbstractUnit) unit;
                    System.out.println(abstractUnit.toString() + " has power " + abstractUnit.getPower());
                }
            } else {
                System.out.println("Army of:" + mordorUnitArmy.getClass() + "has wan the" + round + " the winner list ");
                for (Unit unit : mordorUnitArmy.getArmy()) {
                    AbstractUnit abstractUnit = (AbstractUnit) unit;
                    System.out.println(abstractUnit.toString() + " has power " + abstractUnit.getPower());
                }
            }
        }
        return new Army<>();
    }
}


