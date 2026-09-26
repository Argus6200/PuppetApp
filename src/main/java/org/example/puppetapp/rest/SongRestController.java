package org.example.puppetapp.rest;

import org.example.puppetapp.dao.SongDAO;
import org.example.puppetapp.entity.Song;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class SongRestController {

    private final SongDAO SongDAO;

    public SongRestController(SongDAO SongDAO){
        this.SongDAO = SongDAO;
    }

    @GetMapping("/puppetmaster/songs")
    public List<Song> getSongs(){

        return SongDAO.findAll();
    }

}
