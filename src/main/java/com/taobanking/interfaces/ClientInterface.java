package com.taobanking.interfaces;

public interface ClientInterface {
    Integer client_id = null;
    String client_name = null;
    String client_ci = null;
    String client_birthdate = null;

    // Getters
    Integer getClientId();
    String getClientName();
    String getClientCi();
    String getClientBirthdate();

    // Setters
    void setClientId(Integer client_id);
    void setClientName(String client_name);
    void setClientCi(String client_ci);
    void setClientBirthdate(String client_birthdate);
    
}
