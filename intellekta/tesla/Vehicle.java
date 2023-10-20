package com.intellekta.tesla;

public class Vehicle {
    private int power;

    public Vehicle(int power) {
        this.power = (power < 1 || power > 3000) ? 1 : power;
    }

    public int getPower() {
        return power;
    }

    public void printSpecification() {
        System.out.println("Vehicle power: " + power);
    }
}
