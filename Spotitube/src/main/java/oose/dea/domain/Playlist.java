package oose.dea.domain;

/**
 * Created by Thijs on 18-3-2017.
 */
public class Playlist {
    private String owner;
    private String name;
    private Availability[] availabilities;

    public Playlist(){

    }

    public Playlist(String owner, String name){
        this.owner = owner;
        this.name = name;
    }

    public void addTrack(Track track){
        //TODO IMPLEMENT
    }

    public void changeName(String name){
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
