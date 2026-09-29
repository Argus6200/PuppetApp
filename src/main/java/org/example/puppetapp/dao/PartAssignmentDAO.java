package org.example.puppetapp.dao;

import org.example.puppetapp.entity.PartAssignment;
import org.example.puppetapp.entity.PartAssignmentId;

public interface PartAssignmentDAO {

   PartAssignment findPAById(PartAssignmentId id);
}
