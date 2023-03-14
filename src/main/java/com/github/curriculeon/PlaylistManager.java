package com.github.curriculeon;


import java.util.Arrays;
import java.util.List;

public class PlaylistManager {
    private Playlist playlist;

    public PlaylistManager(String[] songs) {
        for (String song:songs) {


        }
    }

    public PlaylistManager(List<String> songs) {
    }

    public PlaylistManager() {
        playlist = new Playlist(new String[0]);

    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    private void setPlaylist(String[] toArray) {

    }

    public void addSong(String songToAdd) {




    }

    public void removeSong(String songToRemove) {
    }

    public void printAll() {
    }
}
