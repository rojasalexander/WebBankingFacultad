package com.taobanking.database;

import com.taobanking.classes.Account;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDB  extends DataBaseConnection{
    
    // Metodo insertar
    /*
        {
            account_pin -> int
            account_transaction_pin -> int
            account_balance -> int
            client_id -> int
            bank_id -> int
        }
    */

    // Metodo insertar
    public void insertAccount(Account account) {
        try {
            this.getConnection();
            String query = "INSERT INTO accounts (account_pin, account_transaction_pin, account_balance, client_id, bank_id) VALUES ('"
            + account.getAccountPin() + "', '" 
            + account.getAccountTransactionPin() + "', '" 
            + account.getAccountBalance() + "', '" 
            + account.getClientId() + "', '" 
            + account.getBankId() + "')";
            this.executeUpdate(query);
            this.closeConnection();
        } catch (SQLException e) {
            System.out.println("Error connecting to PostgreSQL database");
        }
    }

    // Metodo actualizar
    public void updateAccount(Account account) {
        try {
            this.getConnection();
            String query = "UPDATE accounts SET account_pin = '" 
            + account.getAccountPin() 
            + "', account_transaction_pin = '" 
            + account.getAccountTransactionPin() 
            + "', account_balance = '" 
            + account.getAccountBalance() 
            + "', client_id = '" 
            + account.getClientId() 
            + "', bank_id = '" 
            + account.getBankId() 
            + "' WHERE account_id = " 
            + account.getAccountId();
            this.executeUpdate(query);
            this.closeConnection();
        } catch (SQLException e) {
            System.out.println("Error connecting to PostgreSQL database");
        }
    }

    // Metodo actualizar Pin
    public void updateAccountPin(Account account) {
        try {
            this.getConnection();
            String query = "UPDATE accounts SET account_pin = '" 
            + account.getAccountPin() 
            + "' WHERE account_id = " 
            + account.getAccountId();
            this.executeUpdate(query);
            this.closeConnection();
        } catch (SQLException e) {
            System.out.println("Error connecting to PostgreSQL database");
        }
    }

    // Metodo actualizar Pin de transaccion
    public void updateAccountTransactionPin(Account account) {
        try {
            this.getConnection();
            String query = "UPDATE accounts SET account_transaction_pin = '" 
            + account.getAccountTransactionPin() 
            + "' WHERE account_id = " 
            + account.getAccountId();
            this.executeUpdate(query);
            this.closeConnection();
        } catch (SQLException e) {
            System.out.println("Error connecting to PostgreSQL database");
        }
    }

    // Metodo get balance de cuente por id de cliente
    public int getAccountBalanceByClientId(int clientId) {
        int balance = 0;
        try {
            this.getConnection();
            String query = "SELECT account_balance FROM accounts WHERE client_id = " + clientId;
            ResultSet rs = this.executeQuery(query);
            while (rs.next()) {
                balance = rs.getInt("account_balance");
            }
            this.closeConnection();
        } catch (SQLException e) {
            System.out.println("Error connecting to PostgreSQL database");
        }
        return balance;
    }

    /**
     * Metodo set balance de cuente por id de cliente
     * @param clientId
     * @param accountBalance
     */
    public void setAccountBalanceByClientId(int clientId, int accountBalance) {
        try {
            this.getConnection();
            String query = "UPDATE accounts SET account_balance = '" 
            + accountBalance 
            + "' WHERE client_id = " 
            + clientId;
            this.executeUpdate(query);
            this.closeConnection();
        } catch (SQLException e) {
            System.out.println("Error connecting to PostgreSQL database");
        }
    }

    /**
     * Metodo eliminar cuenta
     * @param account
     */
    public void deleteAccount(Account account) {
        try {
            this.getConnection();
            String query = "DELETE FROM accounts WHERE account_id = " + account.getAccountId();
            this.executeUpdate(query);
            this.closeConnection();
        } catch (SQLException e) {
            System.out.println("Error connecting to PostgreSQL database");
        }
    }

    /**
     * Metodo get cuenta por id de cliente
     * @param clientId
     * @return
     */
    public int getAccountPinByClientId(int client_id) {
        int account_pin = 0;
        try {
            this.getConnection();
            String query = "SELECT account_pin FROM accounts WHERE client_id = " + client_id;
            ResultSet result = this.executeQuery(query);
            while (result.next()) {
                account_pin = result.getInt("account_pin");
            }
            this.closeConnection();
        } catch (SQLException e) {
            System.out.println("Error connecting to PostgreSQL database");
        }
        return account_pin;
    }
}
