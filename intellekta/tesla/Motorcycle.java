package com.intellekta.tesla;

 public final class Motorcycle extends Vehicle {

     private int speed;

     public Motorcycle(int power, int speed) {
         super(power);
         this.speed = (speed < 0 || speed > 300) ? 200 : speed;
     }

     public int getSpeed() {
         return speed;
     }

     @Override
     public void printSpecification(){
         System.out.println("Moto speed: " + speed);
     }
 }
