package com.intellekta.tesla;


public class PassengerCar extends Car {

    private int seats;

    public PassengerCar(int power, String model, int seats) {
        super(power, model);
        this.seats = (seats < 2 || seats > 8) ? 5 : seats;
    }

    public int getSeats() {
        return seats;
    }
    @Override
    public void printSpecification() {
        System.out.println("Seats count: " + seats);
    }
}
