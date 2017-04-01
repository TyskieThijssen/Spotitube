package oose.dea.domain;

import java.sql.Time;

/**
 * Created by Thijs on 18-3-2017.
 */
public class Track {
    private String performer;
    private String title;
    private Time duration;
    private Availability[] availabilities;

    public Track(String performer, String title, Time duration){
        this.performer = performer;
        this.title = title;
        this.duration = duration;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public Availability[] getAvailabilities() {
        return availabilities;
    }

    public void setAvailabilities(Availability[] availabilities) {
        this.availabilities = availabilities;
    }
}
