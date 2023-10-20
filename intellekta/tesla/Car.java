package com.intellekta.tesla;

public class Car extends Vehicle {

    private String model;

    public Car(int power, String model) {
        super(power);
        this.model = (model == null) ? "default" : model;
    }

    public String getModel() {
        return model;
    }
    public void printSpecification(){
        System.out.println("Car model: " + model);
    }
}
