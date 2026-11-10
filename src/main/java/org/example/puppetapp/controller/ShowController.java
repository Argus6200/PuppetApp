package org.example.puppetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ShowController {

    //General show page including all shows with minimal data.
    @GetMapping("/puppetmaster/shows")
    public String showsPage() {
        return "shows";
    }

    //Specific show page.
    @GetMapping("/puppetmaster/show/{id}")
    public String showPage(){
        return "show";
    }
}
