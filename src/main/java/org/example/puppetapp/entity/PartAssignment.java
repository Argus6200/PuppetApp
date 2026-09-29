package org.example.puppetapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "part_assignment")
public class PartAssignment {

    @EmbeddedId
    private PartAssignmentId partAssignmentId;

    @ManyToOne
    @MapsId("showId")
    @JoinColumn(name = "show_id")
    private Show show;

    @ManyToOne
    @MapsId("partId")
    @JoinColumn(name = "part_id")
    private Part part;

    @ManyToOne
    @JoinColumn(name = "performer_id")
    private Performer performer;
}
