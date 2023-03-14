package com.github.curriculeon;

import java.util.Arrays;
import java.util.List;

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
        return songs;
    }

    public String getCurrentSelection() {
        return songs[index];
    }

    public void goToPreviousSong() {
        if (index == 0) {
            index = songs.length-1;
        } else {
            index--;
        }
    }

    public void goToNextSong() {
        Integer lastIndex = songs.length-1;
        if (index == lastIndex) {
            index = 0;
        } else {
            index++;
        }
    }

    public Integer getMinimumNumberOfStepsBetween(Integer currentIndex, String desiredSong) {
        Integer distanceFromRight = getForwardNumberOfStepsBetween(currentIndex,desiredSong);
        Integer distanceFromLeft = getBackwardNumberOfStepsBetween(currentIndex,desiredSong);

        return Math.min(distanceFromLeft,distanceFromRight);
    }

    public Integer getNumberOfStepsBetween(Integer currentIndex, String desiredSong, Runnable directionMutator) {
        return null;
    }

    public Integer getForwardNumberOfStepsBetween(Integer currentIndex, String desiredSong) {
       Integer desiredIndex =  Arrays.asList(songs).indexOf(desiredSong);
       if (currentIndex<desiredIndex) {
           return Math.abs(currentIndex - desiredIndex);
       } else if(currentIndex>desiredIndex){
           return songs.length - (currentIndex-desiredIndex);
       }

        return 0;
    }

    public Integer getBackwardNumberOfStepsBetween(Integer currentIndex, String desiredSong) {
        List<String> songsList = Arrays.asList(songs);
        Integer desiredIndex = songsList.lastIndexOf(desiredSong);
        if (currentIndex>desiredIndex) {
            return currentIndex - desiredIndex;
        } else if (currentIndex<desiredIndex) {
            Integer length = songs.length;
            Integer difference = Math.abs(currentIndex - desiredIndex);
            return length-difference;

        }
        return 0;
    }
}
