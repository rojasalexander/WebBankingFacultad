package com.taobanking.classes;
import com.taobanking.interfaces.BankInterface;

public class Bank implements BankInterface{
    
    private Integer bank_id;
    private String bank_name;
    private String bank_address;

    public Bank(Integer bank_id, String bank_name, String bank_address) {
        this.bank_id = bank_id;
        this.bank_name = bank_name;
        this.bank_address = bank_address;
    }

    public Bank() {
        
    }

    public Integer getBankId() {
        return bank_id;
    }

    public void setBankId(Integer bank_id) {
        this.bank_id = bank_id;
    }

    public String getBankName() {
        return bank_name;
    }
    
    public void setBankName(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBankAddress() {
        return bank_address;
    }

    public void setBankAddress(String bank_address) {
        this.bank_address = bank_address;
    }
}
