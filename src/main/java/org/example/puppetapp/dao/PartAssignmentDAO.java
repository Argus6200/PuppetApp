package org.example.puppetapp.dao;

import org.example.puppetapp.entity.PartAssignment;
import org.example.puppetapp.entity.PartAssignmentId;

import java.util.List;

public interface PartAssignmentDAO {

   //Finding part assignment by id
   PartAssignment findPAById(PartAssignmentId id);

   //finds the list of assignments that the performer is in.
   List<PartAssignment> findPartAssignmentByShowAndPerformerId(int pAId, int pId);
}
