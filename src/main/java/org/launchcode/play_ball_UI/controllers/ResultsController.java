package org.launchcode.play_ball_UI.controllers;



import org.launchcode.play_ball_UI.models.GamePlayer;
import org.launchcode.play_ball_UI.models.dataAccessObjects.GamePlayerDataAccessObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value= "/playball")
public class ResultsController {

    @Autowired
    GamePlayerDataAccessObject dao;

//    @GetMapping(value="/player")
//    public Iterable<GamePlayer> getPlayer(){
//        //Iterable<GamePlayer> player =  dao.getGamesPlayers(1982, null, null, null, "mcgew001");
//        return dao.getGamesPlayers(1982, null, null, null, "mcgew001");
//    }

    @GetMapping(value="/player")
    public List<GamePlayer> getPlayer(){
        List<GamePlayer> player =  dao.getGamesPlayers(1982, null, null, null, "mcgew001");
        return dao.getGamesPlayers(1982, null, null, null, "mcgew001");
    }
}

