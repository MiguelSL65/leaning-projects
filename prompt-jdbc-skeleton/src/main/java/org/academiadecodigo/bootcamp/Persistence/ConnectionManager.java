package org.academiadecodigo.bootcamp.Persistence;

import org.academiadecodigo.bootcamp.model.User;

import java.sql.*;

public class ConnectionManager {

    private Connection connection = null;

    public Connection getConnection() {

        String dbUrl = "jdbc:mysql://localhost:3306/ac?user=root";

        try {

            if (connection == null) {
                connection = DriverManager.getConnection(dbUrl);
            }

        } catch (SQLException e) {
            System.out.println("Failure to connect to database: " + e.getMessage());
        }

        return connection;
    }

    public void close() {

            try {

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {

                System.out.println("Failure to close database connections: " + e.getMessage());
            }
        }
    }
