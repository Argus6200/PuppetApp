package org.example.puppetapp.dao;

import org.example.puppetapp.entity.ShowSong;

import java.util.List;

public interface ShowSongDAO {

    List<ShowSong> getShowSongs(int showId);


}
