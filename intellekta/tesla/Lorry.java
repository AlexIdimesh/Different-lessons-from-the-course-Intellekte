package com.intellekta.tesla;

public class Lorry extends Car {
    private int capacity;

    public Lorry(int power, String model, int capacity) {
        super(power, model);
        this.capacity = (capacity < 500 || capacity > 10_000) ? 2500 : capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void printSpecification() {
        System.out.println("Capacity: " + capacity);
    }
}
