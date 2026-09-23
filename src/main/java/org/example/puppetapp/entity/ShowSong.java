package org.example.puppetapp.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "show_song")
public class ShowSong {

    @EmbeddedId
    private ShowSongId showSongId;

    @Column(name = "in_order")
    private int showOrder;

    @ManyToOne
    @MapsId("songId")
    @JoinColumn(name = "song_id")
    Song song;

    @ManyToOne
    @MapsId("showId")
    @JoinColumn(name = "show_id")
    Show show;
}
