package org.example.puppetapp.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.puppetapp.entity.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShowDAOImpl implements ShowDAO {

    private final EntityManager entityManager;

    @Autowired
    public ShowDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Show getShowById(int showId) {

        TypedQuery<Show> query = entityManager.createQuery("from Show s where s.id = :showId", Show.class);

        query.setParameter("showId", showId);

        return query.getSingleResult();
    }
}
