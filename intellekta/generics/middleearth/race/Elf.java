package com.intellekta.generics.middleearth.race;

import com.intellekta.generics.middleearth.battle.MiddleEarthUnit;

public class Elf extends AbstractUnit implements MiddleEarthUnit {

    public Elf(String name) {
        super(name, 4, 7);
    }
}

