package org.example.puppetapp.rest;

import org.example.puppetapp.Service.ShowService;
import org.example.puppetapp.dto.ShowResponse;
import org.example.puppetapp.entity.Show;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/puppetmaster")
public class ShowRestController {

    private final ShowService showService;

    public ShowRestController(ShowService showService) {
        this.showService = showService;
    }

    @GetMapping("/shows")
    public List<Show> getShows() {
        return showService.getShowsPage();
    }

    @GetMapping("/show/{showId}")
    public ShowResponse getShowById(@PathVariable int showId) {
        return showService.getShowPage(showId);
    }

    @PostMapping("/shows")
    public void AddShow(@RequestBody Show show){
        showService.AddShow(show);
    }
}