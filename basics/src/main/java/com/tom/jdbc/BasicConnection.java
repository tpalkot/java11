package com.tom.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicConnection {

    public static void main(String[] args) {
        
        String url = "jdbc:mariadb://localhost:3306/smp";
        try (Connection conn = DriverManager.getConnection(url, "motive", "motive")){
            System.out.println("connection successful");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
