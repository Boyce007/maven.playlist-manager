package com.github.curriculeon;

/**
 * Created by leon on 1/10/2021.
 */
public class Playlist {
    private String[] songs;
    private Integer index;
    public Playlist(String[] songNameArray) {
        index = 0;

        songs = songNameArray;
    }

    public Playlist(int currentIndex, String[] songNameArray) {
        index = currentIndex;
        songs = songNameArray;
    }

    public String[] getSongNameArray() {
        return null;
    }

    public String getCurrentSelection() {
        return null;
    }

    public void goToPreviousSong() {
    }

    public void goToNextSong() {
    }

    public Integer getMinimumNumberOfStepsBetween(Integer currentIndex, String desiredSong) {
        return null;
    }

    public Integer getNumberOfStepsBetween(Integer currentIndex, String desiredSong, Runnable directionMutator) {
        return null;
    }

    public Integer getForwardNumberOfStepsBetween(Integer currentIndex, String desiredSong) {
        return null;
    }

    public Integer getBackwardNumberOfStepsBetween(Integer currentIndex, String desiredSong) {
        return null;
    }
}
