package com.tom.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mariadb://localhost:3306/smp";
        Connection conn = DriverManager.getConnection(url, "motive", "motive");

        return conn;
    }

}
