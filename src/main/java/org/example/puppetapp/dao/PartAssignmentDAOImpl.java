package org.example.puppetapp.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.puppetapp.entity.PartAssignment;
import org.example.puppetapp.entity.PartAssignmentId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PartAssignmentDAOImpl implements PartAssignmentDAO {

    private final EntityManager entityManager;

    @Autowired
    public PartAssignmentDAOImpl(EntityManager entityManager) {this.entityManager = entityManager;}

    @Override
    public PartAssignment findPAById(PartAssignmentId id) {
        return entityManager.find(PartAssignment.class, id);
    }
}
