package org.example.puppetapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode
public class PartAssignmentId {

    @Column(name = "part_id")
    private int partId;

    @Column(name = "show_id")
    private int showId;

    public PartAssignmentId() {
    }
    public PartAssignmentId(int partId, int showId) {
        this.partId = partId;
        this.showId = showId;
    }
}
