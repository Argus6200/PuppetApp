package org.example.puppetapp.rest;

import org.example.puppetapp.entity.Show;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShowRestController {

    private List<Show> theShows;

    @GetMapping("/shows")
    public List<Show> getShows() {

        return theShows;
    }

    @GetMapping("/shows/{showId}")
    public Show getShowById(@PathVariable int showId) {
        return theShows.get(showId);
    }
}