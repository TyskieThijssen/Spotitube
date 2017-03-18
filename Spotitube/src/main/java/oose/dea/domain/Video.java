package oose.dea.domain;

import java.util.Calendar;

/**
 * Created by Thijs on 18-3-2017.
 */
public class Video extends Track {
    private int playCount;
    private Calendar publicationDate;
    private String description;

    public Video(String performer, String title, String url, long duration, Availability[] availabilities, int playCount, Calendar publicationDate, String description) {
        super(performer, title, url, duration, availabilities);
        this.playCount = playCount;
        this.publicationDate = publicationDate;
        this.description = description;
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
