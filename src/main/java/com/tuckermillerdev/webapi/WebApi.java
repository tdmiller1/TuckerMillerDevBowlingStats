package com.tuckermillerdev.webapi;

//import com.tuckermillerdev.webapi.archive.Archive;
//import com.tuckermillerdev.webapi.archive.ArchiveRepository;
//import com.tuckermillerdev.webapi.player.PlayerRepositoy;
import com.tuckermillerdev.webapi.players.PlayerRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApi implements CommandLineRunner {

    @Autowired
    PlayerRepositoy playerRepositoy;

    public static void main(String[] args) {
        SpringApplication.run(WebApi.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }




}