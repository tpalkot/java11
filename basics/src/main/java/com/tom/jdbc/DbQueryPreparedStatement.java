package com.tom.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DbQueryPreparedStatement {

    public static void main(String[] args) {

        try(Connection conn = DBConnector.getConnection();
                PreparedStatement statement = conn.prepareStatement("select * from contact");
        ) {

            ResultSet resultSet = statement.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();


            for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
                System.out.printf("%-25s \t", resultSetMetaData.getColumnName(i + 1));
            }
            System.out.printf("%n");


            while (resultSet.next()) {
                for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
                    System.out.printf("%-25s \t", resultSet.getObject(i + 1));
                }
                System.out.printf("%n");
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
