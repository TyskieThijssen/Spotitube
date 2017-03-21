package oose.dea.data;

import oose.dea.database.DatabaseConnection;
import oose.dea.domain.Person;
import oose.dea.domain.Track;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thijs on 21-3-2017.
 */
public class TrackDAOImpl implements TrackDAO {
    DatabaseConnection connection = new DatabaseConnection();
    Connection conn = connection.getConnection();

    @Override
    public List<Track> findAll() {
        //TODO IMPLEMENT
        return null;
    }
}
