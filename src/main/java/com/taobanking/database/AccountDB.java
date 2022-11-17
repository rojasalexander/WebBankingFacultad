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

    // Metodo actualizar Saldo
    public void updateAccountBalance(Account account) {
        try {
            this.getConnection();
            String query = "UPDATE accounts SET account_balance = '" 
            + account.getAccountBalance() 
            + "' WHERE account_id = " 
            + account.getAccountId();
            this.executeUpdate(query);
            this.closeConnection();
        } catch (SQLException e) {
            System.out.println("Error connecting to PostgreSQL database");
        }
    }

    // Metodo eliminar cuenta
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

    // Metodo buscar existencia de cuenta
    public boolean searchAccount(Integer account_pin) {
        ResultSet resulSet;
        try {
            this.getConnection();
            String query = "SELECT COUNT(*) FROM accounts WHERE account_pin = " + account_pin;
            resulSet = this.executeQuery(query);
            resulSet.next();
            if (resulSet.getInt(1) == 1) {
                this.closeConnection();
                return true;
            } else {
                this.closeConnection();
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to PostgreSQL database");
            return false;
        }
    }
}
