package com.taobanking;

import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;

import com.taobanking.classes.Client;
import com.taobanking.database.ClientDB;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del cliente: ");
        String clientName = sc.nextLine();
        System.out.println("Ingrese la cedula del cliente: ");
        String clientCi = sc.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del cliente: ");
        String clientBirthDate = sc.nextLine();

        Client client = new Client(clientName, clientCi, clientBirthDate);
        System.out.println(client.getClientName());
        System.out.println(client.getClientCi());
        System.out.println(client.getClientBirthDate());

        ClientDB clientDB = new ClientDB();
        clientDB.insertClient(client);

        sc.close();
    }
}
