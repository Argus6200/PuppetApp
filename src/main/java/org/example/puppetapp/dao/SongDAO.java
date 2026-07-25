package org.example.puppetapp.dao;

import org.example.puppetapp.entity.Song;

public interface SongDAO {

    //Method for saving/creating objects using JPA
    void save(Song theSong);

    //creating the method for querying objects using JPA
    Song findbyId(Integer id);
}
