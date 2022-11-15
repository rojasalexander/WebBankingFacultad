package com.taobanking.classes;

import com.taobanking.interfaces.ClientInterface;

public class Client implements ClientInterface {
    private Integer client_id;
    private String client_name;
    private String client_ci;
    private String client_birthdate;

    // Constructor
    public Client(Integer client_id, String client_name, String client_ci, String client_birthdate) {
        this.client_id = client_id;
        this.client_name = client_name;
        this.client_ci = client_ci;
        this.client_birthdate = client_birthdate;
    }

    // Getters
    public Integer getClientId() {
        return this.client_id;
    }

    public String getClientName() {
        return this.client_name;
    }

    public String getClientCi() {
        return this.client_ci;
    }

    public String getClientBirthdate() {
        return this.client_birthdate;
    }

    // Setters
    public void setClientId(Integer client_id) {
        this.client_id = client_id;
    }

    public void setClientName(String client_name) {
        this.client_name = client_name;
    }

    public void setClientCi(String client_ci) {
        this.client_ci = client_ci;
    }

    public void setClientBirthdate(String client_birthdate) {
        this.client_birthdate = client_birthdate;
    }    
}
