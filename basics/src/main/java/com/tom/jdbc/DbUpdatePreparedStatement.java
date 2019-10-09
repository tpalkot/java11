package com.tom.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbUpdatePreparedStatement {

    public static void main(String[] args) {

        try(Connection conn = DBConnector.getConnection();
                PreparedStatement statement =
                        conn.prepareStatement("update contact set firstName=? where id = ?");
        ) {
            statement.setString(1, "Michael2");
            statement.setInt(2, 1);
            statement.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
