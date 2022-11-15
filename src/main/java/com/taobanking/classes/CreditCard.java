package com.taobanking.classes;

import com.taobanking.interfaces.CreditCardInterface;

public class CreditCard implements CreditCardInterface {
    private Integer card_id;
    private String card_number;
    private String card_expiration_date;
    private String card_cvv;
    private Integer account_id;

    // Constructor
    public CreditCard(
        Integer card_id, 
        String card_number, 
        String card_expiration_date, 
        String card_cvv, 
        Integer account_id) {
        this.card_id = card_id;
        this.card_number = card_number;
        this.card_expiration_date = card_expiration_date;
        this.card_cvv = card_cvv;
        this.account_id = account_id;
    }

    // Getters
    public Integer getCardId() {
        return this.card_id;
    }

    public String getCardNumber() {
        return this.card_number;
    }

    public String getCardExpirationDate() {
        return this.card_expiration_date;
    }

    public String getCardCvv() {
        return this.card_cvv;
    }

    public Integer getAccountId() {
        return this.account_id;
    }

    // Setters
    public void setCardId(Integer card_id) {
        this.card_id = card_id;
    }

    public void setCardNumber(String card_number) {
        this.card_number = card_number;
    }

    public void setCardExpirationDate(String card_expiration_date) {
        this.card_expiration_date = card_expiration_date;
    }

    public void setCardCvv(String card_cvv) {
        this.card_cvv = card_cvv;
    }

    public void setAccountId(Integer account_id) {
        this.account_id = account_id;
    }
}
