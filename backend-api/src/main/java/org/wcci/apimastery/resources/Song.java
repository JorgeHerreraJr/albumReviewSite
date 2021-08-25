package org.wcci.apimastery.resources;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Song {

    @Id
    @GeneratedValue
    private Long id;

    
    private String trackTitle;
    private String trackLink;
    private String trackDuration;
    private int trackRating;

    @ManyToOne
    @JsonIgnore
    private Album album;
    
    @Lob
    @ElementCollection
    private Collection<String> songComments = new ArrayList<String>();

    public Song(Album album, String trackTitle, String trackLink, String trackDuration, int trackRating) {
        this.album = album;
        this.trackTitle = trackTitle;
        this.trackLink = trackLink;
        this.trackDuration = trackDuration;
        this.trackRating = trackRating;
    }

    protected Song() {}

    public void addComment(String songComment) {
        songComments.add(songComment);
    }

    public void changeAlbum(Album album) {
        this.album = album;
    }

    public Long getId() {
        return id;
    }

    public String getTrackTitle() {
        return trackTitle;
    }

    public String getTrackLink() {
        return trackLink;
    }

    public String getTrackDuration() {
        return trackDuration;
    }

    public int getTrackRating() {
        return trackRating;
    }

    public Album getAlbum() {
        return album;
    }

    public Collection<String> getSongComments() {
        return songComments;
    }

    // "Updaters"


    public void updateTrackTitle(String trackTitle) {
        this.trackTitle = trackTitle;
    }

    public void updateTrackLink(String trackLink) {
        this.trackLink = trackLink;
    }

    public void updateTrackDuration(String trackDuration) {
        this.trackDuration = trackDuration;
    }

    public void updateTrackRating(int trackRating) {
        this.trackRating = trackRating;
    }
}
