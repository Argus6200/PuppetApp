package org.example.puppetapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name="song")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int Id;

    @Column(name="song_name")
    private String songName;

    @Column(name="og_song_name")
    private String originalSongName;

    @Column(name="light_type")
    private String lightType;

    public Song(){

    }

    public Song(String songName, String originalSongName, String lightType) {
        this.songName = songName;
        this.originalSongName = originalSongName;
        this.lightType = lightType;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getOriginalSongName() {
        return originalSongName;
    }

    public void setOriginalSongName(String originalSongName) {
        this.originalSongName = originalSongName;
    }

    public String getLightType() {
        return lightType;
    }

    public void setLightType(String lightType) {
        this.lightType = lightType;
    }

    @Override
    public String toString() {
        return "Song{" +
                "Id=" + Id +
                ", songName='" + songName + '\'' +
                ", originalSongName='" + originalSongName + '\'' +
                ", lightType='" + lightType + '\'' +
                '}';
    }
}
