package oose.dea.data;

import oose.dea.database.DatabaseConnection;
import oose.dea.domain.Person;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
}
