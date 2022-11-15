package com.taobanking.database;

import java.sql.*;

public class DataBaseConnection {
    private String jcbURL = "jdbc:postgresql://34.151.212.162:5432/postgres";
    private String username = "postgres";
    private String password = "password";
    private Connection connection;

    public Connection getConnection() {
        try {
            this.connection = DriverManager.getConnection(this.jcbURL, this.username, this.password);
            System.out.println("Connected to PostgreSQL database!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.connection;
    }

    public void closeConnection() {
        try {
            this.connection.close();
            System.out.println("Connection closed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Para select from umia
     * @param query
     * @return
     */
    public ResultSet executeQuery(String query) {
        ResultSet resultSet = null;
        try {
            Statement statement = this.connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    /**
     * Para insert, update, delete
     * @param query
     */
    public void executeUpdate(String query) {
        try {
            Statement statement = this.connection.createStatement();
            statement.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Para crear tablas.
     * @param query
     * @return void
     */
    public void execute(String query) {
        try {
            Statement statement = this.connection.createStatement();
            statement.execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
