package oose.dea.domain;

/**
 * Created by Thijs on 18-3-2017.
 */
public class Playlist {
    private String owner;
    private String name;
    private Availability[] availabilities;

    public Playlist(String owner, String name, Availability[] availabilities){
        this.owner = owner;
        this.name = name;
        this.availabilities = availabilities;
    }

    public void addTrack(Track track){
        //TODO IMPLEMENT
    }

    public void changeName(String name){
        //TODO IMPLEMENT
        this.name = name;
    }
}
