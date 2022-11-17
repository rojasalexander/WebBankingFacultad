package com.taobanking.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.taobanking.classes.CreditCard;

public class CreditCardDB extends DataBaseConnection {

    public void insertCreditCard(CreditCard creditCard) {
        try {
            this.getConnection();
            String query = "INSERT INTO credit_cards (card_number, card_expiration_date, card_cvv, account_id) VALUES ('"
            + creditCard.getCardNumber() + "', '" 
            + creditCard.getCardExpirationDate() + "', '"
            + creditCard.getCardCvv() + "', '"
            + creditCard.getAccountId() + "')";
            this.executeUpdate(query);
            this.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Actualizar en la tabla tarjetas de credito
    public void updateCreditCard(CreditCard creditCard) {
        try {
            this.getConnection();
            String query = "UPDATE credit_cards SET card_number = '" 
            + creditCard.getCardNumber() 
            + "', card_expiration_date = '" 
            + creditCard.getCardExpirationDate() 
            + "', card_cvv = '" 
            + creditCard.getCardCvv() 
            + "', account_id = '" 
            + creditCard.getAccountId() 
            + "' WHERE card_id = " 
            + creditCard.getCardId();
            this.executeUpdate(query);
            this.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Eliminar en la tabla tarjetas de credito
    public void deleteCreditCard(CreditCard creditCard) {
        try {
            this.getConnection();
            String query = "DELETE FROM credit_cards WHERE card_id = " + creditCard.getCardId();
            this.executeUpdate(query);
            this.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Obtener tarjeta de credito por id
    public CreditCard getCreditCardById(int cardId) {
        CreditCard creditCard = new CreditCard();
        try {
            this.getConnection();
            String query = "SELECT * FROM credit_cards WHERE card_id = " + cardId;
            ResultSet rs = this.executeQuery(query);
            if (rs.next()) {
                creditCard.setCardId(rs.getInt("card_id"));
                creditCard.setCardNumber(rs.getString("card_number"));
                creditCard.setCardExpirationDate(rs.getString("card_expiration_date"));
                creditCard.setCardCvv(rs.getString("card_cvv"));
                creditCard.setAccountId(rs.getInt("account_id"));
            }
            this.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return creditCard;
    }

    // Obtener todas las tarjetas de credito
    public ResultSet getAllCreditCards() {
        ResultSet rs = null;
        try {
            this.getConnection();
            String query = "SELECT * FROM credit_cards";
            rs = this.executeQuery(query);
            this.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

}
