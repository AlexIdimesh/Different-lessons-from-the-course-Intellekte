package com.intellekta.generics.middleearth.race;

public class CavalryHuman extends AbstractCavalryUnit implements Human {
    public CavalryHuman(String name, int minPower, int maxPower) {
        super(name, minPower,maxPower);
        setBeast(this.new Horse());
    }
}
