package com.taobanking.functions;

import com.taobanking.database.DataBaseConnection;
import com.taobanking.database.ClientDB;
import com.taobanking.database.AccountDB;

public class DepositFunctions extends DataBaseConnection {
    private Integer Amount;
    private ClientDB client;
    private AccountDB account;

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
    

}
