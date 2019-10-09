package com.tom.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDeleteRowSet {

    public static void main(String[] args) {

        try(Connection conn = DBConnector.getConnection();
                Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);
                ResultSet resultSet = statement.executeQuery("select * from contact");) {
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();


            for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
                System.out.printf("%-25s \t", resultSetMetaData.getColumnName(i + 1));
            }
            System.out.printf("%n");

            int rowCount = 0;
            while (resultSet.next()) {
                for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
                    System.out.printf("%-25s \t", resultSet.getObject(i + 1));
                }
                System.out.printf("%n");
                if (rowCount++ == 2) {
                    resultSet.deleteRow();
                }
            }


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
