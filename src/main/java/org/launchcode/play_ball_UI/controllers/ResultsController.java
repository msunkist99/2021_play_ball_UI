package org.launchcode.play_ball_UI.controllers;

import org.launchcode.play_ball_UI.models.GamePlayer;
import org.launchcode.play_ball_UI.models.dataAccessObjects.GamePlayerDataAccessObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value= "/playball/results")
public class ResultsController {

    @Autowired
    GamePlayerDataAccessObject dao;


    @GetMapping(value="/player")
    public String getPlayer(Model model){
//        Iterable<GamePlayer> gamesPlayer = dao.getGamesPlayers(1982, null, null, null, "mcgew001");
        Iterable<GamePlayer> gamesPlayer = dao.getGamesPlayers(1982, null, null, null, "vuckp001");

        for (GamePlayer gamePlayer : gamesPlayer) {
            gamePlayer.getGameId();
        }


        model.addAttribute("title", "Play Ball - Player");
        model.addAttribute("gamesPlayer", gamesPlayer);

        return "player";
    }

    @GetMapping(value="/game")
    public String getGame(Model model){
//        Iterable<GamePlayer> gamesPlayer = dao.getGamesPlayers(1982, "SLN198210200", null, null, null);
//        Iterable<GamePlayer> gamesPlayer = dao.getGamesPlayers(2015, "SLN201505020", null, null, null);
        Iterable<GamePlayer> gamesPlayer = dao.getGamesPlayers(1982, "CAL198210060", null, null, null);
        for (GamePlayer gamePlayer : gamesPlayer) {
            gamePlayer.getGameId();
        }


        model.addAttribute("title", "Play Ball - Game");
        model.addAttribute("gamesPlayer", gamesPlayer);

        return "game";
    }
}

