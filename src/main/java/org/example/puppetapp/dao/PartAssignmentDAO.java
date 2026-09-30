package org.example.puppetapp.dao;

import org.example.puppetapp.entity.PartAssignment;
import org.example.puppetapp.entity.PartAssignmentId;

import java.util.List;

public interface PartAssignmentDAO {

   PartAssignment findPAById(PartAssignmentId id);
   List<PartAssignment> findPartAssignmentByShowAndPerformerId(int pAId, int pId);
}
