package org.example.puppetapp.dao;

import org.example.puppetapp.entity.Performer;

import java.util.List;

public interface PerformerDAO {

    Performer getPerformerById(int id);

    List<Performer> getPerformers();

}
