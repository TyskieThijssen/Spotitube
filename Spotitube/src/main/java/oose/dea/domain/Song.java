package oose.dea.domain;

import java.sql.Time;

/**
 * Created by Thijs on 18-3-2017.
 */
public class Song extends Track {
    private String album;

    public Song(String performer, String title, Time duration, String album) {
        super(performer, title, duration);
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
