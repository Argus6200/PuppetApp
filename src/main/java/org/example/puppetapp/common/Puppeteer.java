package org.example.puppetapp.common;

import org.springframework.stereotype.Component;


@Component
public class Puppeteer implements Person {

    @Override
    public String getName() {
        return "Name";
    }
}
