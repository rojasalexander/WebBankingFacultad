package com.taobanking.database;

import com.taobanking.classes.Client;
import java.sql.*;


public class ClientDB extends DataBaseConnection {
    
    // Insertar en la tabla clientes
    /*
    {
        client_id -> int primary key
        client_name -> varchar
        client_ci -> varchar
        client_birth_date -> date
    }
    */
    public void insertClient(Client client) {
        try {
            this.getConnection();
            String query = "INSERT INTO clients (client_name, client_ci, client_birth_date) VALUES ('"
            + client.getClientName() + "', '" 
            + client.getClientCi() + "', '"
            + client.getClientBirthDate() + "')";
            this.executeUpdate(query);
            this.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Actualizar en la tabla clientes
    public void updateClient(Client client) {
        try {
            this.getConnection();
            String query = "UPDATE clients SET client_name = '" + client.getClientName() + "', client_ci = '" + client.getClientCi() + "', client_birth_date = '" + client.getClientBirthDate() + "' WHERE client_id = " + client.getClientId();
            this.executeUpdate(query);
            this.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Eliminar en la tabla clientes
    public void deleteClient(Client client) {
        try {
            this.getConnection();
            String query = "DELETE FROM clients WHERE client_id = " + client.getClientId();
            this.executeUpdate(query);
            this.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Buscar por id en la tabla clientes
    public Client getClientById(int clientId) {
        try {
            this.getConnection();
            String query = "SELECT * FROM clients WHERE client_id = " + clientId;
            ResultSet resultSet = this.executeQuery(query);
            Client client = null;
            while (resultSet.next()) {
                client = new Client(resultSet.getInt("client_id"), resultSet.getString("client_name"), resultSet.getString("client_ci"), resultSet.getString("client_birth_date"));
            }
            this.closeConnection();
            return client;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
