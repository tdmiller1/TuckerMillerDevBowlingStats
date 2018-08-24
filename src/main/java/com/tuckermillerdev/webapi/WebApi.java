package com.tuckermillerdev.webapi;

//import com.tuckermillerdev.webapi.archive.Archive;
//import com.tuckermillerdev.webapi.archive.ArchiveRepository;
//import com.tuckermillerdev.webapi.player.PlayerRepositoy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class WebApi implements CommandLineRunner {

    //@Autowired
    //PlayerRepositoy playerRepositoy;

    //@Autowired
    //ArchiveRepository archiveRepository;

    public static void main(String[] args) {
        SpringApplication.run(WebApi.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
//        Game game = new Game("1", "Lakin Lane", 120, sdf1.parse("12-12-2017"));
//        List<Game> games = null;
//        games.add(game);
//        Archive archive = new Archive("1", "Lakin Lane", games);
    }




}