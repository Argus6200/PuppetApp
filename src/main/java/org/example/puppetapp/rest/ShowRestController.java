package org.example.puppetapp.rest;

import org.example.puppetapp.dao.ShowDAO;
import org.example.puppetapp.dao.ShowSongDAO;
import org.example.puppetapp.dto.ShowResponse;
import org.example.puppetapp.entity.Show;
import org.example.puppetapp.entity.ShowSong;
import org.example.puppetapp.entity.Song;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ShowRestController {

    private final ShowDAO showDAO;
    private final ShowSongDAO showSongDAO;

    public ShowRestController(ShowDAO showDAO,  ShowSongDAO showSongDAO) {
        this.showDAO = showDAO;
        this.showSongDAO = showSongDAO;
    }

    @GetMapping("/puppetmaster/shows")
    public List<Show> getShows() {

        return showDAO.getAllShows();
    }

    @GetMapping("/puppetmaster/show/{showid}")
    public ShowResponse getShowById(@PathVariable int showid) {
        Show show = showDAO.getShowById(showid);

        List<ShowSong> showSongs = showSongDAO.getShowSongs(showid);

        List<Song> songs = new ArrayList<>();

        for(ShowSong showSong : showSongs) {
            songs.add(showSong.getSong());
        }

        return new ShowResponse(show, songs);
    }
}