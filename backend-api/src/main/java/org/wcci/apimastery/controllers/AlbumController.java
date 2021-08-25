package org.wcci.apimastery.controllers;

import org.springframework.web.bind.annotation.*;
import org.wcci.apimastery.resources.Album;
import org.wcci.apimastery.resources.Song;
import org.wcci.apimastery.storage.AlbumStorage;
import org.wcci.apimastery.storage.SongRepository;
import org.wcci.apimastery.storage.SongStorage;

// TODO: Refactor songRepo references to songStorage

@RestController
public class AlbumController {

    private AlbumStorage albumStorage;
    private SongRepository songRepo;
    private SongStorage songStorage;

    public AlbumController(AlbumStorage albumStorage, SongStorage songStorage, SongRepository songRepo) {
        this.albumStorage = albumStorage;
        this.songStorage = songStorage;
        this.songRepo = songRepo;
    }

    @GetMapping("/api/albums")
    public Iterable<Album> retrieveAllAlbums() {
        return albumStorage.retrieveAllAlbums();
    }

    @GetMapping("/api/albums/{id}")
    public Album retriveAlbumById(@PathVariable Long id) {
        return albumStorage.retrieveAlbumById(id);
    }

    @DeleteMapping("/api/albums/{id}")
    public Iterable<Album> deleteAlbumById(@PathVariable Long id) {
        albumStorage.deleteAlbumById(id);
        return albumStorage.retrieveAllAlbums();
    }

    @PostMapping("/api/albums")
    public Iterable<Album> addNewAlbum(@RequestBody Album albumToAdd) {
        albumStorage.saveAlbum(albumToAdd);
        return albumStorage.retrieveAllAlbums();
    }

    @PutMapping("/api/albums/{id}")
    public Album modifyAlbum(@PathVariable Long id, @RequestBody Album albumToModify) {

        Album albumToChange = albumStorage.retrieveAlbumById(id);
        albumToChange.updateAlbumTitle(albumToModify.getAlbumTitle());
        albumToChange.updateAlbumArtist(albumToModify.getAlbumArtist());
        albumToChange.updateAlbumArt(albumToModify.getAlbumArt());
        albumToChange.updateAlbumLabel(albumToModify.getAlbumLabel());
        albumToChange.updateAlbumRating(albumToModify.getAlbumRating());
        albumStorage.saveAlbum(albumToChange);

        return albumStorage.retrieveAlbumById(id);
    }

    @PatchMapping("/api/albums/{id}/songs")
    public Album addSongToAlbum(@PathVariable Long id, @RequestBody Song songToAdd) {
        Album albumToChange = albumStorage.retrieveAlbumById(id);
        songToAdd.changeAlbum(albumToChange);
        songRepo.save(songToAdd);
        albumToChange.addSong(songToAdd);
        albumStorage.saveAlbum(albumToChange);
        albumToChange = albumStorage.retrieveAlbumById(id);
        return albumToChange;
    }

    @DeleteMapping("/api/albums/{id}/songs/{songId}")
    public Album deleteSongFromAlbum(@PathVariable Long id, @PathVariable Long songId) {
        Album albumToChange = albumStorage.retrieveAlbumById(id);
        Song songToDelete = songRepo.findById(songId).get();
        albumToChange.removeSong(songToDelete);
        songRepo.deleteById(songId);
        albumStorage.saveAlbum(albumToChange);
        return albumToChange;
    }

    @PutMapping("/api/albums/{albumId}/songs/{songId}")
    public Song modifySong(@PathVariable Long albumId, @PathVariable Long songId, @RequestBody Song songToChange) {

        Song songToModify = songStorage.retrieveSongById(songId);
        
        songToModify.updateTrackTitle(songToChange.getTrackTitle());
        songToModify.updateTrackLink(songToChange.getTrackLink());
        songToModify.updateTrackDuration(songToChange.getTrackDuration());
        songToModify.updateTrackRating(songToChange.getTrackRating());

        songStorage.saveSong(songToModify);
        songToModify = songStorage.retrieveSongById(songId);
        
        return songToModify;
    }


    @PatchMapping("/api/albums/{id}/comments")
    public Album addCommentToAlbum(@PathVariable Long id, @RequestBody String commentToAdd) {
        Album albumToChange = albumStorage.retrieveAlbumById(id);
        albumToChange.addComment(commentToAdd);
        albumStorage.saveAlbum(albumToChange);
        return albumToChange;
    }

    @PatchMapping("/api/songs/{id}/comments")
    public Song addCommentToSong(@PathVariable Long id, @RequestBody String commentToAdd) {
        Song songToChange = songStorage.retrieveSongById(id);
        songToChange.addComment(commentToAdd);
        songStorage.saveSong(songToChange);
        return songToChange;
    }

}
