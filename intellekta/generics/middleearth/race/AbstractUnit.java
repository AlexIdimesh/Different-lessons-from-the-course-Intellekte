package com.intellekta.generics.middleearth.race;

import com.intellekta.generics.middleearth.battle.Unit;

import java.util.Random;

public abstract class AbstractUnit implements Unit {

   private String name;
    private int maxPower;
    private int minPower;
    private int power;

    public AbstractUnit(String name, int maxPower, int minPower) {
        this.name = (name == null) ? super.toString() : name;
        Random random = new Random();
        int randomPower = random.nextInt(minPower,maxPower);
        power = randomPower;
    }
    public boolean isAlive() {
        return power > 0;
    }

    public <T extends AbstractUnit> void strike(T unit) {
        unit.damage(this.getPower());

    }
    public void damage(int dam) {
        power -= dam;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "AbstractUnit{" +
                "name='" + name + '\'' +
                ", maxPower=" + maxPower +
                ", minPower=" + minPower +
                ", power=" + power +
                '}';
    }
}
