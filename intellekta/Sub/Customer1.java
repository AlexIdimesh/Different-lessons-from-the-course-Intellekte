package com.intellekta.Sub;

import java.util.HashMap;

public class Customer1 {
    private int id;
    private String name;
    private String number;
    private double purchaseCount;
    private static HashMap<Integer, Customer1> map;

    public int getId() {
        return id;
    }

    public Customer1(int id, String name, String number, double purchaseCount) {
        this.id = (id < 0) ? 0 : id;
        this.name = (name == null) ? " " : name;
        this.number = (number == null) ? " ": number;
        this.purchaseCount = (purchaseCount < 0.0) ? 0.0 : purchaseCount;
    }
    public static void loud(Customer1[] customer) {
        if (customer.length == 0) {
            return;
        }
        for (int i = 0; i < customer.length; i ++) {
            map.put(customer[i].getId(), customer[i]);
        }
    }
    public static Customer1 getById(Customer1 id) {
        return map.get(id);
    }
}
