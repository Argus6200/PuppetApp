package org.example.puppetapp;

import org.example.puppetapp.dao.PartAssignmentDAO;
import org.example.puppetapp.dao.ShowDAO;
import org.example.puppetapp.dao.ShowSongDAO;
import org.example.puppetapp.dao.SongDAO;
import org.example.puppetapp.entity.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class PuppetAppApplication {

    static void main(String[] args) {
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
    @Bean
    public CommandLineRunner ShowSongclr(ShowSongDAO showSongDAO){

        return runner -> {
            getShowSongs(showSongDAO);
        };
    }
    @Bean
    public CommandLineRunner Showclr(ShowDAO showDAO){

        return runner -> {
            getShowById(showDAO);

        };
    }
    @Bean
    public CommandLineRunner partAssignmentclr(PartAssignmentDAO partAssignmentDAO) {

        return runner -> {

            findPAById(partAssignmentDAO);

        };
    }

    private void findPAById(PartAssignmentDAO partAssignmentDAO) {
        System.out.println("Begin findPAById");
        PartAssignmentId partId = new PartAssignmentId(1, 1);

        PartAssignment response = partAssignmentDAO.findPAById(partId);

        System.out.println(response.getShow().getLocation() + "\n" +
                response.getShow().getDate() + "\n" +
                response.getPerformer().getName() + "\n" +
                response.getPart().getSong().getSongName() + "\n" +
                response.getPart().getNotes());
        System.out.println("End findPAById\n");
    }

    private void getShowById(ShowDAO showDAO){
        System.out.println("Begin getShowById");
        Show showResult = showDAO.getShowById(1);

        System.out.println(showResult.getLocation() + " " + showResult.getDate());
        System.out.println("End getShowById\n");
    }

    private void getShowSongs(ShowSongDAO ShowSongDAO){
        System.out.println("Begin getShowSongs");
        List<ShowSong> songs = ShowSongDAO.getShowSongs(1);

        for  (ShowSong showSong : songs) {
            Song song = showSong.getSong();
            Show show = showSong.getShow();
            System.out.println(song.getSongName() + ": " + show.getId() +" order: "+ showSong.getShowOrder());
        }
        System.out.println("End getShowSongs\n");
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
            System.out.println(song.getSongName() + " " + song.getId() + " " + song.getLightType());
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
