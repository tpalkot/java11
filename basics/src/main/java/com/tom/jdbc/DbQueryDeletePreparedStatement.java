package com.tom.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbQueryDeletePreparedStatement {

    public static void main(String[] args) {

        try(Connection conn = DBConnector.getConnection();
                PreparedStatement statement =
                        conn.prepareStatement("delete from contact where id = ?");
        ) {

            statement.setInt(1, 3);
            statement.execute();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
