package org.example.puppetapp.Service;

import org.example.puppetapp.dao.PartAssignmentDAO;
import org.example.puppetapp.dao.ShowDAO;
import org.example.puppetapp.dao.ShowSongDAO;
import org.example.puppetapp.dto.HomeResponse;
import org.example.puppetapp.dto.ShowResponse;
import org.example.puppetapp.entity.PartAssignment;
import org.example.puppetapp.entity.Show;
import org.example.puppetapp.entity.ShowSong;
import org.example.puppetapp.entity.Song;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    ShowDAO showDAO;
    ShowSongDAO showSongDAO;
    PartAssignmentDAO partAssignmentDAO;

    public HomeService(ShowDAO showDAO, ShowSongDAO showSongDAO, PartAssignmentDAO partAssignmentDAO) {

        this.showDAO = showDAO;
        this.showSongDAO = showSongDAO;
        this.partAssignmentDAO = partAssignmentDAO;
    }

    public HomeResponse getPMHomePage(int performerId){

        Show show = showDAO.findNextShow();

        List<ShowSong> showSongs = showSongDAO.getShowSongs(show.getId());

        List<Song> songs = new ArrayList<>();

        for(ShowSong showSong : showSongs) {
            songs.add(showSong.getSong());
        }

        List<PartAssignment> assignments = partAssignmentDAO.findPartAssignmentByShowAndPerformerId(show.getId(), performerId);

        ShowResponse showResponse = new ShowResponse(show, songs);

        return new HomeResponse(showResponse, assignments);

    }

}
