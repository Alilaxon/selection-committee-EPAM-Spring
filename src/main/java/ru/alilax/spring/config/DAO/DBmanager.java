package ru.alilax.spring.config.DAO;

import ru.alilax.spring.config.models.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBmanager {
    private static Connection connection;
    final static String URL = "jdbc:postgresql://localhost:5432/FinalProjectDB" +
            "?user=postgres&password=19902115";

    static {
        try {
            connection = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean insertUser(Person target) {
        if (target == null) return false;
        try {
            PreparedStatement statement = connection
                    .prepareStatement("INSERT INTO person(name,email,age) VALUES(?,?,?)");

            statement.setString(1, target.getName());
            statement.setString(2,target.getEmail());
            statement.setInt(3,target.getAge());
            statement.execute();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return true;
    }
}