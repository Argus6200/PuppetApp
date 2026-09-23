package org.example.puppetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SongController {

    @GetMapping("/songs")
    public String songsPage() {
        return "songs";
    }
}
