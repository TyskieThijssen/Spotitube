package oose.dea.domain;

/**
 * Created by Thijs on 18-3-2017.
 */
public class Song extends Track {
    private String album;

    public Song(String performer, String title, String url, long duration, Availability[] availabilities, String album) {
        super(performer, title, url, duration, availabilities);
        this.album = album;
    }

    @Override
    public void get(){
        //TODO IMPLEMENT
    }

    @Override
    public void set(){
        //TODO IMPLEMENT
    }
}