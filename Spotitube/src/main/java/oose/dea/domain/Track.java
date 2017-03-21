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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public Availability[] getAvailabilities() {
        return availabilities;
    }

    public void setAvailabilities(Availability[] availabilities) {
        this.availabilities = availabilities;
    }
}
