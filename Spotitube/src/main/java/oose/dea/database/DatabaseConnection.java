package oose.dea.database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {

    public Connection getConnection(){
        Connection conn = null;
//        Properties properties = new Properties();
//        FileInputStream fis;
        try {
//            fis = new FileInputStream("databaseconnection.properties");
//            properties.load(fis);
            String connectionString = "jdbc:mysql://localhost:3306/spotitube";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(connectionString, "root", "root");
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
// } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return conn;
    }

    public static void main(String[] args) {
        DatabaseConnection connection = new DatabaseConnection();
        if(connection.getConnection() == null){
            System.out.println("no connection");
        } else {
            System.out.println("Connected");
        }
    }
}