package org.example.puppetapp.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.puppetapp.entity.ShowSong;
import org.example.puppetapp.entity.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ShowSongDAOImpl implements ShowSongDAO {

    private final EntityManager entityManager;

    @Autowired
    public ShowSongDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<ShowSong> getShowSongs(int show_id) {

        TypedQuery<ShowSong> theQuery =  entityManager.createQuery("from ShowSong WHERE showSongId.showId = :show_id order by showOrder", ShowSong.class);

        theQuery.setParameter("show_id", show_id);

        return theQuery.getResultList();
    }

}
