package com.intellekta.LuxArrays;

public class CardCustomer extends Customer {
    private String cardNumber;

    public CardCustomer(int purchaseCount, String name, String cardNumber) {
        super(purchaseCount, name);
        this.cardNumber = (cardNumber.length() != 16 && !cardNumber.matches("\\+d")) ? "000_0000_0000_0000" : cardNumber;
    }

    @Override
    public void customerInfo() {
        System.out.println("Customer" + getName() + " (сard: " + cardNumber + ")" + " has a discount " + getDiscountSize()+ "%" + "\n");
    }
}
