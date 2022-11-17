package com.taobanking.functions;

public class CreditCardFunctions {

    // generar un numero de tarjeta de credito
    public static String generateCreditCardNumber() {
        String creditCardNumber = "";
        for (int i = 0; i < 16; i++) {
            creditCardNumber += (int) (Math.random() * 10);
        }
        return creditCardNumber;
    }

    // generar un codigo cvv de tarjeta de credito
    public static String generateCreditCardCVV() {
        String creditCardCVV = "";
        for (int i = 0; i < 3; i++) {
            creditCardCVV += (int) (Math.random() * 10);
        }
        return creditCardCVV;
    }

    // generar un mes de expiracion de tarjeta de credito
    public static String generateCreditCardExpirationMonth() {
        String creditCardExpirationMonth = "";
        // Generar un numero aleatorio entre 1 y 12
        int month = (int) (Math.random() * 12) + 1;
        if (month < 10) {
            creditCardExpirationMonth = "0" + month;
        } else {
            creditCardExpirationMonth = "" + month;
        }
        return creditCardExpirationMonth;
    }
}