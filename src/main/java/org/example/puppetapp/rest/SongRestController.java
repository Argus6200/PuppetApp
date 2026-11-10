package org.example.puppetapp.rest;

import jakarta.transaction.Transactional;
import org.example.puppetapp.dao.SongDAO;
import org.example.puppetapp.entity.Song;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/puppetmaster")
@RestController
public class SongRestController {

    private final SongDAO songDAO;

    public SongRestController(SongDAO SongDAO){
        this.songDAO = SongDAO;
    }

    @GetMapping("/songs")
    public List<Song> getSongs(){

        return songDAO.findAll();
    }

    @PostMapping("/songs")
    @Transactional
    public Song addSong(@RequestBody Song song) {
        songDAO.addSong(song);
        return song;
    }

}
