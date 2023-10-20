package com.intellekta.LuxArrays;

public class CashCustomer extends Customer {

    private String documentNumber;

    public CashCustomer(int purchaseCount, String name, String documentNumber) {
        super(purchaseCount, name);
        this.documentNumber = (documentNumber == null) ? "0000 000000" : documentNumber;
    }


    public String getDocumentNumber() {
        return documentNumber;
    }
    @Override
    public void customerInfo() {
        System.out.println ("Customer" + getName() + " (passport: " + documentNumber + ")" + " has a discount " + getDiscountSize()+ "%" + "\n");

    }
}
