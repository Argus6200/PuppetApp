package org.example.puppetapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode
public class ShowSongId {

    @Column(name = "show_id")
    private int showId;

    @Column(name = "song_id")
    private int songId;
}
