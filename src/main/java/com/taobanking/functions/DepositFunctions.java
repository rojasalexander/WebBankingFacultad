package com.taobanking.functions;

import com.taobanking.database.DataBaseConnection;
import com.taobanking.database.AccountDB;
import com.taobanking.classes.Client;

public class DepositFunctions extends DataBaseConnection {
    private Integer Amount;
    /**
     * Constructor
     * @param depositAmount
     */
    public DepositFunctions(Integer depositAmount) {
        this.Amount = depositAmount;
    }
    
    /**
     * Depositar dinero en la cuenta
     * @param deposit_amount
     */
    
    public boolean depositMoney (LogIn Login, String account_pin) {
        Client client = Login.getClient();
         // Verificar si el pin de cuenta es correcto a tra vez del id del cliente
        if (client == null) {
            return false;
        }
        AccountDB account = new AccountDB();
        Integer accountPinInteger = Integer.parseInt(account_pin);
        if (account.getAccountPinByClientId(client.getClientId()) != accountPinInteger) {
            return false;
        }
        // Obtener el balance de la cuenta
        Integer accountBalance = account.getAccountBalanceByClientId(client.getClientId());
        // Actualizar el balance de la cuenta
        account.setAccountBalanceByClientId(client.getClientId(), accountBalance + Amount);
        return true;
    }
    
}
