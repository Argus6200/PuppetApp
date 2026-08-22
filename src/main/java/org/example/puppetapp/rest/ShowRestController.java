package org.example.puppetapp.rest;

import jakarta.annotation.PostConstruct;
import org.example.puppetapp.entity.Show;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ShowRestController {

    private List<Show> theShows;

    @PostConstruct
    public void load(){

        theShows = new ArrayList<>();

        theShows.add(new Show ("Lockbourne", 12));
        theShows.add(new Show ("Darbydale", 10));
        theShows.add(new Show ("GroveCity", 13));

    }

    @GetMapping("/shows")
    public List<Show> getShows(){

        return theShows;
    }

    @GetMapping("/shows/{showId}")
    public Show getShowById(@PathVariable int showId){

        if (showId >= theShows.size() || showId < 0){
            throw new ShowNotFoundException("Show of Id " + showId + " not found.");
        }

        return theShows.get(showId);
    }

    @ExceptionHandler
    public ResponseEntity<ShowErrorResponse> handleException(ShowNotFoundException exc){

        ShowErrorResponse error = new ShowErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ShowErrorResponse> handleException(Exception exc){

        ShowErrorResponse error = new ShowErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

    }
}
