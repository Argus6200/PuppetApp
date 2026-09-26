package org.example.puppetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PerformerController {

    @GetMapping("/puppetmaster/performer/{id}")
    public String ShowPerformer(){
        return "performer";
    }
}
