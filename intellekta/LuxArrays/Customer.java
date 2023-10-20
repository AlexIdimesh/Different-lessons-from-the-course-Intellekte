package com.intellekta.LuxArrays;

public abstract class Customer {

    private int purchaseCount;
    private String name;
    private double discountSize;

    public Customer(int purchaseCount, String name) {
        this.purchaseCount = (purchaseCount < 0) ? 0 : purchaseCount;
        this.name = (name == null) ? "No-name" : name;
        if (this.purchaseCount < 5) {
            this.discountSize = 0;
        } else if (this.purchaseCount > 4 && this.purchaseCount < 10) {
            this.discountSize = 0.05;
        } else if (this.purchaseCount > 9 && this.purchaseCount < 15) {
            this.discountSize = 0.1;
        } else {
            this.discountSize = 0.2;
        }
    }


    public abstract void customerInfo();

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public String getName() {
        return name;
    }

    public double getDiscountSize() {
        return discountSize;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = (purchaseCount < 0) ? 0 : purchaseCount;
        if (this.purchaseCount < 5) {
            discountSize = 0;
        } else if (this.purchaseCount > 4 && this.purchaseCount < 10) {
            discountSize = 0.05;
        } else if (this.purchaseCount > 9 && this.purchaseCount < 15) {
            discountSize = 0.1;
        } else {
            discountSize = 0.2;
        }
    }
}
