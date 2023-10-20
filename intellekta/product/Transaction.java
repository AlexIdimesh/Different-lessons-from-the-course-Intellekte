package com.intellekta.product;

public class Transaction {

    private double price = 0.0;


    private double tax = 1.2;

    public double getPrice() {
        return price;
    }

    public Transaction() {
        this.price = (price < 0.0) ? 0.0 : price;
    }

    public double dealPrice() {
        return price * tax;
    }

    private void printCheck(double price) {
        System.out.println("Price: USD " + String.format("%.2f",price));
    }

    public void printCheck() {
        System.out.println("Order price: USD" + price + "\n" + "Total price: USD " + price * tax );
    }
    public class TransactionItem {
        private double price;
        private String name;
        public Transaction getTransaction() {
            return Transaction.this;

        }
        public TransactionItem(double price, String name) {
            this.price = (price < 0) ? 0 : price;
            this.name = (name == null || name.equals(" ") || name.equals("\t") || name.equals("\n"))
                    ? "Default" : name;
            com.intellekta.product.Transaction.this.price += price;
        }
         public void printInfo() {
            System.out.println("Item" + name + ", ");
            printCheck(price);
        }
    }
}

