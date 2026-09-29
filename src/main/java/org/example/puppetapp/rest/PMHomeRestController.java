package org.example.puppetapp.rest;

import org.example.puppetapp.dao.PartAssignmentDAO;
import org.example.puppetapp.dao.ShowSongDAO;
import org.example.puppetapp.dto.HomeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PMHomeRestController {

    private final ShowSongDAO showSongDAO;
    private final PartAssignmentDAO partAssignmentDAO;


    @GetMapping("/puppetmaster")
    public HomeResponse homePage(){

        HomeResponse response = new HomeResponse();

        return response;
    }
}
