package org.example.puppetapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String puppetPosition;
    private String stageLocation;

    @Column(columnDefinition = "TEXT")
    private String notes;

    @ManyToOne
    @JoinColumn(name = "song_id", nullable = false)
    private Song song;

    @ManyToOne(optional = true)
    @JoinColumn(name = "performer_id", nullable = true)
    private Performer performer;

    public Part(String puppetPosition, String stageLocation, String notes, Performer performer) {
        this.puppetPosition = puppetPosition;
        this.stageLocation = stageLocation;
        this.notes = notes;
        this.performer = performer;
    }

    public Part() {

    }
}