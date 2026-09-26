package org.example.puppetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/puppetmaster")
    public String ShowHome() {
        return "PuppetMasterHome";
    }
}
