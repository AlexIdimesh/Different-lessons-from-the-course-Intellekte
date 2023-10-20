package com.intellekta.generics.middleearth.race;

public abstract class AbstractCavalryUnit <T extends AbstractUnit> extends AbstractUnit   {

    private T beast;

    public AbstractCavalryUnit(String name, int minPower, int maxPower) {
        super(name,minPower, maxPower);
    }

    @Override
    public <T extends AbstractUnit> void strike(T unit) {
        if (beast.getPower() > 0) {
            unit.damage(this.getPower() + beast.getPower());
        } else  {
            unit.damage(this.getPower());
        }
    }
    @Override
    public void damage(int dam) {
        if (beast.getPower() > 0) {
            beast.setPower(beast.getPower() - dam);
        } else {
            this.setPower(this.getPower() - dam);
        }
    }
    public T getBeast() {
        return beast;
    }

    public void setBeast(T beast) {
        this.beast = beast;
    }


    public class Horse extends AbstractUnit {
        int power;

        public Horse() {
            super("",4, 5);
        }

        public AbstractCavalryUnit getHorse() {
            return AbstractCavalryUnit.this;
        }
        @Override
        public int getPower() {
           return AbstractCavalryUnit.this.getPower() + this.power;
        }
    }

    public class Warg extends AbstractUnit {
        int power;

        public Warg() {
            super("",4, 7);
        }

        public AbstractCavalryUnit getWarg() {
            return AbstractCavalryUnit.this;
        }
        @Override
        public int getPower() {
            return AbstractCavalryUnit.this.getPower() + this.power;
        }
    }
}

