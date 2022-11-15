package com.taobanking.database;

import java.sql.*;

import com.taobanking.classes.Bank;

public class BankDB extends DataBaseConnection {

    // Metodo insertar
    public void insertBank(Bank bank) {
        String query = "INSERT INTO banks (bank_name, bank_address) VALUES ("
        + bank.getBankName() + "', '" 
        + bank.getBankAddress() + "')";
        this.executeUpdate(query);
    }

    // Metodo actualizar
    public void updateBank(Bank bank) {
        String query = "UPDATE banks SET bank_name = '" + bank.getBankName() + "', bank_address = '" + bank.getBankAddress() + "' WHERE bank_id = " + bank.getBankId();
        this.executeUpdate(query);
    }

    // Metodo eliminar
    public void deleteBank(Bank bank) {
        String query = "DELETE FROM banks WHERE bank_id = " + bank.getBankId();
        this.executeUpdate(query);
    }

    // Metodo buscar por id
    public Bank getBankById(int bankId) {
        String query = "SELECT * FROM banks WHERE bank_id = " + bankId;
        ResultSet resultSet = this.executeQuery(query);
        Bank bank = null;
        try {
            while (resultSet.next()) {
                bank = new Bank(resultSet.getInt("bank_id"), resultSet.getString("bank_name"), resultSet.getString("bank_address"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bank;
    }
}
