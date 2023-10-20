package com.intellekta.tesla;

public class Task {
    public static void main(String[] args) {
    }

    public static void task() {
        Vehicle vehicle1 = new PassengerCar(620, "Semi", 6500);
        Vehicle vehicle2 = new Lorry(300, "Model X", 5);
        Vehicle vehicle3 = new Motorcycle(170,120);
        System.out.println(vehicle1);
        System.out.println(vehicle2);
        System.out.println(vehicle3);
    }
}
