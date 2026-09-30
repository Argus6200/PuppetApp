package org.example.puppetapp.dto;

import lombok.Getter;
import org.example.puppetapp.entity.Show;
import org.example.puppetapp.entity.Song;

import java.util.List;

@Getter
public class ShowResponse {

    private final Show show;
    private final List<Show> shows;
    private final List<Song> songs;

    public ShowResponse(Show show, List<Song> songs) {
        this.show = show;
        this.songs = songs;
        this.shows = null;
    }

    public ShowResponse(List<Show> shows) {
        this.shows = shows;
        this.show = null;
        this.songs = null;
    }
}