package com.intellekta.generics.middleearth.battle;

import java.util.ArrayList;
import java.util.Random;

public class Army <T extends Unit> {
    ArrayList<Cavalry> cavalry;

    ArrayList<Infantry> infantry;

    ArrayList<Unit> army;

    public Army(ArrayList<Cavalry> cavalry, ArrayList<Infantry> infantry, ArrayList<Unit> army) {
        this.cavalry = cavalry;
        this.infantry = infantry;
        this.army = army;
    }

    public Army() {

    }

    public ArrayList<Unit> getArmy() {
        army.addAll(cavalry);
        army.addAll(infantry);
        return army;
    }

    public ArrayList<Cavalry> getCavalry() {
        return cavalry;
    }

    public ArrayList<Infantry> getInfantry() {
        return infantry;
    }


    public boolean recruit(T unit) {
        if (unit == null) {
            return false;
        }
        if (!(unit instanceof Cavalry) && !(unit instanceof Infantry)) return false;

            if (unit instanceof Cavalry) {
                cavalry.add((Cavalry) unit);
            } else {
                infantry.add((Infantry) unit);
            }
            return true;
        }
    public boolean release(T unit) {
         if (unit == null) {
             return false;
         }
        if (unit instanceof Infantry && infantry.isEmpty()) return false;
        if (unit instanceof Cavalry && cavalry.isEmpty()) return false;

        if (unit instanceof Cavalry) {
           cavalry.remove(unit);
        } else {
            infantry.remove(unit);
        }
        return true;
    }
    public T getRandomUnit() {
       Random random = new Random();
       int randomInx = random.nextInt(army.size());
       return (T) army.get(randomInx);
    }

    public T getRandomUnit(T unit) {
        Random random = new Random();
        int randomInd = random.nextInt(army.size());
        if (unit instanceof Cavalry) {
            cavalry.get(randomInd);
        } else {
            infantry.get(randomInd);
        }
        return unit;
    }
    @Override
    public String toString() {
        return "Army{" +
                "Cavalry=" + cavalry +
                ", Infantry=" + infantry +
                '}';
    }
}

