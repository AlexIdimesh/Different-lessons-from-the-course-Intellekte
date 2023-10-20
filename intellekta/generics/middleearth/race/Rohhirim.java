package com.intellekta.generics.middleearth.race;



public class Rohhirim extends AbstractCavalryUnit implements Human {
    public Rohhirim(String name) {
        super(name, 7, 8);
        setBeast(this.new Horse());
    }
}
