package org.example.puppetapp.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.puppetapp.entity.PartAssignment;
import org.example.puppetapp.entity.PartAssignmentId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PartAssignmentDAOImpl implements PartAssignmentDAO {

    private final EntityManager entityManager;

    @Autowired
    public PartAssignmentDAOImpl(EntityManager entityManager) {this.entityManager = entityManager;}

    //finds part assignment by id.
    @Override
    public PartAssignment findPAById(PartAssignmentId id) {
        return entityManager.find(PartAssignment.class, id);
    }

    //finds the parts that a person is in for the next show.
    @Override
    public List<PartAssignment> findPartAssignmentByShowAndPerformerId(int showId, int performerId) {

        TypedQuery<PartAssignment> query = entityManager.createQuery(
                "SELECT p FROM PartAssignment p WHERE p.show.id = :theShowId AND p.performer.id = :thePerformerId",
                PartAssignment.class);

        query.setParameter("theShowId", showId);
        query.setParameter("thePerformerId", performerId);

        return query.getResultList();

    }
}
