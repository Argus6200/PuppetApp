package org.example.puppetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ShowController {

    @GetMapping("/puppetmaster/shows")
    public String showsPage() {
        return "shows";
    }

    @GetMapping("/puppetmaster/show/{id}")
    public String showPage(){
        return "show";
    }
}
