package com.taobanking.interfaces;

public interface BankInterface {
    Integer bank_id = null;
    String bank_name = null;
    String bank_address = null;

    // Metodos para retornar los atributos
    public Integer getBankId();
    public String getBankName();
    public String getBankAddress();

    // Metodos para asignar los atributos
    public void setBankId(Integer bank_id);
    public void setBankName(String bank_name);
    public void setBankAddress(String bank_address);

    // 
}
