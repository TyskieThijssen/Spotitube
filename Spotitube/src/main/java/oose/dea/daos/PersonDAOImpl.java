package oose.dea.daos;

import oose.dea.database.DatabaseConnection;
import oose.dea.domain.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tyskie on 21-3-2017.
 */
public class PersonDAOImpl implements PersonDAO {
    DatabaseConnection connection = new DatabaseConnection();
    Connection conn = connection.getConnection();

    @Override
    public List<Person> findAll() {
        List<Person> persons = new ArrayList<Person>();
        try {
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM Users";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                persons.add(new Person(name, age));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return persons;
    }

    @Override
    public void addPerson(String name, int age) {
        try {
            String query = "INSERT INTO Users VALUES (?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletePerson(String name) {
        try {
            String query = "DELETE FROM Users WHERE name LIKE ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updatePerson(String name, int age, String oldName) {
        try {
            String query = "UPDATE Users SET name = ?, age = ? WHERE name = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, oldName);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
