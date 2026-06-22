package org.example.puppetapp.rest;

import org.example.puppetapp.common.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final Person person;

    @Autowired
    public DemoController(@Qualifier("puppeteer") Person person){
        this.person = person;

    }
    @GetMapping("/people")
    public String GetPeople(){
        return person.getName();

    }
}

