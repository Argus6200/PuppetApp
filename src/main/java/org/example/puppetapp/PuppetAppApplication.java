package org.example.puppetapp;

import org.example.puppetapp.dao.SongDAO;
import org.example.puppetapp.entity.Song;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PuppetAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PuppetAppApplication.class, args);
    }


    @Bean
    public CommandLineRunner clr(SongDAO SongDAO){

    return runner -> {
        createSong(SongDAO);
        };
    }

    private void createSong(SongDAO songDAO) {

        Song tempSong = new Song("His love will go on","My heart will go on", "Spotlight");
        songDAO.save(tempSong);

        System.out.println("Song Id: " + tempSong.getId());
    }
}
