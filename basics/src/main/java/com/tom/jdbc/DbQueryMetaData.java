package com.tom.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbQueryMetaData {

    public static void main(String[] args) {

        try(Connection conn = DBConnector.getConnection();
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from ACCOUNTS");) {
            String format = "%-20s \t %-20s%n";
            System.out.printf(format, "EXTERNALACCOUNTID", "ACCOUNTTYPE");

            while (resultSet.next()) {
                System.out.printf(format, resultSet.getString("EXTERNALACCOUNTID"),
                        resultSet.getString("ACCOUNTTYPE"));


            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
