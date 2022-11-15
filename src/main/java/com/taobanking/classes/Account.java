package com.taobanking.classes;

import com.taobanking.interfaces.AccountInterface;

public class Account implements AccountInterface {
    private Integer account_id;
    private Integer account_number;
    private Integer account_pin;
    private Integer account_transaction_pin;
    private Integer account_balance;
    private Integer client_id;  
    private Integer bank_id;

    // Constructor
    public Account(
        Integer account_id, 
        Integer account_number, 
        Integer account_pin, 
        Integer account_transaction_pin, 
        Integer account_balance, 
        Integer client_id, 
        Integer bank_id) {
        this.account_id = account_id;
        this.account_number = account_number;
        this.account_pin = account_pin;
        this.account_transaction_pin = account_transaction_pin;
        this.account_balance = account_balance;
        this.client_id = client_id;
        this.bank_id = bank_id;
    }

    // Getters
    public Integer getAccountId() {
        return this.account_id;
    }

    public Integer getAccountNumber() {
        return this.account_number;
    }

    public Integer getAccountPin() {
        return this.account_pin;
    }

    public Integer getAccountTransactionPin() {
        return this.account_transaction_pin;
    }

    public Integer getAccountBalance() {
        return this.account_balance;
    }

    public Integer getClientId() {
        return this.client_id;
    }

    public Integer getBankId() {
        return this.bank_id;
    }

    // Setters
    public void setAccountId(Integer account_id) {
        this.account_id = account_id;
    }

    public void setAccountNumber(Integer account_number) {
        this.account_number = account_number;
    }

    public void setAccountPin(Integer account_pin) {
        this.account_pin = account_pin;
    }

    public void setAccountTransactionPin(Integer account_transaction_pin) {
        this.account_transaction_pin = account_transaction_pin;
    }

    public void setAccountBalance(Integer account_balance) {
        this.account_balance = account_balance;
    }

    public void setClientId(Integer client_id) {
        this.client_id = client_id;
    }

    public void setBankId(Integer bank_id) {
        this.bank_id = bank_id;
    }
}
