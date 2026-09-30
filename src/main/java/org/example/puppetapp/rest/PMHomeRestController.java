package org.example.puppetapp.rest;

import org.example.puppetapp.Service.HomeService;
import org.example.puppetapp.dto.HomeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PMHomeRestController {

    private final HomeService homeService;

    public PMHomeRestController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/puppetmaster")
    public HomeResponse homePage(){

        int currentPId = 1;

        return homeService.getPMHomePage(currentPId);
    }
}
