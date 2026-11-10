package org.example.puppetapp.Service;

import jakarta.transaction.Transactional;
import org.example.puppetapp.dao.ShowDAO;
import org.example.puppetapp.dao.ShowSongDAO;
import org.example.puppetapp.dto.ShowResponse;
import org.example.puppetapp.entity.Show;
import org.example.puppetapp.entity.ShowSong;
import org.example.puppetapp.entity.Song;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowService {

    ShowDAO showDAO;
    ShowSongDAO showSongDAO;

    public ShowService(ShowDAO showDAO,  ShowSongDAO showSongDAO) {
        this.showDAO = showDAO;
        this.showSongDAO = showSongDAO;
    }

    public ShowResponse getShowPage(int showId){

        Show show = showDAO.getShowById(showId);

        List<ShowSong> showSongs = showSongDAO.getShowSongs(showId);
        List<Song> songs = new ArrayList<>();

        for(ShowSong showSong : showSongs) {
            songs.add(showSong.getSong());
        }

        return new ShowResponse(show, songs);
    }

    public List<Show> getShowsPage(){
        return showDAO.getAllShows();
    }

    @Transactional
    public void AddShow(Show show){
        showDAO.AddShow(show);
    }

}
