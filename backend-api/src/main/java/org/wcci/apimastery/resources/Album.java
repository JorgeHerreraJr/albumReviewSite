package org.wcci.apimastery.resources;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

@Entity
public class Album {

    @Id
    @GeneratedValue
    private Long id;

    private String albumTitle;
    private String albumArtist;
    private String albumArt;
    private String albumLabel;
    private int albumRating;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Song> songs = new ArrayList<Song>();

    @Lob
    @ElementCollection
    private Collection<String> albumComments = new ArrayList<String>();

    public Album(String albumTitle, String albumArtist, String albumArt, String albumLabel, int albumRating,
            Song... songs) {
        this.albumTitle = albumTitle;
        this.albumArtist = albumArtist;
        this.albumArt = albumArt;
        this.albumLabel = albumLabel;
        this.albumRating = albumRating;
        this.songs = Set.of(songs);
    }

    protected Album() {}

    public void addComment(String albumComment) {
        albumComments.add(albumComment);
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public String getAlbumArtist() {
        return albumArtist;
    }

    public String getAlbumArt() {
        return albumArt;
    }

    public String getAlbumLabel() {
        return albumLabel;
    }

    public int getAlbumRating() {
        return albumRating;
    }

    public Collection<Song> getSongs() {
        return songs;
    }

    public Collection<String> getAlbumComments() {
        return albumComments;
    }

    // "Updaters"
    public void updateAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public void updateAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
    }

    public void updateAlbumArt(String albumArt) {
        this.albumArt = albumArt;
    }

    public void updateAlbumLabel(String albumLabel) {
        this.albumLabel = albumLabel;
    }

    public void updateAlbumRating(int albumRating) {
        this.albumRating = albumRating;
    }

}
