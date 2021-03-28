package org.launchcode.play_ball_UI.controllers;

import org.launchcode.play_ball_UI.models.*;
import org.launchcode.play_ball_UI.models.dataAccessObjects.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
//@RequestMapping(value= "/playball/query")
public class QueryController {
    @Autowired
    YearDataAccessObject daoYear;

    @Autowired
    YearGameTypeDataAccessObject daoYearGameType;

    @Autowired
    YearGameTypeGameDataAccessObject daoYearGameTypeGame;

    @Autowired
    YearGameTypePlayerDataAccessObject daoYearGameTypePlayer;

    @Autowired
    GamePlayerDataAccessObject dao;

    @GetMapping(value = "playball/query")
    public String getQuery(Model model) {
        Iterable<Year> years = daoYear.getYearsData();
        model.addAttribute("year", 0);
        model.addAttribute("years", years);
        return "queryYear";
    }

    @GetMapping(value = "playball/queryGameType", params = "year")
    public String getQueryGameType(@RequestParam int year, Model model) {
        model.addAttribute("year", year);

        Iterable<YearGameType> yearGameTypes = daoYearGameType.getYearGameTypesData(year);
        model.addAttribute("gameTypes", yearGameTypes);

        return "queryGameType";
    }

    @GetMapping(value = "playball/queryGames")
    public String getQueryGames(@RequestParam("year") String year, @RequestParam("gameType") char gameType, Model model) {
        model.addAttribute("year", year);
        model.addAttribute("gameType", gameType);

        Iterable<YearGameTypeGame> yearGameTypesGames = daoYearGameTypeGame.getYearGameTypeGamesData(Integer.parseInt(year), gameType);
        model.addAttribute("games", yearGameTypesGames);

        YearGameTypeGame yearGameTypeGame = yearGameTypesGames.iterator().next();
        model.addAttribute("gameTypeText", yearGameTypeGame.getGameTypeText());


        Iterable<YearGameTypePlayer> yearGameTypePlayers = daoYearGameTypePlayer.getYearGameTypePlayersData(Integer.parseInt(year), gameType);
        model.addAttribute("players", yearGameTypePlayers);

        return "queryGamePlayer";
    }

    @GetMapping(value = "playball/player")
    public String getPlayer(@RequestParam("year") String year, @RequestParam("playerId") String playerId, Model model) {
        Iterable<GamePlayer> gamesPlayer = dao.getGamesPlayers(Integer.parseInt(year), null, null, null, playerId);

        model.addAttribute("title", "Play Ball - Player");
        model.addAttribute("gamesPlayer", gamesPlayer);

        return "player";
    }

    @GetMapping(value = "playball/game")
    public String getGame(@RequestParam("year") String year, @RequestParam("gameId") String gameId, Model model) {
        Iterable<GamePlayer> gamesPlayer = dao.getGamesPlayers(Integer.parseInt(year), gameId, null, null, null);

        model.addAttribute("title", "Play Ball - Game");
        model.addAttribute("gamesPlayer", gamesPlayer);

        return "game";
    }

    @GetMapping(value = "playball/gamePlayer")
    public String getGamePlayer(@RequestParam("year") String year,
                                @RequestParam("gameId") String gameId,
                                @RequestParam("playerId") String playerId,
                                @RequestParam("option") String option,
                                Model model) {

        if (option.equals("game")) {
            Iterable<GamePlayer> gamesPlayer = dao.getGamesPlayers(Integer.parseInt(year), gameId, null, null, null);

            model.addAttribute("title", "Play Ball - Game");
            model.addAttribute("gamesPlayer", gamesPlayer);

            return "game";
        }
        else {
            Iterable<GamePlayer> gamesPlayer = dao.getGamesPlayers(Integer.parseInt(year), null, null, null, playerId);

            model.addAttribute("title", "Play Ball - Player");
            model.addAttribute("gamesPlayer", gamesPlayer);

            return "player";
        }
    }

}
