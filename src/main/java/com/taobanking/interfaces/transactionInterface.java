package com.taobanking.interfaces;

public interface TransactionInterface {
    Integer transaction_id = null;
    String transaction_date = null;
    Integer transaction_number = null;
    Integer transaction_amount = null;
    Integer account_id = null;

    // Getters
    public Integer getTransactionId();
    public String getTransactionDate();
    public Integer getTransactionNumber();
    public Integer getTransactionAmount();
    public Integer getAccountId();

    // Setters
    public void setTransactionId(Integer transaction_id);
    public void setTransactionDate(String transaction_date);
    public void setTransactionNumber(Integer transaction_number);
    public void setTransactionAmount(Integer transaction_amount);
    public void setAccountId(Integer account_id);
}
