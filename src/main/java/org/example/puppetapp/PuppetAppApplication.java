package org.example.puppetapp;

import org.example.puppetapp.dao.SongDAO;
import org.example.puppetapp.entity.Song;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class PuppetAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PuppetAppApplication.class, args);
    }


    @Bean
    public CommandLineRunner clr(SongDAO SongDAO){

    return runner -> {

        //createSong(SongDAO);

        //readSong(SongDAO);

        //queryForSongs(SongDAO);

        //findBySongName(SongDAO);

        //updateSong(SongDAO);

        //deleteSong(SongDAO);

        //deleteAllSongs(SongDAO);
        };
    }

    private void deleteAllSongs(SongDAO songDAO){
        int num = songDAO.deleteAllSongs();
        System.out.println("Num Rows Deleted: " + num);
    }

    private void deleteSong(SongDAO songDAO) {
        int Id = 1;
        songDAO.deleteSong(Id);

    }

    private void updateSong(SongDAO songDAO) {
        int id = 1;
        Song theSong = songDAO.findById(id);

        theSong.setSongName("The Best Song");

        songDAO.updateSong(theSong);

        System.out.println(theSong);

    }

    private void findBySongName(SongDAO songDAO) {

    List<Song> theSong = songDAO.findBySongName("His Love Will go on");
    }

    private void queryForSongs(SongDAO songDAO) {

        List<Song> allSongs = songDAO.findAll();

        for(Song song : allSongs){
            System.out.println(song);
        }
    }

    private void readSong(SongDAO songDAO) {

    }

    private void createSong(SongDAO songDAO) {

        Song tempSong = new Song("His love will go on","My heart will go on", "Spotlight");

        songDAO.save(tempSong);

        System.out.println(tempSong);

        System.out.println("Song Id: " + tempSong.getId());
    }
}
