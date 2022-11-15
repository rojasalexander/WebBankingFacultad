package com.taobanking.database;

import com.taobanking.classes.Transaction;

public class TransactionDB {
    Transaction transaction;

    public TransactionDB(Transaction transaction) {
        this.transaction = transaction;
    }

    public void insertTransaction() {
        try {
            DataBaseConnection database = new DataBaseConnection();
            database.getConnection();

            String query = "INSERT INTO transactions (transaction_date, transaction_amount, account_id, transaction_number" +
            "VALUES ('" + this.transaction.getTransactionDate() + "', " + this.transaction.getTransactionAmount() + ", " +
            this.transaction.getAccountId() + ", " + this.transaction.getTransactionNumber() + ");";

            database.executeQuery(query);
            database.closeConnection();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateTransaction() {
        try {
            DataBaseConnection database = new DataBaseConnection();
            database.getConnection();

            String query = "UPDATE transactions SET transaction_date = '" + this.transaction.getTransactionDate() + "', " +
            "transaction_amount = " + this.transaction.getTransactionAmount() +
            " WHERE transaction_id = " + this.transaction.getTransactionId() + ";";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
