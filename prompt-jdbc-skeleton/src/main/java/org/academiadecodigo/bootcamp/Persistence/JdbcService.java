package org.academiadecodigo.bootcamp.Persistence;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.service.UserService;
import org.academiadecodigo.bootcamp.utils.Security;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class JdbcService implements UserService {

    private Connection dbConnection;

    public JdbcService(Connection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public boolean authenticate(String username, String password) {

        PreparedStatement statement = null;
        boolean isAuthenticated = false;

        try {

            String query = "SELECT password FROM user WHERE userame=?;";
            statement = dbConnection.prepareStatement(query);
            statement.setString(1, username);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String pass = resultSet.getString("password");
                isAuthenticated = pass.equals(Security.getHash(password));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(statement);
        }

        return isAuthenticated;
    }

    private void closeStatement(Statement statement) {

        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(User user) {
        PreparedStatement statement = null;

        if (findByName(user.getUsername()) != null) {
            return;
        }

        try {
            String query = "INSERT INTO user(username, password, email, firstname, lastname, phone)" +
                    "values(?, ?, ?, ?, ?, ?);";
            statement = dbConnection.prepareStatement(query);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getFirstName());
            statement.setString(5, user.getLastName());
            statement.setString(6, user.getPhone());

            statement.executeQuery();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(statement);
        }
    }

    @Override
    public User findByName(String username) {
        PreparedStatement statement = null;
        User user = null;

        try {
            String query = "SELECT * FROM user WHERE username=?;";
            statement = dbConnection.prepareStatement(query);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");
                String firstname = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");
                String phone = resultSet.getString("phone");

                user = new User(username, password, email, firstname, lastname, phone);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(statement);
        }

        return user;
    }

    @Override
    public List<User> findAll() {

        LinkedList<User> listOfUsers = new LinkedList<>();
        PreparedStatement statement = null;

        try {
            String query = "select * from user";
            statement = dbConnection.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String email = resultSet.getString("emial");
                String firsName = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");
                String phone = resultSet.getString("phone");

                listOfUsers.add(new User(username, password, email, firsName, lastname, phone));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(statement);
        }

        return listOfUsers;
    }

    @Override
    public int count() {

        int result = 0;
        PreparedStatement statement = null;

        try {

            String query = "SELECT COUNT(*) FROM user";
            statement = dbConnection.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                result = resultSet.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(statement);
        }

        return result;
    }
}
