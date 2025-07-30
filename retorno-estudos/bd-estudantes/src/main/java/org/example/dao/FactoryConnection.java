package org.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConnection {
    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/aula1";
    private static final String USER = "root";
    private static final String PASSWORD = "s@ph1r10n";

    private FactoryConnection() {}

    public static Connection getInstance() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return connection;
    }
}