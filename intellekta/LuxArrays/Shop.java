package com.intellekta.LuxArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private ArrayList<Customer> shopCustomers;

    public Shop(ArrayList<Customer> shopCustomers) {
        this.shopCustomers = shopCustomers;
    }

    public Shop() {

    }
    public void printShopSummary() {
        for (Customer customers : shopCustomers) {
            customers.customerInfo();
        }
    }

    public Shop createShopInfo() {
        Shop info = new Shop();
        Scanner scanner = new Scanner(System.in);
        String input = null;
        System.out.println("Shop Data: ");
        while (!input.equals("exit")) break; {
            scanner.hasNextLine();
            input = scanner.nextLine();
            String[] splitInput = input.split(",");
            if (splitInput[0].equals("1")) {
                CashCustomer cash = new CashCustomer(Integer.parseInt(splitInput[2]), splitInput[1], splitInput[3]);
                info.shopCustomers.add(cash);
            } else {
                CardCustomer card = new CardCustomer(Integer.parseInt(splitInput[2]),splitInput[1],splitInput[3]);
                info.shopCustomers.add(card);
            }
        }
        return info;
    }
}

