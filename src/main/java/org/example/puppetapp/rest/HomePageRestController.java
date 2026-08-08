package org.example.puppetapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HomePageRestController {

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/home")
    public String sayHello(){
        return "Index.html";
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo(){return "Team Name: " + teamName;}
}
