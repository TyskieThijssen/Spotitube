package oose.dea.domain;

import java.sql.Time;
import java.util.Calendar;

/**
 * Created by Thijs on 18-3-2017.
 */
public class Video extends Track {
    private int playCount;
    private String publicationDate;
    private String description;

    public Video(String performer, String title, Time duration, int playCount, String publicationDate, String description) {
        super(performer, title, duration);
        this.playCount = playCount;
        this.publicationDate = publicationDate;
        this.description = description;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
