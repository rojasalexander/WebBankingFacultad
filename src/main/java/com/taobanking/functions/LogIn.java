package com.taobanking.functions;

import com.taobanking.database.ClientDB;
import com.taobanking.database.AccountDB;
import com.taobanking.classes.Client;
import com.taobanking.database.DataBaseConnection;

public class LogIn extends DataBaseConnection{
    
    private String client_ci;
    private String account_pin;
    private Client client;
    /**
     * Constructor
     * @param username
     * @param password
     */

    public LogIn(String username, String password) {
        this.client_ci = username;
        this.account_pin = password;
        client = null;
    }

    /**
     * Verificar si el usuario existe
     * @param username
     * @param password
     * @return
     */

    public boolean verifyUser() {
        AccountDB account = new AccountDB();
        ClientDB clientDatabase = new ClientDB();

        // Obtener el id del cliente atraves del ci
        client = clientDatabase.getClientByCi(client_ci);
        if (client == null) {
            return false;
        }
        Integer accountPinInteger = Integer.parseInt(account_pin);
        if (account.getAccountPinByClientId(client.getClientId()) != accountPinInteger) {
            return false;
        }
        return true;
    }

    /**
     * Obtener el cliente
     * @return
     */
    public Client getClient() {
        return client;
    }


}
