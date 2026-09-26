package org.example.puppetapp.rest;

import org.example.puppetapp.dao.PerformerDAO;
import org.example.puppetapp.entity.Performer;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class ProfileRestController {

    private final PerformerDAO performerDAO;

    public ProfileRestController(PerformerDAO performerDAO) {
        this.performerDAO = performerDAO;
    }

    @GetMapping("/puppetmaster/performer/{performerId}")
    public Performer getPerformer(@PathVariable int  performerId) {
        Performer performer = performerDAO.getPerformerById(performerId);

        return performer;
    }

}
