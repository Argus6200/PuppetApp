package org.example.puppetapp.Service;

import org.example.puppetapp.dao.ShowDAO;
import org.example.puppetapp.dao.ShowSongDAO;
import org.example.puppetapp.dao.SongDAO;
import org.example.puppetapp.entity.Show;
import org.example.puppetapp.entity.ShowSong;
import org.example.puppetapp.entity.ShowSongId;
import org.example.puppetapp.entity.Song;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ShowSongService {

    private final ShowSongDAO showSongDAO;
    private final ShowDAO showDAO;
    private final SongDAO songDAO;

    public ShowSongService(ShowSongDAO showSongDAO, ShowDAO showDAO, SongDAO songDAO) {
        this.showSongDAO = showSongDAO;
        this.showDAO = showDAO;
        this.songDAO = songDAO;
    }

    @Transactional
    public void addShowSong(int showId, int songId, int order) {
        Show show = showDAO.getShowById(showId);
        Song song = songDAO.findById(songId);

        ShowSong showSong = new ShowSong();

        ShowSongId showSongId = new ShowSongId();
        showSong.setShowSongId(showSongId);

        showSong.setShow(show);
        showSong.setSong(song);
        showSong.setShowOrder(order);

        showSongDAO.addShowSong(showSong);

        showSongDAO.addShowSong(showSong);
    }

}
