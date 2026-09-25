package org.example.puppetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ShowController {

    @GetMapping("/shows")
    public String showsPage() {
        return "shows";
    }

    @GetMapping("/show/{id}")
    public String showPage(){
        return "show";
    }
}
