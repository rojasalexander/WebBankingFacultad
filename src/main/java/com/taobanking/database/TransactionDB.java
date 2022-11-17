package com.taobanking.database;

import java.sql.SQLException;

import com.taobanking.classes.Transaction;

public class TransactionDB extends DataBaseConnection {
    Transaction transaction;

    /**
     * Constructor
     * @param transaction
     */
    public TransactionDB(Transaction transaction) {
        this.transaction = transaction;
    }

    /**
     * Insertar una nueva transaccion en la tabla
    * @param transaction
    * @throws SQLException
    */
    public void insertTransaction() {
        try {
            this.getConnection();

            String query = "INSERT INTO transactions (transaction_date, transaction_amount, account_id, transaction_number" +
            "VALUES ('" + this.transaction.getTransactionDate() + "', " + this.transaction.getTransactionAmount() + ", " +
            this.transaction.getAccountId() + ");";

            this.executeQuery(query);
            this.closeConnection();

        } catch (SQLException e) {
            System.out.println("Error connecting to PostgreSQL database");
        }
    }
    
    /**
     * Actualizar una transaccion en la tabla
     * @param transaction
     * @throws SQLException
     */
    public void updateTransaction() {
        try {
            this.getConnection();

            String query = "UPDATE transactions SET transaction_date = '" + this.transaction.getTransactionDate() + "', " +
            "transaction_amount = " + this.transaction.getTransactionAmount() +
            " WHERE transaction_id = " + this.transaction.getTransactionId() + ";";

            this.executeQuery(query);
            this.closeConnection();

        } catch (SQLException e) {
            System.out.println("Error connecting to PostgreSQL database");
        }
    }
}
