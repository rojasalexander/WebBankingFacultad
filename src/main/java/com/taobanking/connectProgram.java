package com.taobanking;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Hello world!
 *
 */
public class connectProgram 
{
    public static void main(String[] args) {
        // for ip 34.151.212.162 and port 5432
        String jcbURL = "jdbc:postgresql://34.151.212.162:5432/postgres";
        String username = "postgres";
        String password = "password";
        try {
            Connection connection = DriverManager.getConnection(jcbURL, username, password);
            // Crear una tabla con las siguientes columnas: client_id, client_name, client_ci, client_birth_date    
            
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
