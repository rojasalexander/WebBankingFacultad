package com.taobanking;

import java.sql.*;


public class connectProgram 
{
    public static void main(String[] args) {
        String jcbURL = "jdbc:postgresql://34.151.212.162:5432/postgres";
        String username = "postgres";
        String password = "password";
        try {
            Connection connection = DriverManager.getConnection(jcbURL, username, password);

            System.out.println("Connected to PostgreSQL database!");

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
