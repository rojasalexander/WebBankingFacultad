package com.taobanking.classes;

import com.taobanking.interfaces.transactionInterface;

public class transaction implements transactionInterface {
    private Integer transaction_id;
    private String transaction_date;
    private Integer transaction_number;
    private Integer transaction_amount;
    private Integer account_id;

    public transaction(Integer transaction_id, String transaction_date, Integer transaction_number, Integer transaction_amount, Integer account_id) {
        this.transaction_id = transaction_id;
        this.transaction_date = transaction_date;
        this.transaction_number = transaction_number;
        this.transaction_amount = transaction_amount;
        this.account_id = account_id;
    }

    public Integer getTransactionId() {
        return transaction_id;
    }

    public void setTransactionId(Integer transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getTransactionDate() {
        return transaction_date;
    }

    public void setTransactionDate(String transaction_date) {
        this.transaction_date = transaction_date;
    }

    public Integer getTransactionNumber() {
        return transaction_number;
    }

    public void setTransactionNumber(Integer transaction_number) {
        this.transaction_number = transaction_number;
    }

    public Integer getTransactionAmount() {
        return transaction_amount;
    }

    public void setTransactionAmount(Integer transaction_amount) {
        this.transaction_amount = transaction_amount;
    }

    public Integer getAccountId() {
        return account_id;
    }

    public void setAccountId(Integer account_id) {
        this.account_id = account_id;
    }
}
