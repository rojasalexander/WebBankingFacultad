package com.taobanking.database;

import java.sql.*;

import com.taobanking.classes.Bank;

public class BankDB extends DataBaseConnection {

    // Metodo insertar
    /*
        {
            bank_id -> int primary key
            bank_name -> varchar
            bank_address -> varchar
        }
    */
    public void insertBank(Bank bank) {
        try {
            this.getConnection();
            String query = "INSERT INTO banks (bank_name, bank_address) VALUES ('"
            + bank.getBankName() + "', '" 
            + bank.getBankAddress() + "')";
            this.executeUpdate(query);
            this.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metodo actualizar
    public void updateBank(Bank bank) {
        try {
            this.getConnection();
            String query = "UPDATE banks SET bank_name = '" 
            + bank.getBankName() 
            + "', bank_address = '" 
            + bank.getBankAddress() 
            + "' WHERE bank_id = " 
            + bank.getBankId();
            this.executeUpdate(query);
            this.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metodo eliminar
    public void deleteBank(Bank bank) {
        try {
            this.getConnection();
            String query = "DELETE FROM banks WHERE bank_id = " + bank.getBankId();
            this.executeUpdate(query);
            this.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metodo buscar por id
    public Bank getBankById(int bankId) {
        Bank bank = new Bank();
        try {
            this.getConnection();
            String query = "SELECT * FROM banks WHERE bank_id = " + bankId;
            ResultSet rs = this.executeQuery(query);
            if (rs.next()) {
                bank.setBankId(rs.getInt("bank_id"));
                bank.setBankName(rs.getString("bank_name"));
                bank.setBankAddress(rs.getString("bank_address"));
            }
            this.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bank;
    }
}
