package org.example.puppetapp.dao;


import jakarta.persistence.EntityManager;
import org.example.puppetapp.entity.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class SongDAOImpl implements SongDAO{

    private EntityManager entityManager;

    @Autowired
    public SongDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    @Override
    @Transactional
    public void save(Song theSong) {
        entityManager.persist(theSong);
    }
}
