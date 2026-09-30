package org.example.puppetapp.dto;

import lombok.Getter;
import org.example.puppetapp.entity.PartAssignment;
import java.util.List;

@Getter
public class HomeResponse {
    private final ShowResponse show;
    private final List<PartAssignment> assignments;

    public HomeResponse(ShowResponse show, List<PartAssignment> assignments) {
        this.show = show;
        this.assignments = assignments;
    }

}
