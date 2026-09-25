package org.example.puppetapp.dao;

import org.example.puppetapp.entity.Show;

import java.util.List;

public interface ShowDAO {

    Show getShowById(int showId);

    List<Show> getAllShows();
}
