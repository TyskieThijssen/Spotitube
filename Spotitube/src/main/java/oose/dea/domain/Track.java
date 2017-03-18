package oose.dea.domain;

/**
 * Created by Thijs on 18-3-2017.
 */
public class Track {
    private String performer;
    private String title;
    private String url;
    private long duration;
    private Availability[] availabilities;

    public Track(String performer, String title, String url, long duration, Availability[] availabilities){
        this.performer = performer;
        this.title = title;
        this.url = url;
        this.duration = duration;
        this.availabilities = availabilities;
    }

    public void get(){
        //TODO IMPLEMENT
    }

    public void set(){
        //TODO IMPLEMENT
    }
}
