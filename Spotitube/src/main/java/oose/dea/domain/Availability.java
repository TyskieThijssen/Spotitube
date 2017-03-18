package oose.dea.domain;

/**
 * Created by Thijs on 18-3-2017.
 */
public class Availability {
    private boolean offlineAvailable;
    private Playlist playlist;
    private Track track;

    public Availability(boolean offlineAvailable, Playlist playlist, Track track){
        this.offlineAvailable = offlineAvailable;
        this.playlist = playlist;
        this.track = track;
    }

    public void toggle(){
        //TODO IMPLEMENT
    }

    public boolean isOfflineAvailable(){
        //TODO IMPLEMENT
        return false;
    }
}
