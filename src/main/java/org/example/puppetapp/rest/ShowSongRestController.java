package org.example.puppetapp.rest;

import org.example.puppetapp.Service.ShowSongService;
import org.example.puppetapp.dao.ShowSongDAO;
import org.example.puppetapp.dto.AddShowSongRequest;
import org.example.puppetapp.entity.ShowSong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/puppetmaster")
public class ShowSongRestController {

    private ShowSongService showSongService;

    @Autowired
    public void setShowSongService(ShowSongService showSongService) {
        this.showSongService = showSongService;
    }

    @PostMapping("/ShowSong")
    public void AddShowSong(@RequestBody AddShowSongRequest request) {
        showSongService.addShowSong(
                request.getShowId(),
                request.getSongId(),
                request.getOrder()
        );
    }


}
