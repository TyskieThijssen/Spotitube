package oose.dea.daos;

import oose.dea.database.DatabaseConnection;
import oose.dea.domain.Song;
import oose.dea.domain.Track;
import oose.dea.domain.Video;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thijs on 21-3-2017.
 */
@Dependent
public class TrackDAOImpl implements TrackDAO {
    DatabaseConnection connection = new DatabaseConnection();
    Connection conn = connection.getConnection();

    PreparedStatement preparedStatement;
    Statement stmt;
    String query;

    @Override
    public List<Track> findAll() {
        List<Track> tracks = new ArrayList<Track>();
        try{
            stmt = conn.createStatement();
            query = "SELECT * FROM Track";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                tracks.addAll(getTracks(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tracks;
    }

    @Override
    public List<Track> searchTrackByName(String zoekTerm) {
        List<Track> tracks = new ArrayList<Track>();
        try{
            query = "SELECT * FROM Track WHERE title like ?";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, zoekTerm);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                tracks.addAll(getTracks(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tracks;
    }

    public List<Track> getTracks(ResultSet rs) throws SQLException {
        List<Track> tracks = new ArrayList<Track>();
        String performer = rs.getString("performer");
        String title = rs.getString("title");
        Time duration =  (rs.getTime("duration"));
        if(rs.getString("album") == null){
            int playcount = rs.getInt("playcount");
            String publicationDate = rs.getString("publicationDate");
            String description = rs.getString("description");
            Video video = new Video(performer, title, duration, playcount, publicationDate, description);
            tracks.add(video);
        } else {
            String album = rs.getString("album");
            Song song = new Song(performer, title, duration, album);
            tracks.add(song);
        }
        return tracks;
    }
}
