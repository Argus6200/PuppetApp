package org.example.puppetapp.dao;

import org.example.puppetapp.entity.Song;

import java.util.List;

public interface SongDAO {

    //Method for saving/creating objects using JPA
    void save(Song theSong);

    //creating the method for querying objects using JPA
    Song findById(Integer id);

    //Interface method for querying for all SQL objects
    List<Song> findAll();
}
