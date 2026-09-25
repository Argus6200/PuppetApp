package org.example.puppetapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String originalSongName;
    private String songName;
    private String lightType;

    //@OneToMany(mappedBy = "song", cascade = CascadeType.ALL, orphanRemoval = true)
    //private Set<Part> parts = new HashSet<>();


    public Song(String originalSongName, String songName, String lightType) {
        this.originalSongName = originalSongName;
        this.songName = songName;
        this.lightType = lightType;
    }

    public Song() {
    }
}