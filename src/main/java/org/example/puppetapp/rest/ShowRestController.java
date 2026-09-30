package org.example.puppetapp.rest;

import org.example.puppetapp.Service.ShowService;
import org.example.puppetapp.dto.ShowResponse;
import org.example.puppetapp.entity.Show;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShowRestController {

    private final ShowService showService;

    public ShowRestController(ShowService showService) {
        this.showService = showService;
    }

    @GetMapping("/puppetmaster/shows")
    public List<Show> getShows() {
        return showService.getShowsPage();
    }

    @GetMapping("/puppetmaster/show/{showId}")
    public ShowResponse getShowById(@PathVariable int showId) {
        return showService.getShowPage(showId);
    }
}