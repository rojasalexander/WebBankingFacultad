package com.taobanking.interfaces;

public interface CreditCardInterface {
    Integer card_id = null;
    String card_number = null;
    String card_expiration_date = null;
    String card_cvv = null;
    Integer account_id = null;

    // Getters
    Integer getCardId();
    String getCardNumber();
    String getCardExpirationDate();
    String getCardCvv();
    Integer getAccountId();

    // Setters
    void setCardId(Integer card_id);
    void setCardNumber(String card_number);
    void setCardExpirationDate(String card_expiration_date);
    void setCardCvv(String card_cvv);
    void setAccountId(Integer account_id);
}
