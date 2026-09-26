package org.example.puppetapp.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.puppetapp.entity.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PerformerDAOImpl implements PerformerDAO {

    private final EntityManager entityManager;

    @Autowired
    public PerformerDAOImpl(EntityManager entityManager) {this.entityManager = entityManager;}

    public Performer getPerformerById(int id) {

        TypedQuery<Performer> query = entityManager.createQuery("from Performer p where p.id = :performer", Performer.class);

        query.setParameter("performer", id);

        return query.getSingleResult();
    }

    public List<Performer> getPerformers() {
        return List.of();
    }
}
