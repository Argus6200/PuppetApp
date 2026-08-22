package org.example.puppetapp.entity;

public class Show {

    private String location;
    private int numberOfSongs;

    public Show(){

    }

    public Show(String location, int numberOfSongs) {
        this.location = location;
        this.numberOfSongs = numberOfSongs;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }
}
