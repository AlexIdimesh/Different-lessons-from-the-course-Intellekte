package com.intellekta.product;

public class Receipt {
    public static void printReceipt(ProductInfo[] productInfo) {

        if (productInfo == null) {
            return;
        }
        if (productInfo.length == 0) {
            return;
        }

        Transaction transaction = new Transaction();

        for (int i = 0; i < productInfo.length; i++) {
            Transaction.TransactionItem transactionItem =
                    transaction.new TransactionItem(productInfo[i].price, productInfo[i].name);
            transactionItem.printInfo();
        }
        transaction.printCheck();
    }
        public static void printTransactionInfo(Transaction.TransactionItem transactionItem) {
            transactionItem.getTransaction().printCheck();
        }

    }

