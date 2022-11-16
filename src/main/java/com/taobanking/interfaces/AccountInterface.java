package com.taobanking.interfaces;

public interface AccountInterface {
    Integer account_id = null;
    Integer account_number = null;
    Integer account_pin = null;
    Integer account_transaction_pin = null;
    Integer account_balance = null;
    Integer client_id = null;
    Integer bank_id = null;

    // Getters
    Integer getAccountId();
    Integer getAccountNumber();
    Integer getAccountPin();
    Integer getAccountTransactionPin();
    Integer getAccountBalance();
    Integer getClientId();
    Integer getBankId();

    // Setters
    void setAccountId(Integer account_id);
    void setAccountNumber(Integer account_number);
    void setAccountPin(Integer account_pin);
    void setAccountTransactionPin(Integer account_transaction_pin);
    void setAccountBalance(Integer account_balance);
    void setClientId(Integer client_id);
    void setBankId(Integer bank_id);
}
